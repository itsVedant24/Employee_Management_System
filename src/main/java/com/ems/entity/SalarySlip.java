package com.ems.entity;

public class SalarySlip {

    private Long id;

    private Long employeeId;

    private String employeeName;

    private double basicSalary;

    private double hra;

    private double bonus;

    private double deductions;

    private double totalSalary;

    public SalarySlip() {

    }

    // GET ID

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    // GET EMPLOYEE ID

    public Long getEmployeeId() {

        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {

        this.employeeId = employeeId;
    }

    // GET EMPLOYEE NAME

    public String getEmployeeName() {

        return employeeName;
    }

    public void setEmployeeName(String employeeName) {

        this.employeeName = employeeName;
    }

    // GET BASIC SALARY

    public double getBasicSalary() {

        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {

        this.basicSalary = basicSalary;
    }

    // GET HRA

    public double getHra() {

        return hra;
    }

    public void setHra(double hra) {

        this.hra = hra;
    }

    // GET BONUS

    public double getBonus() {

        return bonus;
    }

    public void setBonus(double bonus) {

        this.bonus = bonus;
    }

    // GET DEDUCTIONS

    public double getDeductions() {

        return deductions;
    }

    public void setDeductions(double deductions) {

        this.deductions = deductions;
    }

    // GET TOTAL SALARY

    public double getTotalSalary() {

        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {

        this.totalSalary = totalSalary;
    }
}