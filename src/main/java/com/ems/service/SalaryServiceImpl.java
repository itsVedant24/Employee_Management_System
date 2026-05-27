package com.ems.service;

import com.ems.entity.SalarySlip;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class SalaryServiceImpl
        implements SalaryService {

    private final List<SalarySlip> salarySlips =
            new ArrayList<>();

    @Override

    public SalarySlip generateSalarySlip(
            SalarySlip salarySlip) {

        salarySlips.add(salarySlip);

        return salarySlip;
    }

    @Override

    public List<SalarySlip> getAllSalarySlips() {

        return salarySlips;
    }

    @Override

    public List<SalarySlip> getSalarySlipByEmployee(
            Long employeeId) {

        return salarySlips.stream()

                .filter(slip ->
                        slip.getEmployeeId()
                                .equals(employeeId))

                .toList();
    }

    @Override

    public void deleteSalarySlip(Long id) {

        salarySlips.removeIf(slip ->
                slip.getId().equals(id));
    }
}