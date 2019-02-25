package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.ICustomerDao;
import com.app.model.Customer;
@Repository
public class CustomerDaoImpl implements ICustomerDao {

	@Autowired
	private HibernateTemplate ht;

@Override
	public int saveCustomer(Customer cus) {
		int cusId = (Integer) ht.save(cus);
		return cusId;
	}


	public void updateCustomer(Customer cus) {
		ht.update(cus);
	}


	public void deleteCustomer(int cusId) {
		ht.delete(new Customer(cusId));
	}

	public Customer getCustomerById(int cusId) {
		Customer cus = ht.get(Customer.class, cusId);
		return cus;
	}

	public List<Customer> getAllCustomer() {
		List<Customer> cuslist = ht.loadAll(Customer.class);
		return cuslist;
	}
}
