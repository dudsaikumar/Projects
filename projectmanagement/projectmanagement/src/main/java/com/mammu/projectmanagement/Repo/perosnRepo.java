package com.mammu.projectmanagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mammu.projectmanagement.entity.person;
@Repository
public interface perosnRepo extends JpaRepository<person, Long>{
	@Query("select p from person p join p.adh a where a.anumber=?1")
	public person getbyanumber(Integer anumber);

}
