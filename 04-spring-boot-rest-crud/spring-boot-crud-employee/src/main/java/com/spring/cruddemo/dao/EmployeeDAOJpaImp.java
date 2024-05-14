package com.spring.cruddemo.dao;

import com.spring.cruddemo.util.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImp implements EmployeeDAO{

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOJpaImp(EntityManager theManager){
        entityManager=theManager;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery theQuery = entityManager.createQuery("from Employee",Employee.class);

        List<Employee> theEmployee = theQuery.getResultList();

        return theEmployee;
    }

    @Override
    public Employee findById(int id) {
        Employee theEmployee=entityManager.find(Employee.class,id);

        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {
        Employee dbEmployee=entityManager.merge(theEmployee);
        return dbEmployee;
    }

    @Override
    public void delete(int id) {
        Employee theEmployee=entityManager.find(Employee.class,id);
        entityManager.remove(theEmployee);

    }
}
