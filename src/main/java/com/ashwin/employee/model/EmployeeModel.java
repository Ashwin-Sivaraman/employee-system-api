package com.ashwin.employee.model;

import lombok.Data;

//interacts with the UI

@Data
public class EmployeeModel {
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
