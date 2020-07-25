package com.hcl.hackathron.Workloadmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.hackathron.Workloadmanagement.entities.Order;

@Service
public interface OrderService {
	public List<Order> getAllOrders();
	
	public Order getOrderById(String id);

}
