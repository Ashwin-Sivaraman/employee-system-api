package com.ashwin.employee.services;

import java.util.List;

import com.ashwin.employee.model.EmployeeModel;

public interface EmployeeService {

    EmployeeModel createEmployee(EmployeeModel employee);

    List<EmployeeModel> getEmployees();
    
}
