package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.app.domain.AdminProduct;


@CrossOrigin("http://localhost:4200")
public interface AdminProductRepository extends JpaRepository<AdminProduct, Long> {
	
	

}
