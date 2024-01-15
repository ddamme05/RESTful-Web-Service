package controllerTest;

import org.ddamme.controller.EmployeeController;
import org.ddamme.model.Employee;
import org.ddamme.service.EmployeeManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedStatic;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.mockStatic;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
public class EmployeeControllerTest {

    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(new EmployeeController()).build();
    }

    @Test
    public void testGetAllEmployees() throws Exception {
        try (MockedStatic<EmployeeManager> mocked = mockStatic(EmployeeManager.class)) {
            List<Employee> employees = Arrays.asList(
                    new Employee("1", "John", "Doe", "john.doe@example.com", "Developer"),
                    new Employee("2", "Jane", "Doe", "jane.doe@example.com", "Manager")
            );
            mocked.when(EmployeeManager::getEmployees).thenReturn(employees);

            mockMvc.perform(get("/employees"))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$[0].employeeId").value("1"))
                    .andExpect(jsonPath("$[0].firstName").value("John"))
                    .andExpect(jsonPath("$[1].employeeId").value("2"))
                    .andExpect(jsonPath("$[1].firstName").value("Jane"));
        }
    }
}
