package com.hcl.hackathron.Workloadmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.hackathron.Workloadmanagement.entities.Order;
import com.hcl.hackathron.Workloadmanagement.entities.User;
import com.hcl.hackathron.Workloadmanagement.repository.OrderRepository;
import com.hcl.hackathron.Workloadmanagement.repository.UserRespository;
import com.hcl.hackathron.Workloadmanagement.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@Autowired
	OrderRepository orderPrepository;
	
	@Autowired
	UserRespository userRepository;

    @GetMapping("/AllOrders")
    public List<Order> getAllOrders() {
    	
    	List<Order> orderLst = orderPrepository.findAll();
    	
    	return orderLst;

    }
    
    @GetMapping("/Users")
    public List<User> getAllUsers(){
    	return userRepository.findAll();
    }
    
    
    
    @RequestMapping("Order/{orderId}")
    public Order getCustomerOrderDetails(@PathVariable String orderId) {
    	orderService.getOrderById(orderId);
    	return null;
    }

}
