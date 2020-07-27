package com.hcl.hackathron.Workloadmanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ORDER_TBX")
public class Order {

	@Id
	@GeneratedValue(generator="ord_id_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="ord_id_seq", initialValue=1,allocationSize=1, sequenceName="ord_id_seq_name")
	@Column(name="Order_Id")
	public Integer orderId;
	
	@Column(name="First_Name")
	private String firstName;
	
	@Column(name="Last_Name")
	private String lastName;
	
	@Column(name="Price")
	private Float price;
	
	@Column(name="Order_Status")
	private String orderStatus;
	

	
	
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	public Order(Integer orderId, String firstName, String lastName, Float price, String orderStatus) {
		super();
		this.orderId = orderId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.price = price;
		this.orderStatus = orderStatus;
	}




	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
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

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", firstName=" + firstName + ", lastName=" + lastName + ", price=" + price
				+ ", orderStatus=" + orderStatus + "]";
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result + ((orderStatus == null) ? 0 : orderStatus.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
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
		Order other = (Order) obj;
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
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		if (orderStatus == null) {
			if (other.orderStatus != null)
				return false;
		} else if (!orderStatus.equals(other.orderStatus))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}
	
	
	
	
}
