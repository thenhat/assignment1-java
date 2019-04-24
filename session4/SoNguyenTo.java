package session4;

public class SoNguyenTo {
    int a;

    public int getA(int a) {
        return a;
    }

    public SoNguyenTo(int x){

        System.out.println("Vua tao 1 doi tuowng so nguyen to");
        setA(x);
    }
    public void setA(int a) {
        if (isSoNguyenTo(a)) {
            this.a = a;
            System.out.println("a la so nguyen to");
            timSoNguyenToTiepTheo();
        } else {
            System.out.println("khong set");
        }
    }

    public boolean isSoNguyenTo(int x) {

        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                return false;
            }

        }
        return true;
    }

    public int timSoNguyenToTiepTheo() {
        while (isSoNguyenTo(a)) {
            int dem = 0;
            a = a + 1;
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    dem++;
                }
            }
            if (dem == 2) {
                System.out.println("so nguyen to lien sau a la:" + a);
                break;
            }
        }
        return 12;
    }
}
