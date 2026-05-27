package com.ems.service;


import com.ems.entity.SalarySlip;

import java.util.List;

public interface SalaryService {

    SalarySlip generateSalarySlip(
            SalarySlip salarySlip);

    List<SalarySlip> getAllSalarySlips();

    List<SalarySlip> getSalarySlipByEmployee(
            Long employeeId);

    void deleteSalarySlip(Long id);
}