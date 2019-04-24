package session6;
import java.util.Scanner;

public class PhanSo {
    public float tuso;
    public float mauso;
    public float a;
    public float b;


    public PhanSo(){

    }

    public float getMauso() {
        return mauso;
    }

    public float getTuso() {
        return tuso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public void setMauso(int mauso) {
        this.mauso = mauso;
    }

    public PhanSo(int tuso, int mauso){
        this.tuso=tuso;
        this.mauso=mauso;
    }

    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap tu so");
        tuso =scanner.nextInt();

        System.out.println("nhap msu so:");
        mauso =scanner.nextInt();
    }

    public void In(){
        if(mauso != 0){
            System.out.println("Phan so la: "+ tuso+"/"+mauso);
        }else {
            System.out.println("Khong ton tai phan so");
        }
    }

    public float RutGon(){
        for (int i=1;i<=mauso;i++){
            if(tuso%i == 0 & mauso%i== 0){
                a= (tuso/i);
                b=(mauso/i);
            }
        }
        System.out.println("phan so rut gon la"+a+"/"+b);
        return 1;
    }

    public float NghichDao(){
        if (tuso!=0){
            System.out.println("Phan so nghich dao la" +mauso+"/"+tuso);
        }else {
            System.out.println("Phan so nghich dao khong ton tai");
        }
        return 1;
    }
}
