package com.example.SaiProduct.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SaiProduct.Entity.SaiProductEntity;
@Repository
public interface SaiProductRepo extends JpaRepository<SaiProductEntity, Integer> {

}
