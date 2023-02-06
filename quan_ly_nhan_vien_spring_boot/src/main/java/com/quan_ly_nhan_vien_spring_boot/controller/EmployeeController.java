package com.quan_ly_nhan_vien_spring_boot.controller;

import com.quan_ly_nhan_vien_spring_boot.model.Branch;
import com.quan_ly_nhan_vien_spring_boot.model.Employee;
import com.quan_ly_nhan_vien_spring_boot.service.BranchSV;
import com.quan_ly_nhan_vien_spring_boot.service.EmploySV;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.List;

@RestController
@RequestMapping("/home")
@CrossOrigin("*")
public class EmployeeController {
    @Autowired
    EmploySV employSV;
    @Autowired
    BranchSV branchSV;

    @GetMapping
    public Page<Employee> getAll(){
        return employSV.getAll(PageRequest.of(0,6));
    }

//    @GetMapping
//    public List<Employee> getAll(){
//        return employSV.getAll();
//    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        employSV.delete(id);
    }

    @PostMapping
    public Employee create(@RequestBody  Employee employee){
        return employSV.save(employee);
    }

    @GetMapping("/{id}")
    public Employee showEdit(@PathVariable int id){
        return employSV.findById(id);
    }

    @PutMapping("/{id}")
    public Employee edit(@RequestBody Employee employee){
        return employSV.save(employee);
    }
}
