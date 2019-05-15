package EXAM_JAVA1;

public class EmployeeFullTime extends SalaryPolicy {
    public float rate =(float) 4;

    @Override
    public float getSalary() {
        Salary = rate * baseSalary;
        return Salary;
    }
}

