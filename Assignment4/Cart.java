package Assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {

    public int id;
    public String customer;
    public double grandTotal;
    public ArrayList<String> productList = new ArrayList<>();
    public String city;
    public String x;

    public Cart() {

    }

    public void insertCart() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Them san pham vao gio hang:");
        x = scanner.nextLine();

        productList.add(x);
    }

    public void deleteCart() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("san pham muon xoa khoi gio hang:");
        x = scanner.nextLine();

        for (String pl :productList) {
            if (pl.equals(x)) {
                productList.remove(pl);
            }
        }
    }

    public double grandTotal() {
        if (city == "HaNoi" || city == "HCM") {
            grandTotal = grandTotal+(0.01*grandTotal);
        }else {
            grandTotal = grandTotal+(0.02*grandTotal);
        }
        return 0;
    }
}
