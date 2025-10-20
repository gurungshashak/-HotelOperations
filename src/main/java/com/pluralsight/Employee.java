package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hourWorked;

    public Employee(int employeeId, String name, String department, double payRate, int hourWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hourWorked = hourWorked;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public double getPayRate() {
        return payRate;
    }
    public int getHourWorked() {
        return hourWorked;
    }

    public double getTotalPay() {
        double total=hourWorked * payRate;
        return total;
    }

    public int getRegularHours() {
        int regularHours = 40;
        return regularHours;
    }

    public double getOvertimeHours() {
        if (hourWorked < 40) {
            payRate = (payRate * 1.5) * hourWorked;
        }
        return getOvertimeHours();
    }
}
