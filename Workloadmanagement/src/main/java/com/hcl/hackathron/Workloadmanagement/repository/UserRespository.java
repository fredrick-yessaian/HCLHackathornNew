package com.hcl.hackathron.Workloadmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.hackathron.Workloadmanagement.entities.User;


@Repository
public interface UserRespository extends JpaRepository<User, Integer>{

}
