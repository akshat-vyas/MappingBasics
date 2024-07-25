package com.mappingsBasics.mappingsAndJpa.services;


import com.mappingsBasics.mappingsAndJpa.entities.DepartmentEntity;
import com.mappingsBasics.mappingsAndJpa.entities.EmployeeEntity;
import com.mappingsBasics.mappingsAndJpa.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service


public class EmployeeService {
    public final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository= employeeRepository;
    }


    public EmployeeEntity createNewEmployee(EmployeeEntity employeeEntity){
        return employeeRepository.save(employeeEntity);
    }
    public EmployeeEntity getEmployeeById(Long employeeId){
        return employeeRepository.findById(employeeId).orElse(null);
    }
}

