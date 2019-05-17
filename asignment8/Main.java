package asignment8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KhachHangList lkh = new KhachHangList();
        Scanner scanner =new Scanner(System.in);
        int x;
        do {
            System.out.println("\t\t----------------------------------");
            System.out.println("\t\t|\t\t\t\tMENU\t\t\t |");
            System.out.println("\t\t----------------------------------");
            System.out.println("\t\t|0. Thoat ung dung");
            System.out.println("\t\t|1. Them Khach Hang Viet");
            System.out.println("\t\t|2. Them Khach Hang Nuoc Ngoai");
            System.out.println("\t\t|3. Hien Thi Danh Sach Khach Hang");
            System.out.println("\t\t|4. Xem Tong (KW)cua cac KH");
            System.out.println("\t\t|5. Xem TB Thanh Tien cua KH NN");
            System.out.println("\t\t----------------------------------");
            x = scanner.nextInt();
            System.out.println(" ");
            switch (x) {
                case 1:
                    lkh.ThemKH(1);
                    break;
                case 2:
                    lkh.ThemKH(2);
                    break;
                case 3:
                    lkh.HienThiKH();
                    break;
                case 4:
                    lkh.TongSL();
                    break;
                case 5:
                    lkh.TrungBinh();
                    break;
            }
        } while (x != 0);
        System.out.println(" ");
    }
}

