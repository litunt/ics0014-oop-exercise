package ee.taltech.exercise.generator;

import ee.taltech.exercise.company.Employee;
import ee.taltech.exercise.enums.Department;
import ee.taltech.exercise.enums.Gender;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

public class Generator {

    private static final String PATH_TO_FILE = "employees.csv";

    public static List<Employee> generateEmployees() throws IOException, URISyntaxException {
        List<Employee> employees = new ArrayList<>();
        File file = new File(Generator.class.getClassLoader().getResource(PATH_TO_FILE).toURI());
        try (BufferedReader csvReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = csvReader.readLine()) != null) {
                String[] data = line.split(",");

                Employee employee = new Employee();
                employee.setId(parseInt(data[0]));
                employee.setFirstName(data[1]);
                employee.setLastName(data[2]);
                employee.setEmail(data[3]);
                employee.setDepartment(Department.fromString(data[4]));
                employee.setSalary(parseLong(data[5]));
                employee.setGender(Gender.valueOf(data[6]));

                employees.add(employee);
            }
        }
        return employees;
    }
}
