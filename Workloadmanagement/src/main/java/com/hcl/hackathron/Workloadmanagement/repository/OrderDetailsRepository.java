package com.hcl.hackathron.Workloadmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.hackathron.Workloadmanagement.entities.OrderDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer>{

}
