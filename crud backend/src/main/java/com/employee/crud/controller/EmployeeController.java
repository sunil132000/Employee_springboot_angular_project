    package com.employee.crud.controller;

    import com.employee.crud.entity.Employee;
    import com.employee.crud.service.EmployeeService;
    import jakarta.annotation.Resource;
    import jakarta.validation.Valid;  // Ensure this import is correct
    import org.springframework.web.bind.annotation.*;

    import java.util.List;
    /**
     * EmployeeController.java
     * This class handles HTTP requests related to employee operations such as
     * saving, retrieving, updating, and deleting employee records.
     * Author: [Sunil kumar singh - 7136]
     * Date: [09/10/2024]
     * Validation is applied to ensure that the data received in requests is correct.
     * Errors are handled and returned in a format suitable for clients.
     */
    @RestController
    @CrossOrigin("http://localhost:4200" )

    public class EmployeeController {

        @Resource
        private EmployeeService employeeService;

        // Saving the detail of employee endpoint
        @PostMapping("/save/employee")
        public Employee saveEmployee(@Valid @RequestBody Employee employee) {
            return employeeService.saveEmployee(employee);
        }

        // Get the detail of all employee endpoint
        @GetMapping("/get/employee")
        public List<Employee> getEmployee() {
            return employeeService.getEmployee();
        }

        // Get specific employee detail based on id endpoint
        @GetMapping("/get/employee/{employeeId}")
        public Employee getEmployee(@PathVariable Integer employeeId) {
            return employeeService.getEmployeeId(employeeId);
        }

        // Delete employee based on Id endpoint
        @DeleteMapping("/delete/employee/{employeeId}")
        public void deleteEmployee(@PathVariable Integer employeeId) {
            employeeService.deleteEmployee(employeeId);
        }

        // Update employee detail endpoint
        @PutMapping("/update/employee")
        public Employee updateEmployee(@Valid @RequestBody Employee employee) {
            return employeeService.updateEmployee(employee);
        }
    }
