package stream;

import java.util.List;

public class AverageSalary {
    public static double calculateAverage(List<Employee> employeeList) {
        return employeeList.stream()
                .mapToInt(Employee::getSalary)
                .average()
                .getAsDouble();
    }

    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getEmployeeList();

        System.out.println(calculateAverage(employeeList));
    }
}
