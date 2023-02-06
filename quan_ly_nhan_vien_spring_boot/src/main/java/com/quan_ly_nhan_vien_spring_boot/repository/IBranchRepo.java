package com.quan_ly_nhan_vien_spring_boot.repository;

import com.quan_ly_nhan_vien_spring_boot.model.Branch;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IBranchRepo extends PagingAndSortingRepository<Branch, Integer> {
}
