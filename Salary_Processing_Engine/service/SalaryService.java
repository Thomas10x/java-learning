package service;
import model.Employee;
/*SalaryService responsibilities:
1. calculateGrossSalary(Employee): Calculates the gross salary based on base salary, years of experience, and overtime hours. 
2. calculateTax(double grossSalary): Calculates the tax amount based on the gross salary using a progressive tax system. 
3. calculateFinalSalary(Employee): Combines the gross salary and tax calculations to determine the final salary for the employee. 
Note: The service should not handle any printing or user interaction; it should solely focus on the business logic of salary calculations.
*/
public class SalaryService {
    //Constants for salary calculation
    private static final double EXPERIENCE_BONUS_RATE = 0.10; // 10% OF BASE SALARY
    private static final double DEPARTMENT_BONUS_RATE = 0.05; // 5% OF BASE SALARY
    private static final double OVERTIME_PAY_RATE = 500; // Rs 500 per hour
    private static final double TAX_RATE_ABOVE_100000 = 0.20; // 20% for gross salary above 100000
    private static final double TAX_RATE_UPTO_100000 = 0.10; // 10% for gross salary up to 100000
    private static final double SALARY_CAP = 150000; // Maximum final salary        
    public double calculateGrossSalary(Employee employee) {
        double grossSalary = employee.getBaseSalary();
        //Add Experience Bonus 10% of base salary if experiece is more than 5 years
        if (employee.getYearsOfExperience() > 5) {
            grossSalary += employee.getBaseSalary() * EXPERIENCE_BONUS_RATE;
        } 
        //Add Department Bonus 5% of base salary if department is "IT"
        if (employee.getDepartment().equalsIgnoreCase("IT")) {
            grossSalary += employee.getBaseSalary() * DEPARTMENT_BONUS_RATE;
        }
        //Add Overtime pay Rs 500 per hour to gross salary
        grossSalary += employee.getOverTimeHours() * OVERTIME_PAY_RATE;
        return grossSalary;
    }
    //Tax calculation
    public double calculateTax(double grossSalary) {
        double tax = 0;
        if (grossSalary > 100000) {
            tax += grossSalary * TAX_RATE_ABOVE_100000;
        }
        else {
            tax += 100000 * TAX_RATE_UPTO_100000; // 20% of gross salary above 100000
        }
        return tax;

    }
    //Calculate final Salary
    public double calculateFinalSalary(Employee employee) {
        double grossSalary = calculateGrossSalary(employee);
        double tax = calculateTax(grossSalary);
        double finalSalary = grossSalary - tax;
        //Applying salary cap
        if (finalSalary > SALARY_CAP) {
            finalSalary = SALARY_CAP;
        }
        return finalSalary;
    }
}
