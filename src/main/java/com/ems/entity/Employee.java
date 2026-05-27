package com.ems.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "employees")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    @Email(message = "Invalid email")
    private String email;

    private String department;

    private double salary;
}

private String designation;

private String phone;

private String address;

private LocalDate joiningDate;