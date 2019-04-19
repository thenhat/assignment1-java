package session3;
import java.util.Scanner;

public class HinhChuNhat {

        public double Canh1;
        public double Canh2;




    public void nhap(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhap canh1:");
            Canh1 =scanner.nextDouble();

            System.out.println("nhap canh2:");
            Canh2 =scanner.nextDouble();


        }
        public double tinhchuvi(){

            System.out.println("Chu Vi: " +(Canh1+Canh2)*2);
            return (Canh1+Canh2)*2;
        }
        public double tinhdientich(){

            System.out.println("Dien Tich: " +(Canh1*Canh2));
            return (Canh1*Canh2);
        }

    }

