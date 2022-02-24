package com.ashwin.employee.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//interacts with the UI

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeModel {
    public EmployeeModel(Object id2, Object firstName2, Object lastName2, Object emailId2) {
    }
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
}
