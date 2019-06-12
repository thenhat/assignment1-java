package jv2_assignment6;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Edit implements Initializable {
    public TextField txtUser;
    public TextField txtEmail;
    public PasswordField txtPass;

    public static User userEdit;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtUser.setText(userEdit.getUsername());
        txtEmail.setText(userEdit.getEmail());
        txtPass.setText(userEdit.getPassword());
    }

    public void update() throws Exception{
        userEdit.username = txtUser.getText();
        userEdit.email = txtEmail.getText();
        userEdit.password = txtPass.getText();
        UserDao ud = UserDao.getInstance();
        ud.update(userEdit);
        if (!ud.update(userEdit)) {
            txtEmail.setText("This email or this username is selected. Please select other choices.");
        } else {
            Parent root = FXMLLoader.load(getClass().getResource("list.fxml"));
            Main.mainStage.getScene().setRoot(root);
        }

    }
    public void home() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Main.mainStage.getScene().setRoot(root);
    }
}