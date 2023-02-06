package com.quan_ly_nhan_vien_spring_boot.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Branch {
    @Id
    private int id;
    private String branch;

    public Branch() {
    }

}
