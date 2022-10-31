package com.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.entity.Admin;
import com.project.entity.Customer;

public interface adminRepository extends CrudRepository<Admin, Integer>{
	
	

}
