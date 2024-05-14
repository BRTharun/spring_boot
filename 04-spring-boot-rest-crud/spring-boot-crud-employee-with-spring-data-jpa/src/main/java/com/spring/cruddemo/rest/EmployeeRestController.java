package com.spring.cruddemo.rest;

import com.spring.cruddemo.service.EmployeeService;
import com.spring.cruddemo.util.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    public EmployeeRestController(EmployeeService theEmployeeService){
        employeeService=theEmployeeService;
    }

    @GetMapping("/employee")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    @GetMapping("/employee/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId){
        Employee theEmployee= employeeService.findById(employeeId);
        if(theEmployee==null){
            throw new RuntimeException("Employee id not found "+employeeId);
        }
        return theEmployee;
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee theEmployee){
        theEmployee.setId(0);
        Employee dbEmployee= employeeService.save(theEmployee);
        return dbEmployee;
    }

    @PutMapping("/employee")
    public Employee update(@RequestBody Employee theEmployee){
        Employee dbEmployee= employeeService.save(theEmployee);
        return dbEmployee;
    }

    @DeleteMapping("/employee/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId){
        Employee theEmployee=employeeService.findById(employeeId);

        if(theEmployee==null){
            throw new RuntimeException("Employee id not found "+theEmployee);
        }
        employeeService.deleteById( employeeId);

        return "Deleted employee with id " +employeeId;

    }


}
