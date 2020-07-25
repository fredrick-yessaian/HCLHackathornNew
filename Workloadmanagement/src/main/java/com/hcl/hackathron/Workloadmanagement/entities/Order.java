package com.hcl.hackathron.Workloadmanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="ORDER_TBX")
public class Order {

	
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
	
	
	
	
}
