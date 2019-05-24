package jv2_assignment3;

public class DemGio implements Runnable {
    public void run(){
        while (true) {
            for (int i = 10; i >= 0; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (Exception E) {
                }
            }
            System.out.println("Chuc mung");
            try {
                Thread.sleep(1000);
            } catch (Exception E) {
            }
        }
    }
}
