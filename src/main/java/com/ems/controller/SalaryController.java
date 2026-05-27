package com.ems.controller;

import com.ems.entity.SalarySlip;
import com.ems.service.SalaryService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.access.prepost.PreAuthorize;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/salary")

public class SalaryController {

    @Autowired
    private SalaryService salaryService;

    // ADMIN ONLY → Generate Salary Slip

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/generate")

    public SalarySlip generateSalarySlip(
            @RequestBody SalarySlip salarySlip){

        return salaryService.generateSalarySlip(salarySlip);
    }

    // ADMIN ONLY → View All Salary Slips

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/all")

    public List<SalarySlip> getAllSalarySlips(){

        return salaryService.getAllSalarySlips();
    }

    // EMPLOYEE OR ADMIN → View Salary Slip By Employee ID

    @PreAuthorize("hasRole('EMPLOYEE') or hasRole('ADMIN')")
    @GetMapping("/{employeeId}")

    public List<SalarySlip> getSalarySlipByEmployee(
            @PathVariable Long employeeId){

        return salaryService.getSalarySlipByEmployee(employeeId);
    }

    // ADMIN ONLY → Delete Salary Slip

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")

    public String deleteSalarySlip(
            @PathVariable Long id){

        salaryService.deleteSalarySlip(id);

        return "Salary Slip Deleted Successfully";
    }
}