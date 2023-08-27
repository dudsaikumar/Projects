package com.file.filemanagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.file.filemanagement.entity.employee;
@Repository
public interface employeeRepo extends JpaRepository<employee, Long> {

}
