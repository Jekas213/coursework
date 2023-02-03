import java.util.Objects;

public class Employee {
    private String fullName;
    private int salary;
    private int department;
    private static int ids = 10;
    private int id;

    public Employee(String fullName, int salary, int department) {
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
        id = ids++;

    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "ФИО: " + fullName + ", зарплата: " + salary + ", департамент: " + department + ", id: " + id;
    }

}
