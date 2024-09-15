package com.employee.crud.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer employeeId;

    @NotBlank(message = "Employee name is mandatory")
    @Size(min = 2, max = 50, message = "Employee name must be between 2 and 50 characters")
    private String employeeName;

    @NotBlank(message = "Contact number is mandatory")
    @Pattern(regexp = "^\\d{10}$", message = "Contact number must be 10 digits")
    private String employeeContactNumber;

    @NotBlank(message = "Address is mandatory")
    @Size(max = 100, message = "Address must be less than 100 characters")
    private String employeeAddress;

    @NotBlank(message = "Gender is mandatory")
    @Pattern(regexp = "M|F", message = "Gender must be Male, Female, or Other")
    private String employeeGender;


    private String employeeDepartment;

    @NotBlank(message = "Skills are mandatory")
    @Size(max = 100, message = "Skills must be less than 100 characters")
    private String employeeSkills;
}
