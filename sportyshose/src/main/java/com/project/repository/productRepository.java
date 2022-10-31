package com.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.Product;

@Repository
public interface productRepository extends CrudRepository<Product, Integer>{
	
	

}
