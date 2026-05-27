package com.ems.entity;

import jakarta.persistence.*;

@Entity

public class SalarySlip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String month;

    private double basicSalary;

    private double hra;

    private double bonus;

    private double deduction;

    private double totalSalary;

    @ManyToOne
    private Employee employee;
}