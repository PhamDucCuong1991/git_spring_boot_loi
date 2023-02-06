package com.quan_ly_nhan_vien_spring_boot.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Employee  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeCode;
    private String name;
    private int age;
    private double salary;
    @ManyToOne
    private Branch branch;

    public Employee() {
    }


}
