package modelTest;

import org.ddamme.model.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void testEmployeeGettersAndSetters() {
        String id = "1";
        String firstName = "John";
        String lastName = "Doe";
        String email = "john.doe@example.com";
        String title = "Developer";

        Employee employee = new Employee(id, firstName, lastName, email, title);
        employee.setEmployeeId(id);
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setEmail(email);
        employee.setTitle(title);

        Assertions.assertEquals(id, employee.getEmployeeId(), "Employee ID should match the set value.");
        Assertions.assertEquals(firstName, employee.getFirstName(), "First name should match the set value.");
        Assertions.assertEquals(lastName, employee.getLastName(), "Last name should match the set value.");
        Assertions.assertEquals(email, employee.getEmail(), "Email should match the set value.");
        Assertions.assertEquals(title, employee.getTitle(), "Title should match the set value.");
    }
}
