package jv2_session2.Student_FX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StudentFX extends Application {
    public static Stage mainStage;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        mainStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("StudentFX.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 470, 500));
        primaryStage.show();
    }
}
