package com.spring.cruddemo.service;

import com.spring.cruddemo.dao.EmployeeRepositry;
import com.spring.cruddemo.util.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImp implements EmployeeService{


    private EmployeeRepositry employeeRepositry;

    @Autowired
    public EmployeeServiceImp(EmployeeRepositry theEmployeeDao){
        employeeRepositry=theEmployeeDao;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepositry.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> result = employeeRepositry.findById(id);
        Employee theEmployee =null;
        if(result.isPresent()){
            theEmployee=result.get();
        }
        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {
        return employeeRepositry.save(theEmployee);
    }

    @Override
    public void deleteById(int id) {
        employeeRepositry.deleteById(id);
    }
}
