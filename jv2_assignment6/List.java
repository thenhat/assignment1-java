package jv2_assignment6;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class List implements Initializable {


    public TableView<User> tbView;

    public TableColumn<User,Integer> colID;
    public TableColumn<User,String> colUser;
    public TableColumn<User,String> colEmail;
    public TableColumn<User,String> colPass;
    public TableColumn<User, Button> colEdit;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colID.setCellValueFactory(new PropertyValueFactory<>("id"));
        colUser.setCellValueFactory(new PropertyValueFactory<>("username"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colPass.setCellValueFactory(new PropertyValueFactory<>("password"));
        colEdit.setCellValueFactory(new PropertyValueFactory<>("edit"));
        String sql = "SELECT * FROM user_db";
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/java_jdbc";
            Connection con = DriverManager.getConnection(url,"root","");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            ObservableList<User> list = FXCollections.observableArrayList();

            while (rs.next()){
                Integer id = rs.getInt("ID");
                String username = rs.getString("Username");
                String email = rs.getString("Email");
                String password = rs.getString("Password");

                User u = new User(id,username,email,password);
                list.add(u);
                u.updateButton();
            }

            tbView.setItems(list);

        }catch (Exception e){

        }
    }

    public void goToHome() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("ss6_1.fxml"));
        Main.mainStage.getScene().setRoot(root);
    }
    public void goToRegister() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Register.fxml"));
        Main.mainStage.getScene().setRoot(root);
    }
}
