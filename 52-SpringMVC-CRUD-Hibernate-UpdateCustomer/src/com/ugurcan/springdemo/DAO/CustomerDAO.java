package com.ugurcan.springdemo.DAO;

import java.util.List;

import com.ugurcan.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomers(int theId);
	
	
}
