package com.training.firstServlet.model.beans;

import java.io.Serializable;

public class UserCredentials implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3332999644766279371L;
	private String email;
	private String firstName;
	private String lastName;
	
	public UserCredentials() {
		this.email = "";
		this.firstName = "";
		this.lastName = "";
	}

	public UserCredentials(String email, String firstName, String lastName) {
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
