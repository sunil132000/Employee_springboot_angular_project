package com.employee.crud.repository;


import com.employee.crud.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * EmployeeRepository.java
 * This interface provides CRUD (Create, Read, Update, Delete) operations for
 * the Employee entity. It extends Spring Data's CrudRepository, which provides
 * methods for basic CRUD operations without requiring custom implementations.
 * Author: [Sunil]
 * Date: [09/11/2024]
 * This repository interface allows for:
 * - Saving new employee records.
 * - Retrieving existing employee records by ID.
 * - Updating employee records.
 * - Deleting employee records.
 * Spring Data JPA will automatically provide the implementation of these methods
 * based on the method names and the Employee entity's configuration.
 */



@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
