package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Admin;
import com.project.repository.adminRepository;
@Service
public class adminService {
    @Autowired
	adminRepository adminRepository;
    
    public void saveAdmin(Admin admin)
    {
    	adminRepository.save(admin);	
    }
}
