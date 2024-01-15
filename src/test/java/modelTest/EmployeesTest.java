package modelTest;

import org.ddamme.model.Employee;
import org.ddamme.model.Employees;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeesTest {

    private Employees employees;
    private Employee employee1;
    private Employee employee2;

    @BeforeEach
    public void setUp() {
        employee1 = new Employee("1", "John", "Doe", "john.doe@example.com", "Developer");
        employee2 = new Employee("2", "Jane", "Roe", "jane.roe@example.com", "Manager");
        List<Employee> employeeList = new ArrayList<>(Arrays.asList(employee1, employee2));
        employees = new Employees(employeeList);
    }

    @Test
    public void testGetEmployeeList() {
        List<Employee> employeeList = employees.getEmployeeList();
        Assertions.assertNotNull(employeeList, "Employee list should not be null.");
        Assertions.assertEquals(2, employeeList.size(), "Employee list should contain two employees.");
        Assertions.assertTrue(employeeList.contains(employee1), "Employee list should contain employee1.");
        Assertions.assertTrue(employeeList.contains(employee2), "Employee list should contain employee2.");
    }

    @Test
    public void testSetEmployeeList() {
        Employee employee3 = new Employee("3", "Jim", "Bean", "jim.bean@example.com", "Intern");
        List<Employee> newEmployeeList = new ArrayList<>(List.of(employee3));
        employees.setEmployeeList(newEmployeeList);

        List<Employee> employeeList = employees.getEmployeeList();
        Assertions.assertNotNull(employeeList, "Employee list should not be null after setting a new list.");
        Assertions.assertEquals(1, employeeList.size(), "Employee list should contain one employee after setting a new list.");
        Assertions.assertTrue(employeeList.contains(employee3), "Employee list should contain the new employee3.");
    }
}
