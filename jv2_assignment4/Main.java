package jv2_assignment4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("demnguoc.fxml"));
        primaryStage.setTitle("DEM GIO");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }
}
