package org.hibernates;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public  class Userroles {
	
	@Id
	String username;
	String role;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	

}