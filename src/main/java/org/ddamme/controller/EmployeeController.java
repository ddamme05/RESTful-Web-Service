package org.ddamme.controller;

import org.ddamme.service.EmployeeManager;
import org.ddamme.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return EmployeeManager.getEmployees();
    }

    @PostMapping("/employees")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        EmployeeManager.addEmployee(employee);
        return ResponseEntity.ok(employee);
    }
}
