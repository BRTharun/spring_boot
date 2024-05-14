package com.spring.cruddemo.dao;

import com.spring.cruddemo.util.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee theEmployee);

    void delete(int id);
}
