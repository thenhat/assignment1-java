package session5;
import java.util.Scanner;

public class TamGiac {
    public int Canh1;
    public int Canh2;
    public int Canh3;

    public TamGiac(){}

    public TamGiac(int Canh1, int Canh2,int Canh3){
        this.Canh1=Canh1;
        this.Canh2=Canh2;
        this.Canh3=Canh3;
    }

    public void KiemTra(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap canh1:");
        Canh1 =scanner.nextInt();

        System.out.println("nhap canh2:");
        Canh2 =scanner.nextInt();
        System.out.println("nhap canh3:");
        Canh3 =scanner.nextInt();
        if(Canh1<Canh2+Canh3 && Canh2<Canh1+Canh3 && Canh3 < Canh1 +Canh2){
            System.out.println("La 3 canh tam giac");
            chuvi();
            dientich();
        }else {
            System.out.println("Ko la 3 canh tam giac");
        }
    }
    public int chuvi(){
      int C =Canh1+Canh2+Canh3;
        System.out.println("chu vi tam giac: "+C);


        return C;
    }
    public double dientich(){
        float p=(Canh1+Canh2+Canh3)/2;
        double S=Math.sqrt(p*(p-Canh1)*(p-Canh2)*(p-Canh3));
        System.out.println("dien tich tam giac: "+S);

        return S;
    }
}
