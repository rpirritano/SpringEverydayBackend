package com.app.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.app.domain.AdminProduct;
import com.app.repositories.AdminProductRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "adminproducts")
public class AdminProductController {
	

	@Autowired
	private AdminProductRepository adminProductRepository;
	
	@GetMapping("/get")
	public List<AdminProduct> getProducts() {
		return adminProductRepository.findAll();
	}
	

	@PostMapping("/add")
	public void createProduct(@RequestBody AdminProduct adminProduct) throws IOException {
		adminProductRepository.save(adminProduct);
	}
	
	@DeleteMapping(path = { "/{id}" })
	public AdminProduct deleteProduct(@PathVariable("id") long id) {
		AdminProduct adminProduct = adminProductRepository.findById(id).get();
		adminProductRepository.deleteById(id);
		return adminProduct;
	}
	
	@PutMapping("/update")
	public void updateProduct(@RequestBody AdminProduct adminProduct) {
		adminProductRepository.save(adminProduct);
	}
}

