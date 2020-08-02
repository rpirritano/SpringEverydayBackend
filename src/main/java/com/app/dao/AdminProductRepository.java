package com.app.dao;

import com.app.entity.AdminProduct;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin("http://localhost:4200")
public interface AdminProductRepository extends JpaRepository<AdminProduct, Long> {
	
	

}
