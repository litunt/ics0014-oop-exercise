package ee.taltech.exercise;

import ee.taltech.exercise.company.Company;
import ee.taltech.exercise.company.Employee;
import ee.taltech.exercise.generator.Generator;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            List<Employee> employeeList = Generator.generateEmployees();
            Company company = new Company("MyCompany");
            company.addAllEmployees(employeeList);

            // continue with Accountant methods
        } catch (IOException | URISyntaxException e) {
            System.out.println("...");
        }
    }
}
