package javapackage;

import java.util.Scanner;

class Employee {
    private int empId;
    private String empName;
    private double salary;
    private int yearsWorked;

    public void setEmployeeDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
       

        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();

        System.out.print("Enter Monthly Salary: ");
        salary = sc.nextDouble();

        System.out.print("Enter Years Worked: ");
        yearsWorked = sc.nextInt();
    }

    public void getEmployeeDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Years Worked: " + yearsWorked);
        System.out.println("Loan Eligibility: " + getLoanEligibility());
    }

    public String getLoanEligibility() {
        if (yearsWorked <= 5) {
            return "Not Eligible (Work experience < 5 years)";
        }

        double annualSalary = salary * 12;
        if (annualSalary >= 15_00_000) {
            return "Eligible for ₹7,00,000 loan";
        } else if (annualSalary >= 10_00_000) {
            return "Eligible for ₹5,00,000 loan";
        } else if (annualSalary >= 6_00_000) {
            return "Eligible for ₹2,00,000 loan";
        } else {
            return "Not Eligible (Annual salary < ₹6,00,000)";
        }
    }
}

public class EmployeeLoan{
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmployeeDetails(); 
        emp.getEmployeeDetails(); }
}


