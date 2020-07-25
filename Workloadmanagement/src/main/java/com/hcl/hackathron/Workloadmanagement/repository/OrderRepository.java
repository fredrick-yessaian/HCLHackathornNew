package com.hcl.hackathron.Workloadmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.hackathron.Workloadmanagement.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
