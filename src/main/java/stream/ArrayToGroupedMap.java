package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayToGroupedMap {
    public static Map<String, List<Employee>> groupByJobTitle(List<Employee> employeeList) {
        Map<String, List<Employee>> resultMap = new HashMap<>();
        for (int i = 0; i < employeeList.size(); i++) {
            Employee employee = employeeList.get(i);
            List<Employee> employeeSubList = resultMap.getOrDefault(employee.getTitle(), new ArrayList<Employee>());
            employeeSubList.add(employee);
            resultMap.put(employee.getTitle(), employeeSubList);
        }
        return resultMap;
    }

    public static Map<String, List<Employee>> groupByJobTitle2(List<Employee> employeeList) {
        return employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getTitle));
    }

    public static Map<String, Employee> groupByJobTitle3(List<Employee> employeeList) {
        return employeeList.stream()
                .collect(Collectors.toMap(Employee::getTitle, Function.identity()));
    }

    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getEmployeeList();

        System.out.println(groupByJobTitle(employeeList));
        System.out.println(groupByJobTitle2(employeeList));
    }
}
