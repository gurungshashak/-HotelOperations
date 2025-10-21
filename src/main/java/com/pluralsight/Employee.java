package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hourWorked;
    private double startTime;

    public Employee(int employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hourWorked = hourWorked;
    }

    public double getTotalPay() {
       double regularPay = this.payRate * this.hourWorked;
       double overTime = (this.payRate * 1.5) * this.getOvertimeHours();

       return regularPay + overTime;

    }

    public double getRegularHours() {
        if(this.hourWorked<= 40){
            return this.hourWorked;
        }
        return 40;
    }

    public double getOvertimeHours() {
        if (hourWorked < 40) {
            return this.hourWorked - 40;
        }else {
        return 0;
        }
    }

    public void punchIn(double time){
        this.startTime = time;
    }

    public void punchOut(double time){
        this.hourWorked += (time - this.startTime)
    this.startTime = 0;
    }


    public void punchTimecard(double time) {
        while (true) {
            if (this.startTime < 0) {
                this.hourWorked += (time - this.startTime);
                this.startTime = 0;
            } else
                this.startTime = time;
        }
    }

}
