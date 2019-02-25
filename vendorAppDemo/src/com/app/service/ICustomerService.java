package com.app.service;

import java.util.List;

import com.app.model.Customer;

public interface ICustomerService {
	public int saveCustomer(Customer cus);
	public void updateCustomer(Customer cus);
	public void deleteCustomer(int cusId);
	public Customer getCustomerById(int cusId);
	public List<Customer> getAllCustomer();

}
