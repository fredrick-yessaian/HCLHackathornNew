package com.hcl.hackathron.Workloadmanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name="USER_TBX")
public class User {
	
	@Id
	@GeneratedValue(generator="usr_id_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="usr_id_seq", initialValue=1010,allocationSize=1)
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
