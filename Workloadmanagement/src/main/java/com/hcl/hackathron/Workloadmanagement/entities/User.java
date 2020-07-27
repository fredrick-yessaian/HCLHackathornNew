package com.hcl.hackathron.Workloadmanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USER_TBX")
public class User {
	
	@Id
	@GeneratedValue(generator="usr_id_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="usr_id_seq", initialValue=1000,allocationSize=1,sequenceName="usr_id_seq_name")
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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((userGroup == null) ? 0 : userGroup.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (userGroup == null) {
			if (other.userGroup != null)
				return false;
		} else if (!userGroup.equals(other.userGroup))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}



	
	

}
