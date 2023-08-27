package com.slokam1.doctor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface doctorRepo extends JpaRepository<doctorpojo, Integer> {

}
