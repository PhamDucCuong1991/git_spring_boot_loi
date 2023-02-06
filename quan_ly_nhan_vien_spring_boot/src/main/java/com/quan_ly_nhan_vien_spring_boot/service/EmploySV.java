package com.quan_ly_nhan_vien_spring_boot.service;

import com.quan_ly_nhan_vien_spring_boot.model.Employee;
import com.quan_ly_nhan_vien_spring_boot.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmploySV {
    @Autowired
    IEmployeeRepo iEmployeeRepo;

    public Page<Employee> getAll(Pageable pageable){
        return iEmployeeRepo.findAll(pageable);
    }

    public List<Employee> getAll(){
        return (List<Employee>) iEmployeeRepo.findAll();
    }

    public Employee save(Employee employee){
        return iEmployeeRepo.save(employee);
    }

    public void delete(int id){
        iEmployeeRepo.deleteById(id);
    }

    public Employee findById(int id){
        return iEmployeeRepo.findById(id).get();
    }
}
