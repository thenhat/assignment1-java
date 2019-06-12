package jv2_asm3;

import java.util.Scanner;

public class subThread extends Thread{
    public boolean isNguyenTo(int n){
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt((float)n); i++) {
            if (n % i  == 0) {
                return false;
            }
            return true;
        }
        return true;

    }
    @Override
    public void run(){
        Scanner in = new  Scanner (System.in);
        System.out.println("Nhap so : ");
        int a = in.nextInt();
        int dem = 0;
        System.out.print(a);
        while (true) {
            for (int i = a; true; i++) {
                if (isNguyenTo(i) == true) {
                    System.out.print("->" + i);
                    dem++;
                    if (dem == 10) {
                        System.out.println();
                        dem = 0;
                    }


                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }
            }
        }
    }
}
