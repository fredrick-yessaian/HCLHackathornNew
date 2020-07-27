package com.hcl.hackathron.Workloadmanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.hackathron.Workloadmanagement.entities.Order;
import com.hcl.hackathron.Workloadmanagement.entities.OrderDetails;
import com.hcl.hackathron.Workloadmanagement.repository.OrderDetailsRepository;
import com.hcl.hackathron.Workloadmanagement.repository.OrderRepository;
import com.hcl.hackathron.Workloadmanagement.repository.UserRespository;

@RestController
public class OrderController {
	

	@Autowired
	OrderRepository orderPrepository;
	
	@Autowired
	UserRespository userRepository;
	
	@Autowired
	OrderDetailsRepository orderDetailsRepository;

    @GetMapping("/AllOrders")
    public List<Order> getAllOrders() {
    	
    	List<Order> orderLst = orderPrepository.findAll();
    	
    	return orderLst;

    }
    
    @GetMapping("Order/{orderId}")
    public OrderDetails getCustomerOrderDetails(@PathVariable Integer orderId) {
    	
    	return orderDetailsRepository.findById(orderId).get();
    }

    
    @GetMapping("/Staff/Order/{Staff_Id}")
    public List<Order> getStaffOrderDetails(@PathVariable("Staff_Id") String staffId){
    	
    	return null;
    }
    
    @PostMapping("/Staff/Order/{Order_Id}/{Status}")
    public Order updateOrderDetail(@PathVariable("Order_Id") Integer OrderId, @PathVariable("Status") String status){
    	
    	return null;
    }   
    
}
