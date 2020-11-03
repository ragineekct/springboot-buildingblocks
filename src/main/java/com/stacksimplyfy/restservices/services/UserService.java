package com.stacksimplyfy.restservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stacksimplyfy.restservices.Repository.UserRepository;
import com.stacksimplyfy.restservices.entities.User;

// service
@Service
public class UserService {
	
	//Autowire the repository
	@Autowired
	private UserRepository userRepository;
	
	
	// getallusers Method
	
	public List<User> getallUsers()
	{
		return userRepository.findAll();
	}

	// create user Method
	
	public User createUser(User user)
	{
		return userRepository.save(user);
	}
	
	// get User by Id
	public Optional<User> getUserById(Long id)
	{
		Optional<User> user=userRepository.findById(id);
		return user;
	}
	
	//updateUserById
	
	public User updateUSerById(Long id,User user) 
	{
		user.setId(id);
		return userRepository.save(user);
	}
	
	//deletUserById
	
	public void deleteUserById(Long id)
	{
		if(userRepository.findById(id).isPresent())
		userRepository.deleteById(id);
	}
	
	//getUserByUsername
	
	public User getUserByUsername(String username)
	{
	 return userRepository.findByUsername(username);
	}
	
	
}
