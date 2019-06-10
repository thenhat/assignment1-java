package Address_Book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contact adb = new Contact();
        Scanner scanner = new Scanner(System.in);
        int x;
        do {
            System.out.println("\t\t----------------------------------");
            System.out.println("\t\t|\t\t\t\tMENU\t\t\t |");
            System.out.println("\t\t----------------------------------");
            System.out.println("\t\t|1. Add new contact");
            System.out.println("\t\t|2. Find a contact by name");
            System.out.println("\t\t|3. Display contacts");
            System.out.println("\t\t|4. Exit");
            System.out.println("\t\t----------------------------------");
            x = scanner.nextInt();
            System.out.println(" ");
            switch (x) {
                case 1:
                    adb.add();
                    break;
                case 2:
                    adb.find();
                    break;
                case 3:
                    adb.display();
                    break;
                case 4:
                    System.exit(4);
                    break;
            }
        } while (x != 0);
    }
}

