package com.hcl.hackathron.Workloadmanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="ORDER_DETAILS_TBX")
public class OrderDetails {
	
	
	@Column(name="Order_Details_Id")
	private Integer orderDetailsId;
	
	@Column(name="Product_Name")
	private String productName;

	@Column(name="Quantity")
	private Integer quantity;
	
	@Column(name="Order_Status")
	private String orderStatus;
	
	@Column(name="User_Id")
	private Integer userId;
	
	public OrderDetails() {
		// TODO Auto-generated constructor stub
	}

	public OrderDetails(Integer orderDetailsId, String productName, Integer quantity, String orderStatus,
			Integer userId) {
		super();
		this.orderDetailsId = orderDetailsId;
		this.productName = productName;
		this.quantity = quantity;
		this.orderStatus = orderStatus;
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "OrderDetails [orderDetailsId=" + orderDetailsId + ", productName=" + productName + ", quantity="
				+ quantity + ", orderStatus=" + orderStatus + ", userId=" + userId + "]";
	}
	
	
}
