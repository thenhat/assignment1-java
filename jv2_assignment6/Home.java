package jv2_assignment6;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class Home {
    public void goToLogin() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Main.mainStage.getScene().setRoot(root);
    }
    public void goToRegister() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Register.fxml"));
        Main.mainStage.getScene().setRoot(root);
    }
    public void goToList() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("List.fxml"));
        Main.mainStage.getScene().setRoot(root);
    }
    public void Exit(){
        Platform.exit();
    }
}
