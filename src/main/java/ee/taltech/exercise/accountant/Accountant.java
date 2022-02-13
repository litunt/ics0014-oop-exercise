package ee.taltech.exercise.accountant;

import ee.taltech.exercise.company.Company;
import ee.taltech.exercise.enums.Department;
import ee.taltech.exercise.enums.Gender;

import java.util.HashMap;
import java.util.Map;

public class Accountant {

    private Company company;

    public Accountant(Company companyForAccountant) {
        this.company = companyForAccountant;
    }

    /**
     * Method should count and return the average salary of all company employees.
     */
    public double countAverageSalary() {
        return 0.0;
    }

    /**
     * Method should count and return the average salary of company employees from
     * certain department.
     */
    public double countAverageSalaryForDepartment(Department department) {
        return 0.0;
    }

    /**
     * Method should count and return the average salary of all company employees
     * of given gender.
     */
    public double countAverageSalaryByGender(Gender gender) {
        return 0.0;
    }

    /**
     * Method should count and return the average salary of company employees
     * from certain department of given gender.
     */
    public double countAverageSalaryByGenderAndDepartment(Gender gender, Department department) {
        return 0.0;
    }

    /**
     * Method should return the highest salary of company employees.
     */
    public int getMaxSalary() {
        return 0;
    }

    /**
     * Method should return the lowest salary of company employees.
     */
    public int getMinSalary() {
        return 0;
    }

    /**
     * Method should return the highest salary of company employees
     * from certain department.
     */
    public int getMaxSalaryOfDepartment(Department department) {
        return 0;
    }

    /**
     * Method should return the lowest salary of company employees
     * from certain department.
     */
    public int getMinSalaryOfDepartment(Department department) {
        return 0;
    }

    /**
     * Method should count and return the number of company employees of gender
     */
    public int getNumberOfEmployeesOfGender(Gender gender) {
        return 0;
    }

    /**
     * Method should count and return the number of company employees of gender
     * from certain department.
     */
    public int getNumberOfEmployeesOfGenderFromDepartment(Gender gender, Department department) {
        return 0;
    }

    /**
     * Method should count and return the number of company employees from each department.
     */
    public Map<Department, Integer> getNumberOfEmployeesForEachDepartment() {
        return new HashMap<>();
    }


}
