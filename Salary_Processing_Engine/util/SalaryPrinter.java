package util;
import  model.Employee;
import service.SalaryService;

public class SalaryPrinter {
    public static void printSalaryDetails(Employee employee, SalaryService salaryService) {
        double grossSalary = salaryService.calculateGrossSalary(employee);
        double tax = salaryService.calculateTax(grossSalary);
        double finalSalary = salaryService.calculateFinalSalary(employee);
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Base Salary: " + employee.getBaseSalary());
        System.out.println("Years of Experience: " + employee.getYearsOfExperience());
        System.out.println("Overtime Hours: " + employee.getOverTimeHours());
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Tax: " + tax);

        //Call Salary Service to print salary details
        System.out.println("Final Salary: " + finalSalary);
    }
}