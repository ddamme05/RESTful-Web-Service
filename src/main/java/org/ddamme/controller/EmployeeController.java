package org.ddamme.controller;

import org.ddamme.service.EmployeeManager;
import org.ddamme.model.Employee;
import org.ddamme.model.Employees;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public Employees getAllEmployees() {
        return EmployeeManager.getEmployees();
    }

    @PostMapping("/employees")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        EmployeeManager.addEmployee(employee);
        return ResponseEntity.ok(employee);
    }
}
