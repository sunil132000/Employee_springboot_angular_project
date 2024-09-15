package com.employee.crud.service;

import com.employee.crud.entity.Employee;
import com.employee.crud.repository.EmployeeRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Resource
    private EmployeeRepository employeeRepository;


    //business logic for save employee detail
    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

   //business logic for get all the detail of employee
    public List<Employee> getEmployee(){
        List<Employee> employees = new ArrayList<>();
         employeeRepository.findAll().forEach(employees::add);
         return employees;
    }

    //business logic for getting employee detail based on ID of employee
    public Employee getEmployeeId(Integer employeeId){
        return employeeRepository.findById(employeeId).orElseThrow();
    }

    //business logic to delete employee based on ID of employee
    public void deleteEmployee(Integer employeeId){
         employeeRepository.deleteById(employeeId);
    }

    //business logic to update employee detail
    public Employee updateEmployee(Employee employee){
        employeeRepository.findById(employee.getEmployeeId()).orElseThrow();
        return employeeRepository.save(employee);
    }
}
