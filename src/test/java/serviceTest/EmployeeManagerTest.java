package serviceTest;

import org.ddamme.model.Employee;
import org.ddamme.service.EmployeeManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class EmployeeManagerTest {

    @BeforeEach
    public void setUp() {
        EmployeeManager.getEmployees().clear();

        EmployeeManager.addEmployee(new Employee("1", "Alice", "Smith", "alice.smith@company.com", "Software Engineer"));
        EmployeeManager.addEmployee(new Employee("2", "Bob", "Jones", "bob.jones@company.com", "Project Manager"));
    }

    @Test
    public void testAddEmployee() {
        Employee newEmployee = new Employee("3", "Charlie", "Brown", "charlie.brown@company.com", "Data Analyst");
        EmployeeManager.addEmployee(newEmployee);

        List<Employee> employees = EmployeeManager.getEmployees();
        Assertions.assertTrue(employees.contains(newEmployee), "The new employee should be added to the list.");
        Assertions.assertEquals(3, employees.size(), "The employee list size should be incremented.");
    }

    @Test
    public void testGetEmployees() {
        List<Employee> employees = EmployeeManager.getEmployees();
        Assertions.assertEquals(2, employees.size(), "Initially, the employee list should contain two employees.");
        Assertions.assertEquals("Alice", employees.get(0).getFirstName(), "The first employee's first name should be Alice.");
        Assertions.assertEquals("Bob", employees.get(1).getFirstName(), "The second employee's first name should be Bob.");
    }
}
