package jv2_session2.Student_FX;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.*;


public class StudentController {
    public TextField txtName;
    public DatePicker txtBD;
    public TextField txtClassName;
    public TextField txtID;
    public Text txtSuccess;
    public Text txtFail;

    public void submit() {
        boolean stop=false;
        if(txtName.getText().isEmpty() || txtBD.getValue() == null || txtID.getText().isEmpty() || txtClassName.getText().isEmpty()){
            stop = true;
            changeNotice(false);
        }
        String str = txtName.getText() + " " + txtBD.getValue() + " " + txtClassName.getText() + " " + txtID.getText();
        File f = new File("data.txt");
        if (f.canRead() && f.canWrite()&& !stop) {
            try {
                String output = "";
                FileInputStream fis = new FileInputStream(f);
                DataInputStream dis = new DataInputStream(fis);
                String Line;
                while ((Line = dis.readLine()) != null) {
                    output += Line + "\n";
                }
                dis.close();
                fis.close();

                output += str;

                FileOutputStream fos = new FileOutputStream(f);
                DataOutputStream dos = new DataOutputStream(fos);
                dos.writeBytes(output);
                dos.close();
                fos.close();

                txtName.setText("");
                txtBD.setValue(null);
                txtClassName.setText("");
                txtID.setText("");

                changeNotice(true);

            } catch (Exception e) {
                changeNotice(false);
            }
        }
    }

    public void changeNotice(boolean flag){
        if(flag){
            txtSuccess.setVisible(true);
            txtFail.setVisible(false);
        }else {
            txtSuccess.setVisible(false);
            txtFail.setVisible(true);
        }
    }
    public void toList() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("StudentList.fxml"));
        StudentFX.mainStage.setScene(new Scene(root, 470, 500));
    }
}
