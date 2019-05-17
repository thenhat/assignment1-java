package Assignment7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MeNu menu = new MeNu();
        SinhVien sinhvien = new SinhVien();
        while (true) {
            menu.Menu();
            String n = scanner.nextLine();
            switch (n) {
                case "1":
                    sinhvien.addStudent();
                    break;
                case "2":
                    sinhvien.editStudent();
                    break;
                case "3":
                    sinhvien.deleteStudent();
                    break;
                case "4":
                    sinhvien.sortStudentByGpa();
                    break;
                case "5":
                    sinhvien.sortStudentByName();
                    break;
                case "6":
                    sinhvien.showStudent();
                    break;
                case "0":
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("n invalid!");
                    break;
            }
            if (n.equals("0")) break;
        }
    }
}
