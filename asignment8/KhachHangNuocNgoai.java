package asignment8;

import java.util.Scanner;

class KhachHangNuocNgoai extends KhachHang {
    public String QuocTich;

    public KhachHangNuocNgoai() {
        super();
        this.QuocTich = "";
    }

    public KhachHangNuocNgoai(int ma, double dgia, String ngay, String hoten, int sl, double ttien, String qt) {
        super(ma, dgia, ngay, hoten, sl, ttien);
        this.QuocTich = qt;
    }

    public String getQuocTich() {
        return QuocTich;
    }

    public void setQuocTich(String quocTich) {
        QuocTich = quocTich;
    }

    public void nhap() {
        super.nhap();
        Scanner scanner =new Scanner(System.in);
        System.out.println("Quoc Tich: ");
        QuocTich = scanner.next();
    }

    public double TTien() {
        this.DonGia=2000;
        return this.ThanhTien = this.SoLuong * this.DonGia;
    }

    public void xuat12019(){

    }

    public String toString() {
        return "Khach Hang Nuoc Ngoai: " + super.toString() + ", QuocTich: " + QuocTich + ", ThanhTien: " + ThanhTien;
    }
}

