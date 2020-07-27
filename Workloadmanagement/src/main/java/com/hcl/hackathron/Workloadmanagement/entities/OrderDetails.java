package com.hcl.hackathron.Workloadmanagement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ORDER_DETAILS_TBX")
public class OrderDetails {
	
	@Id
	@GeneratedValue(generator="ord_det_id_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="ord_det_id_seq", initialValue=1,allocationSize=1, sequenceName="ord_det_id_seq_name")
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
	
	
	 @ManyToOne()
     @JoinColumn(name = "Order_Id")
     private Order order;
	

	 
	@Column(name="Order_Id", insertable=false, updatable=false)
	private String orderId;
	
	
	 @OneToOne()
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "OrderDetails [orderDetailsId=" + orderDetailsId + ", productName=" + productName + ", quantity="
				+ quantity + ", orderStatus=" + orderStatus + ", userId=" + userId + ", orderId=" + orderId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orderDetailsId == null) ? 0 : orderDetailsId.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result + ((orderStatus == null) ? 0 : orderStatus.hashCode());
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
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
		OrderDetails other = (OrderDetails) obj;
		if (orderDetailsId == null) {
			if (other.orderDetailsId != null)
				return false;
		} else if (!orderDetailsId.equals(other.orderDetailsId))
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
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}




	
	
}
