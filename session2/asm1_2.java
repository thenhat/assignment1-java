package session2;

import java.util.Scanner;

public class asm1_2{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        System.out.println("nhap vao so n:");
        int n = scanner.nextInt();
        System.out.println("tong n so fibonacci dau tien: ");
        int tong=0;
        for (int i = 0; i < n; i++) {
            tong= tong +fibonacci(i);
        }
        System.out.println(tong);

    }
    public static int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;

        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }

}
