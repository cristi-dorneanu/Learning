package com.training.firstServlet.model.beans;

import java.io.Serializable;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4015052604410892186L;
	
	private String name;

	
	public User() {
		this("Unknown User");
	}


	public User(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
}
