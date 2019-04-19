package session1;
import java.util.Scanner;

public class Demo {
    public static void main(String args[]){
        Human h= new Human();
        h.inputInfo();

        Human h2 = new Human();
        h2.age= h.age;
        h2.name= h.name;
        h2.sayhello();
    }
}
