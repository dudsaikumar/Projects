package com.file.filemanagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.file.filemanagement.entity.Student;
@Repository
public interface studentRepo extends JpaRepository<Student, Long> {

}
