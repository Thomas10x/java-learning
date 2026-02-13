package model;
public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double baseSalary;
    private int yearsOfExperience;
    private int overTimeHours;
    //class constructor
    public Employee(String employeeId, String name, String department, double baseSalary, int yearsOfExperience, int overTimeHours) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.baseSalary = baseSalary;
        this.yearsOfExperience = yearsOfExperience;
        this.overTimeHours = overTimeHours;
    }
    //Getter methods
    public String getEmployeeId() {
        return employeeId;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    public int getOverTimeHours() {
        return overTimeHours;
    }
    
}