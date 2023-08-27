package com.slokamstudent.student;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface studentRepo extends JpaRepository<studententity, Integer>{
	/*public abstract List<studententity>findByName(String name);
	public abstract List<studententity>findByage(Integer age);
	List<studententity>findByqual(String qual);
	List<studententity>findByAgeGreaterThan(Integer age);
	List<studententity>findByAgeLessThan(Integer age);
	List<studententity>findByAgeGreaterThanEqual(Integer age);
	List<studententity>findByAgeLessThanEqual(Integer age);
	List<studententity>findBynameStartingWith(String name);
	List<studententity>findByAgeOrderByLastnameDesc(String name);*/





}
