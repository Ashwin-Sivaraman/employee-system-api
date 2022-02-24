package com.ashwin.employee.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//STORES IN DATABASE 

@Entity
@Data
@Table(name = "employees")
public class EmployeeEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;


}
