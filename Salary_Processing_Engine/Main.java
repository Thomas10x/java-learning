import model.Employee;
import util.SalaryPrinter;
import service.SalaryService;
import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee details");
        System.out.println("Employee ID:");
        String employeeId = scanner.nextLine();
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Department:");
        String department = scanner.nextLine(); 
        System.out.println("Base Salary:");
        double baseSalary = scanner.nextDouble();
        System.out.println("Years of Experience:");
        int yearsOfExperience = scanner.nextInt();
        System.out.println("Overtime Hours:");
        int overTimeHours = scanner.nextInt();
        Employee employee = new Employee(employeeId, name, department, baseSalary, yearsOfExperience, overTimeHours);


        
        //Call Salary Printer to print salary details
        SalaryService salaryService = new SalaryService();
        SalaryPrinter.printSalaryDetails(employee, salaryService);

    }
}