package session1;
import java.util.Scanner;

public class Human {
    public String name;
    public int age;
    public String country;

    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten:");
        name =scanner.nextLine();

        System.out.println("tuoi:");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("country");
        country = scanner.nextLine();
    }
    public void sayhello(){
        System.out.println("hello: " +name);
        System.out.println("age: " +age);
        System.out.println("country: " +country);

    }
}
