package com.quan_ly_nhan_vien_spring_boot.repository;

import com.quan_ly_nhan_vien_spring_boot.model.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IEmployeeRepo extends PagingAndSortingRepository<Employee, Integer> {

}
