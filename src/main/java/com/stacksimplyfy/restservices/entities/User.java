package com.stacksimplyfy.restservices.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//Entity
	@Entity
	@Table(name = "user")

public class User {

	@Id
	@GeneratedValue 
	private Long id;
	
	@Column(name="USER_NAME", length=50, nullable=false, unique=true)
	private String username;
	
	@Column(name="FIRST_NAME", length=50 ,nullable=false)
	private String firstnme;
	
	@Column(name="LAST_NAME", length=50 ,nullable=false)
	private String lastname;
	
	@Column(name="EMAIL_ADDRESS", length=50 ,nullable=false)
	private String email;
	
	@Column(name="ROLE", length=50 ,nullable=false)
	private String role;
	
	
	@Column(name="SSN", length=50, nullable=false, unique=true)
	private String ssn;
	
	//no-arguments constructor
	public User() {
		
	}
	//fields constructor

	public User(Long id, String username, String firstnme, String lastname, String email, String role, String ssn) {
		
		this.id = id;
		this.username = username;
		this.firstnme = firstnme;
		this.lastname = lastname;
		this.email = email;
		this.role = role;
		this.ssn = ssn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstnme() {
		return firstnme;
	}

	public void setFirstnme(String firstnme) {
		this.firstnme = firstnme;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}


	// toString- optional for bean logging 
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", firstnme=" + firstnme + ", lastname=" + lastname
				+ ", email=" + email + ", role=" + role + ", ssn=" + ssn + "]";
	}
	
	
		
	

	
}
