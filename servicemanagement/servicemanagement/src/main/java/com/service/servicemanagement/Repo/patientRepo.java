package com.service.servicemanagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.servicemanagement.entity.Patient;
@Repository
public interface patientRepo extends JpaRepository<Patient, Long> {
	
	public Patient findByNameAndPnumber(String name,Long pnumber);

}
