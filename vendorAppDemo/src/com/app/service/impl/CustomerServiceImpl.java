package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ICustomerDao;
import com.app.model.Customer;
import com.app.service.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {
	@Autowired
	private ICustomerDao dao;

	@Override
	public int saveCustomer(Customer cus) {
		return dao.saveCustomer(cus);
	}

	@Override
	public void updateCustomer(Customer cus) {

		dao.updateCustomer(cus);
	}

	@Override
	public void deleteCustomer(int cusId) {

		dao.deleteCustomer(cusId);
	}

	@Override
	public Customer getCustomerById(int cusId) {
		return dao.getCustomerById(cusId);
	}

	@Override
	public List<Customer> getAllCustomer() {
		return dao.getAllCustomer();
	}

}
