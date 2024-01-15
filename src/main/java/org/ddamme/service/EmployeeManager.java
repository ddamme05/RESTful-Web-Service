package org.ddamme.service;

import org.ddamme.model.Employee;
import org.ddamme.model.Employees;

import java.util.Arrays;

public class EmployeeManager {
    private static final Employees employees;

    static {
        employees = new Employees(Arrays.asList(
                new Employee("1", "Alice", "Smith", "alice.smith@company.com", "Software Engineer"),
                new Employee("2", "Bob", "Jones", "bob.jones@company.com", "Project Manager"),
                new Employee("3", "Charlie", "Brown", "charlie.brown@company.com", "Data Analyst"),
                new Employee("4", "Diana", "Prince", "diana.prince@company.com", "UX Designer")
        ));
    }

    public static Employees getEmployees() {
        return employees;
    }
}
