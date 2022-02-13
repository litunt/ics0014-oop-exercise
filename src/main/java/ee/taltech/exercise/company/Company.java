package ee.taltech.exercise.company;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Employee> employees = new ArrayList<>();
    private String name;

    public Company(String companyName) {
        name = companyName;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void addAllEmployees(List<Employee> newEmployees) {
        employees.addAll(newEmployees);
    }
}
