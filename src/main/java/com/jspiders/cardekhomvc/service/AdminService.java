package com.jspiders.cardekhomvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.cardekhomvc.pojo.AdminPOJO;
import com.jspiders.cardekhomvc.repository.AdminRepository;



@Service
public class AdminService {
	
	@Autowired
	private AdminRepository repository;

	public AdminPOJO getAdmin() {
		AdminPOJO pojo = repository.getAdmin();
		return pojo;
	}

	public AdminPOJO createAccount(String username, String password) {
		AdminPOJO pojo = repository.createAccount(username, password);
		return pojo;
	}

	public AdminPOJO login(String username, String password) {
		AdminPOJO pojo = repository.login(username, password);
		return pojo;
	}

}