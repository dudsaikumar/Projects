package com.slokam.studentmanagement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.slokam.studentmanagement.entity.student;
@Repository
public interface studentRepo extends JpaRepository<student, Long> {
	
	@Query("select s from student s join s.pass p where p.passportno=?1")
	public student ggetStudentBypptno(String pptno);

}
