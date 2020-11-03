package com.stacksimplyfy.restservices.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stacksimplyfy.restservices.entities.User;
import com.stacksimplyfy.restservices.services.UserService;

//controller
@RestController
public class UserController {
	
	// Autowired service layer
	
	@Autowired
	private UserService userService;
	
	//getallusers Method
	
	@GetMapping("/users")
	private List<User> getallUsers()
	{
		return userService.getallUsers();
	}
	
	//create User Method
	
	//requestbody Annotation
	//postMapping Annotation
	
	@PostMapping("/users")
	public User createUser(@RequestBody User user)
	{
		return userService.createUser(user);
	}
	
	// get user by Id
	//path Annotation
	
	@GetMapping("/users/{id}")
	public Optional<User> getUserById(@PathVariable("id") Long id)
	{
		return userService.getUserById(id);
		
	}
	
	//update user by Id
	@PutMapping("/users/{id}")
	public User updateUserById(@PathVariable("id") Long id,@RequestBody User user) 
	{
		return userService.updateUSerById(id, user);
	}
	
	//deleteUserById
	@DeleteMapping("/users/{id}")
	public void deleteUserById(@PathVariable("id") Long id)
	{
		userService.deleteUserById(id);
	}
	
	//getUserByUsername
	@GetMapping("/users/byusername/{username}")
	public User getUserByUsername(@PathVariable("username") String username)
	{
		return userService.getUserByUsername(username);
	}
	
}
