package org.ddamme.service; // The package should reflect your project structure

import org.ddamme.model.Employee;
import org.ddamme.model.Employees;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeManager {
    private static final List<Employee> employeeList = new ArrayList<>(
            Arrays.asList(
                    new Employee("1", "Alice", "Smith", "alice.smith@company.com", "Software Engineer"),
                    new Employee("2", "Bob", "Jones", "bob.jones@company.com", "Project Manager"),
                    new Employee("3", "Charlie", "Brown", "charlie.brown@company.com", "Data Analyst"),
                    new Employee("4", "Diana", "Prince", "diana.prince@company.com", "UX Designer")
            )
    );

    public static void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public static List<Employee> getEmployees() {
        return employeeList;
    }
}
