package com.quest.practice_vars;

import java.util.Scanner;

public class EmployeeSalaryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int numEmployees = getValidNumber(scanner);
        // Array to store employee data
        Employee[] employees = new Employee[numEmployees];
        for (int i = 0; i < numEmployees; i++) {
            System.out.print("Enter the name of employee " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter the base salary for " + name + ": ");
            double baseSalary = getValidSalary(scanner);
            double[] monthlySalaries = new double[12];
            for (int month = 0; month < 12; month++) {
                System.out.print("Enter salary for month " + (month + 1) + " (0-100000): ");
                monthlySalaries[month] = getValidSalary(scanner);
            }
            employees[i] = new Employee(name, baseSalary, monthlySalaries);
        }
        // Display salary reports
        System.out.println("--- Employee Salary Report ---");
        double totalAnnualSalaryAllEmployees = 0;
        for(int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            employee.printAnnualReport();
            totalAnnualSalaryAllEmployees += employee.getTotalSalary();
        }
        // Display average salary for all employees
        double averageSalaryAllEmployees = totalAnnualSalaryAllEmployees / numEmployees;
        System.out.println("Average Salary for All Employees: " + averageSalaryAllEmployees);
        System.out.println("Thank you for using the Employee Salary Management System.");
    }
    // method to get a valid number
    public static int getValidNumber(Scanner scanner) {
        while (true) {
            try {
                int number = Integer.parseInt(scanner.nextLine());
                if (number <= 0) {
                    System.out.print("Please enter a positive number: ");
                } else {
                    return number;
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid number: ");
            }
        }
    }
    //method to get a valid salary
    public static double getValidSalary(Scanner scanner) {
        while (true) {
            try {
                double salary = Double.parseDouble(scanner.nextLine());
                if (salary < 0 || salary > 100000) {
                    System.out.print("Please enter a salary between 0 and 100000: ");
                } else {
                    return salary;
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid salary: ");
            }
        }
    }
}

class Employee {
    private final String name;
    private final double baseSalary;
    private final double[] monthlySalaries;
    public Employee(String name, double baseSalary, double[] monthlySalaries) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.monthlySalaries = monthlySalaries;
    }
    // Calculate the total salary for the year
    public double getTotalSalary() {
        double total = baseSalary * 12;
        for (int i = 0; i < monthlySalaries.length; i++) {
            total += monthlySalaries[i];
        }
        return total;
    }
    // Calculate the average monthly salary
    public double getAverageMonthlySalary() {
        double total = 0;
        for (int i = 0; i < monthlySalaries.length; i++) {
            total += monthlySalaries[i];
        }
        return total / 12;
    }
    // Calculate the bonus based on the base salary
    public double getBonus() {
        return baseSalary * 0.1;
    }
    // Print the annual salary report for the employee
    public void printAnnualReport() {
        System.out.println("Employee Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Monthly Salary Breakdown:");
        for (int i = 0; i < 12; i++) {
            System.out.println("  Month " + (i + 1) + ": " + monthlySalaries[i]);
        }
        double totalSalary = getTotalSalary();
        double averageMonthlySalary = getAverageMonthlySalary();
        double bonus = getBonus();
        System.out.println("Total Salary for the Year: " + totalSalary);
        System.out.println("Average Monthly Salary: " + averageMonthlySalary);
        System.out.println("Bonus: " + bonus);
    }
}
