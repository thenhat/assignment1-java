package Address_Book;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Contact {
    public String name;
    public String phone;

    HashMap<String,String> hashMapBook =new HashMap<>();

    public Contact(){

    }

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void add(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("add name:");
        name=scanner.nextLine();
        System.out.println("add phone");
        phone =scanner.nextLine();

        hashMapBook.put(name,phone);
    }

    public void find(){
        Scanner scanner = new Scanner(System.in);
        String findname;
        System.out.println("Enter the name you want to find: ");
        findname = scanner.nextLine();
        hashMapBook.forEach((keyStr, valStr) -> {
            if (hashMapBook.containsKey(findname)) {
                System.out.println("Add Book Find : ");
                System.out.println("-----------------------------");
                System.out.println("Contact Name  |   Phone number ");
                System.out.println(keyStr + "    |   "+valStr);
                System.out.println("-----------------------------");
            }else System.out.println("Not found!");
        });

    }

    public void display() {
        System.out.println("     Address Book");
        System.out.println("-----------------------------");
        System.out.println("Contact Name   |    Phone number");
        hashMapBook.forEach((keyStr,valStr)-> {
            System.out.println(keyStr +  "     |     "
                    + valStr);
        });
        System.out.println("-----------------------------");

    }
}
