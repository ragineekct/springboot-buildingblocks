package com.stacksimplyfy.restservices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stacksimplyfy.restservices.entities.User;
//Repository
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	public User findByUsername(String username);
}
