package com.stacksimplyfy.restservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.stacksimplyfy.restservices.Repository.UserRepository;
import com.stacksimplyfy.restservices.entities.User;
import com.stacksimplyfy.restservices.exceptions.UserExistsException;
import com.stacksimplyfy.restservices.exceptions.UserNotFoundException;

// service
@Service
public class UserService {

	// Autowire the repository
	@Autowired
	private UserRepository userRepository;

	// getallusers Method

	public List<User> getallUsers() {
		return userRepository.findAll();
	}

	// create user Method

	public User createUser(User user) throws UserExistsException {
		//if user exists using username
		User existinguser=userRepository.findByUsername(user.getUsername());
		
		//throw exception
		if(existinguser!=null) 
		{
			throw new UserExistsException("User already exists.");
		}
		return userRepository.save(user);
	}

	// get User by Id
	public Optional<User> getUserById(Long id) throws UserNotFoundException {
		Optional<User> user = userRepository.findById(id);

		if (!user.isPresent()) {
			throw new UserNotFoundException("user is not found in repository.");
		}
		return user;
	}

	// updateUserById

	public User updateUSerById(Long id, User user) throws UserNotFoundException {
		Optional<User> optionalUser = userRepository.findById(id);
		if (!optionalUser.isPresent()) {
			throw new UserNotFoundException("User is not found in repository, provide correct user id.");
		}
		user.setId(id);
		return userRepository.save(user);
	}

	// deletUserById

	public void deleteUserById(Long id) {
		Optional<User> optionalUser = userRepository.findById(id);
		if (!optionalUser.isPresent()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
					"User is not found in repository, provide correct user id.");
		}
		userRepository.deleteById(id);
	}

	// getUserByUsername

	public User getUserByUsername(String username) {
		return userRepository.findByUsername(username);
	}

}
