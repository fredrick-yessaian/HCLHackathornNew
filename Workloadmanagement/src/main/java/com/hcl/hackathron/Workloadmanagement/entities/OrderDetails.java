package com.hcl.hackathron.Workloadmanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity(name="ORDER_DETAILS_TBX")
public class OrderDetails {
	
	@Id
	@GeneratedValue(generator="ord_det_id_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="ord_det_id_seq", initialValue=1,allocationSize=1)
	@Column(name="Order_Details_Id")
	private Integer orderDetailsId;
	
	@Column(name="Product_Name")
	private String productName;

	@Column(name="Quantity")
	private Integer quantity;
	
	@Column(name="Order_Status")
	private String orderStatus;
	
	@Column(name="User_Id", insertable=false, updatable=false)
	private Integer userId;
	
	
	 @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name = "Order_Id")
     private Order order;
	

	 
	@Column(name="Order_Id", insertable=false, updatable=false)
	private String orderId;
	
	
	 @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name = "User_Id")
     private User user;
	
	public OrderDetails() {
		// TODO Auto-generated constructor stub
	}

	public OrderDetails(Integer orderDetailsId, String productName, Integer quantity, String orderStatus,
			Integer userId, String orderId) {
		super();
		this.orderDetailsId = orderDetailsId;
		this.productName = productName;
		this.quantity = quantity;
		this.orderStatus = orderStatus;
		this.userId = userId;
		this.orderId = orderId;
	}

	public Integer getOrderDetailsId() {
		return orderDetailsId;
	}

	public void setOrderDetailsId(Integer orderDetailsId) {
		this.orderDetailsId = orderDetailsId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	
	
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "OrderDetails [orderDetailsId=" + orderDetailsId + ", productName=" + productName + ", quantity="
				+ quantity + ", orderStatus=" + orderStatus + ", userId=" + userId + ", orderId=" + orderId + "]";
	}




	
	
}
