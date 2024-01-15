package org.ddamme.controller;

import org.ddamme.service.EmployeeManager;
import org.ddamme.model.Employees;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public Employees getAllEmployees() {
        return EmployeeManager.getEmployees();
    }
}
