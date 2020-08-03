package com.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.domain.AdminProduct;
import com.app.domain.User;
import com.app.repositories.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "users")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/get")
	public List<User> getUsers() {
		return userRepository.findAll();
		
		}
	
	@PutMapping("/update")
	public void updateUser(@RequestBody User user) {
		userRepository.save(user);
	}
	
	//---------------- from java guides  ----------------------//
	
	@GetMapping(path = { "/{id}" })
	public Optional<User> getUserById(@PathVariable("id") long id) {
		Optional<User> user = userRepository.findById(id);
		return user;
	}
	
	
	
//	@PutMapping(path = { "/{id}" })
//	public Optional<User> editUser(@PathVariable("id") long id) {
//		Optional<User> user = userRepository.findById(id);
		
//		user.setFirstName(userDetails.getFirstName());
		
//		User updatedUser = userRepository.save(user);
		
//		return updatedUser;
//	}
	
	
	
	//------------------------------------------//
	
	@PostMapping("/add")
	public void createUser(@RequestBody User user) {
		userRepository.save(user);
	}
	
	@DeleteMapping(path = { "/{id}" })
	public User deleteUser(@PathVariable("id") long id) {
		User user = userRepository.findById(id).get();
		userRepository.deleteById(id);
		return user;
	}	

}