package Assignment7;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class SinhVien {
    public Scanner scanner = new Scanner(System.in);
    public ArrayList<ArrStudent> StudentList = new ArrayList<>();

    public int findById(String id) {
        for (int i = 0; i < StudentList.size(); i++) {
            if (StudentList.get(i).getId().equals(id)) return i;
        }
        return -1;
    }

    public ArrStudent inputStudent(){
        System.out.println("id: ");
        String id = scanner.nextLine();
        while (true) {
            if (findById(id) < 0) {
                break;
            } else {
                System.err.println("Err: Id already exists!");
            }
            id = scanner.nextLine();
        }
        System.out.println("name: ");
        String name = scanner.nextLine();
        System.out.println("age: ");
        int age;
        while (true) {
            try {
                age = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (Exception e) {
                System.err.println("Err: input invalid.");
            }
        }
        System.out.println("address: ");
        String address = scanner.nextLine();
        System.out.println("gpa: ");
        float gpa;
        while (true) {
            try {
                gpa = scanner.nextFloat();
                scanner.nextLine();
                break;
            } catch (Exception e) {
                System.err.println("Err: input invalid.");
            }
        }
        return new ArrStudent(id, name, age, address, gpa);
    }

    public void addStudent() {
        System.out.println("------ ADD STUDENT ------");
        ArrStudent student = inputStudent();
        System.out.println("------------------------");
        if (StudentList.add(student)) {
            System.out.println("Add success!");
        } else {
            System.err.println("Add error! Please try again.");
        }
        System.out.println("------------------------");
    }

    public void editStudent() {
        System.out.println("------ EDIT STUDENT ------");
        System.out.println("edit student id");
        String id = scanner.nextLine();
        int result = findById(id);
        if (result==-1){
            System.err.println("Err: Student id not found!");
        }else {
            ArrStudent student = inputStudent();
            System.out.println("--------------------------");
            StudentList.add(result, student);
            System.out.println("------------------------");
        }
    }

    public void deleteStudent() {
        System.out.println("------ DELETE STUDENT ------");
        System.out.println("delete student id");
        String id = scanner.nextLine();
        int result = findById(id);
        if (result==-1){
            System.err.println("Err: Student id not found!");
        }else {
            ArrStudent student = StudentList.get(result);
            System.out.printf("|%15s|%15s|%15s|%15s|%15s|\n", "Id", "Name", "Age", "Address", "Gpa");
            System.out.printf("|%15s|%15s|%15d|%15s|%15.2f|\n", student.getId(), student.getName(), student.getAge(), student.getAddress(), student.getGpa());
            System.out.println("Delete (Y/N)");
            String choice = scanner.nextLine();
            while (true) {
                if (choice.equalsIgnoreCase("y")){
                    StudentList.remove(result);
                    break;
                } else if (choice.equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.err.println("Err: Please choice Y/N!");
                }
            }
        }
        System.out.println("------------------------");
    }

    public void sortStudentByGpa() {
        StudentList.sort((o1, o2) -> {
            return (int) (o1.getGpa() - o2.getGpa());
        });

        System.out.println("- SHOW STUDENT SORT BY GPA -\n");
        System.out.printf("|%15s|%15s|%15s|%15s|%15s|\n", "Id", "Name", "Age", "Address", "Gpa");
        for (ArrStudent student : StudentList) {
            System.out.printf("|%15s|%15s|%15d|%15s|%15.2f|\n", student.getId(), student.getName(), student.getAge(), student.getAddress(), student.getGpa());
        }
        System.out.println("------------------------");
    }

    public void sortStudentByName() {
        StudentList.sort(new Comparator<ArrStudent>() {
            @Override
            public int compare(ArrStudent o1, ArrStudent o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("- SHOW STUDENT SORT BY NAME -\n");
        System.out.printf("|%15s|%15s|%15s|%15s|%15s|\n", "Id", "Name", "Age", "Address", "Gpa");
        for (ArrStudent student : StudentList) {
            System.out.printf("|%15s|%15s|%15d|%15s|%15.2f|\n", student.getId(), student.getName(), student.getAge(), student.getAddress(), student.getGpa());
        }
        System.out.println("------------------------");
    }

    public void showStudent() {
        System.out.println("----- SHOW STUDENT ------\n");
        System.out.printf("|%15s|%15s|%15s|%15s|%15s|\n", "Id", "Name", "Age", "Address", "Gpa");
        for (ArrStudent student : StudentList) {
            System.out.printf("|%15s|%15s|%15d|%15s|%15.2f|\n", student.getId(), student.getName(), student.getAge(), student.getAddress(), student.getGpa());
        }
        System.out.println("------------------------");
    }
}