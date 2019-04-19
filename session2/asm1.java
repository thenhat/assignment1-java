package session2;

import java.util.Scanner;

public class asm1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        System.out.println("nhap vao so n:");
        int n = scanner.nextInt();
        System.out.printf("Tất cả các số nguyên tố nhỏ hơn %d là: \n", n);
        int dem=0;

        for (int i=2;i<=n;i++)
        {
            for ( int j=1;j<=i;j++)
            {
                if(i % j==0)
                dem++;
            }
            if(dem==2)
                System.out.println(i);
            dem=0;
        }

    }
}
