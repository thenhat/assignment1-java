package jv2_assignment5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class User {
    public void DangNhap() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/java_jdbc";
            Connection con = DriverManager.getConnection(url,"root","");
            Statement st = con.createStatement();
            System.out.println("Nhap Ten: ");
            Scanner sc = new Scanner(System.in);
            String username1 = sc.nextLine();

            System.out.println("Nhap Mat Khau: ");
            String password1 = sc.nextLine();

            String timten = "SELECT COUNT(*) FROM user WHERE username = \'" + username1 + "\' AND password = \'" + password1 + "\'";
            System.out.println(timten);
            ResultSet rs = st.executeQuery(timten);
            while (rs.next()) {
                if (rs.getInt(1) != 0) {
                    System.out.println("Thành Công");
                } else {
                    System.out.println("Không Hợp Lệ");
                }
            }

        } catch (Exception e) {

        }
    }

    public void DangKy() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/java_jdbc";
            Connection con = DriverManager.getConnection(url,"root","");
            Statement st = con.createStatement();

            System.out.println("Nhập Tài Khoản:");
            System.out.println("Nhập Tên: ");
            Scanner sc = new Scanner(System.in);
            String username1 = sc.nextLine();
            System.out.println("Nhập Email: ");
            String email1 = sc.nextLine();
            System.out.println("Nhập Mật Khẩu: ");
            String password1 = sc.nextLine();

            String check = "SELECT COUNT(*) FROM user where username = \'" + username1 + "\' OR email = \'" + email1 + "\'";
            ResultSet rs = st.executeQuery(check);
            while (rs.next()) {
                if (rs.getInt(1) > 0) {
                    System.out.println("Tên hoặc email đã tồn tại.");
                } else {
                    System.out.println("Đăng ký thành công");
                    String insert = "INSERT INTO user (username, email, password)"
                            + "VALUES (\'" + username1 + "\', \'" + email1 + "\', \'" + password1 + "\')";
                    st.executeUpdate(insert);
                }
            }
        } catch (Exception e) {

        }
    }
    public void DanhSach(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/java_jdbc";
            Connection con = DriverManager.getConnection(url,"root","");
            String sql = "SELECT * FROM user";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Username: " + rs.getString("username"));
                System.out.println("Email: " + rs.getString("email"));
            }

        } catch (Exception e){

        }
    }
}
