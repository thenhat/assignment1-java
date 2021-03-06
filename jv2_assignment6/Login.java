package jv2_assignment6;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Login {
    public TextField txtUser;
    public TextField txtEmail;
    public PasswordField txtPass;

    public void Login(){
        String username = txtUser.getText();
        String password = txtPass.getText();

        String sql = "INSERT INTO user_db (username,password) " +
                " VALUES('"+username+"','"+password+"')";
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/java_jdbc";
            Connection con = DriverManager.getConnection(url,"root","");

            Statement st = con.createStatement();
            int number = st.executeUpdate(sql);
            if(number>0){
                goToList();
            }
        }catch (Exception e){

        }

    }

    public void goToList() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("List.fxml"));
        Main.mainStage.getScene().setRoot(root);
    }
    public void goToRegister() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Register.fxml"));
        Main.mainStage.getScene().setRoot(root);
    }
    public void goToHome() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("ss6_1.fxml"));
        Main.mainStage.getScene().setRoot(root);
    }
}
