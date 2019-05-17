package Assignment5;

import java.util.Scanner;

public class Person {
    public String Ten;
    public String GioiTinh;
    public String NgaySinh;
    public String Diachi;

    public Person(){

    }
    public Person(String ten, String gioiTinh, String ngaySinh, String diachi) {
        Ten = ten;
        GioiTinh = gioiTinh;
        NgaySinh = ngaySinh;
        Diachi = diachi;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ten:");
        Ten= scanner.nextLine();
        System.out.println("Gioi tinh:");
        GioiTinh= scanner.nextLine();
        System.out.println("Ngay sinh:");
        NgaySinh= scanner.nextLine();
        System.out.println("Dia chi:");
        Diachi= scanner.nextLine();
    }

    public void showInfo(){
        System.out.println("Ten:"+Ten);
        System.out.println("Gioi tinh:"+GioiTinh);
        System.out.println("Ngay sinh:"+NgaySinh);
        System.out.println("Dia chi:"+Diachi);
    }
}
