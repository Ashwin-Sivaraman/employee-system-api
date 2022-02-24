package com.ashwin.employee.services;

import com.ashwin.employee.entity.EmployeeEntity;
import com.ashwin.employee.model.EmployeeModel;
import com.ashwin.employee.repository.EmployeeRepository;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeModel createEmployee(EmployeeModel employee) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        BeanUtils.copyProperties(employee, employeeEntity);
        employeeRepository.save(employeeEntity);
        return employee;
    }
  
}
