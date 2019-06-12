package jv2_assignment5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/java_jdbc";
            Connection con = DriverManager.getConnection(url,"root","");
            Statement st = con.createStatement();
            User u = new User();
            System.out.println("-----MENU-----");
            System.out.println("1. Đăng Nhập");
            System.out.println("2. Đăng Ký");
            System.out.println("3. Xem Danh Sách");
            System.out.println("4. Thoát");
            System.out.println("---------------");
            while (true) {
                Scanner sc = new Scanner(System.in);
                int choice = sc.nextInt();
                if (choice == 1) {
                    u.DangNhap();
                    sc.nextLine();
                } else if (choice == 2) {
                    u.DangKy();
                    sc.nextLine();
                } else if (choice == 3) {
                    u.DanhSach();
                    sc.nextLine();
                } else if (choice == 4) {
                    System.exit(4);
                } else {
                    System.out.println("Nhập lại");
                }
            }
        } catch (Exception e) {}
    }

}
