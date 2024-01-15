package org.ddamme.controller;

import org.ddamme.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class EmployeeController {
    private static final List<Employee> EMPLOYEES = createEmployeeList();

    private static List<Employee> createEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("1", "John", "Doe", "john.doe@example.com", "Developer"));
        employees.add(new Employee("2", "Jane", "Doe", "jane.doe@example.com", "Manager"));
        return employees;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return EMPLOYEES;
    }
}
