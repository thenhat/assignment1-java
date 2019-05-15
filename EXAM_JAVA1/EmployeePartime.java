package EXAM_JAVA1;

public class EmployeePartime extends SalaryPolicy {
    public float rate =(float) 2.5;

    @Override
    public float getSalary() {
        Salary = rate * baseSalary;
        return Salary;
    }
}
