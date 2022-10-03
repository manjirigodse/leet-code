package stream;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int id;
    private int salary;
    private String title;
    private String name;

    public Employee(int id, String title, String name, int salary) {
        this.id = id;
        this.title = title;
        this.name = name;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public int getSalary() {
        return salary;
    }

    public static List<Employee> getEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1,"Manager", "Ulhas", 10));
        employeeList.add(new Employee(2,"Dev", "Ritesh", 100));
        employeeList.add(new Employee(3,"QA", "Manjiri", 50));
        employeeList.add(new Employee(4,"Manager", "Atharva",2));
        employeeList.add(new Employee(5,"Dev", "Suvarna", 5));
        employeeList.add(new Employee(6,"Dev", "Atmaram", 20));

        return employeeList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
