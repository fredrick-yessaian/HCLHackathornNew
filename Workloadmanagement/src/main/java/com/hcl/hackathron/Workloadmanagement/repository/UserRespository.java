package com.hcl.hackathron.Workloadmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.hackathron.Workloadmanagement.entities.User;

public interface UserRespository extends JpaRepository<User, Integer>{

}
