package com.example.SaiProduct.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SaiProduct.Entity.SaiProductEntity;
import com.example.SaiProduct.Repo.SaiProductRepo;
@RestController
@RequestMapping("SaiProductEntity")
public class SaiProductController {
	@Autowired
	private SaiProductRepo repo;
	@PostMapping
	public ResponseEntity<SaiProductEntity>saveproduct(@RequestBody SaiProductEntity product ){
		SaiProductEntity s=	repo.save(product);
		return ResponseEntity.ok().body(s);
	}

}
