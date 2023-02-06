package com.quan_ly_nhan_vien_spring_boot.service;

import com.quan_ly_nhan_vien_spring_boot.model.Branch;
import com.quan_ly_nhan_vien_spring_boot.repository.IBranchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchSV {
    @Autowired
    IBranchRepo iBranchRepo;
    public List<Branch> getAll(){
      return (List<Branch>) iBranchRepo.findAll();
    }
}
