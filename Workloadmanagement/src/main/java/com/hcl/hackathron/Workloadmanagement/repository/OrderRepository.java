package com.hcl.hackathron.Workloadmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.hackathron.Workloadmanagement.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{

}
