package ee.taltech.exercise.accountant;

import ee.taltech.exercise.company.Company;
import ee.taltech.exercise.company.Employee;
import ee.taltech.exercise.generator.Generator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountantTest {

    //todo it's all you now :)

    private Accountant accountant;

    @BeforeEach
    void beforeEach() throws IOException, URISyntaxException {
        //for tests in real life one would do a small 2-5 person company
        List<Employee> employeeList = Generator.generateEmployees();
        Company company = new Company("MyCompany");
        company.addAllEmployees(employeeList);
        accountant = new Accountant(company);
    }

    @Test
    void countAverageSalary() {
        assertEquals(0, accountant.countAverageSalary());

        // we have assertJ library here :)
        assertThat(accountant.countAverageSalary()).isEqualTo(0.0);
        assertThat(accountant.countAverageSalary()).isZero();
    }
}
