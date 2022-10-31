package com.project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.entity.Customer;
@Repository
public interface custRepository extends CrudRepository<Customer, Integer> {
	
	
	List<Customer> findByDate(@RequestParam String date);
	List<Customer> findByPcatagary(@RequestParam String cat);
	List<Customer> findByCname(@RequestParam String c);

	

}
