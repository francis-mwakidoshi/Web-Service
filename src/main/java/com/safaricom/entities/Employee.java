/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.safaricom.entities;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Sly
 */
@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private int age;
    private String department;
    private Date reporting_date;

    public Employee() {
    }

    public Employee(String name, String email, int age, String department, Date reporting_date) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.department = department;
        this.reporting_date = reporting_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    @JsonSerialize(using=JsonDateSerializer.class)
    public Date getReporting_date() {
        return reporting_date;
    }

    public void setReporting_date(Date reporting_date) {
        this.reporting_date = reporting_date;
    }
    
    
}
