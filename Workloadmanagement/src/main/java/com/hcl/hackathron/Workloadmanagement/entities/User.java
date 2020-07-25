package com.hcl.hackathron.Workloadmanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="USER_TBX")
public class User {
	
	@Column(name="User_Id")
	private Integer userId;
	
	@Column(name="First_Name")
	private String firstName;
	
	@Column(name="Last_Name")
	private String lastName;
	
	@Column(name="User_Group")
	private String userGroup;

	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	public User(Integer userId, String firstName, String lastName, String userGroup) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userGroup = userGroup;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", userGroup="
				+ userGroup + "]";
	}



	
	

}
