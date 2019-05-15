package EXAM_JAVA1;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        EmployeeFullTime fulltime =new EmployeeFullTime();
        EmployeePartime partime =new EmployeePartime();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input baseSalary EmployeeFullTime:");
        fulltime.baseSalary =scanner.nextFloat();

        System.out.println("Input baseSalary EmployeePartime:");
        partime.baseSalary =scanner.nextFloat();

        System.out.println("Salary EmployeeFulltime: "+fulltime.getSalary());
        System.out.println("Salary EmployeeParttime: "+partime.getSalary());
    }
}