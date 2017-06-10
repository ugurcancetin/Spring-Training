package com.ugurcan.springdemo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ugurcan.springdemo.DAO.CustomerDAO;
import com.ugurcan.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{

	//need to inject customer dao
	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}

}
