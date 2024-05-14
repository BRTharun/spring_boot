package com.spring.cruddemo.service;

import com.spring.cruddemo.util.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee theEmployee);

    void delete(int id);
}
