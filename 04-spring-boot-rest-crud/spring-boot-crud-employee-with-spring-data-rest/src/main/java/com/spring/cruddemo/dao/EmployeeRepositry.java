package com.spring.cruddemo.dao;

import com.spring.cruddemo.util.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepositry extends JpaRepository<Employee,Integer> {
}
