package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.ICustomerEDDao;
import com.app.model.CustomerED;
import com.app.model.Item;

@Repository
public class CustomerEDImpl implements ICustomerEDDao {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public int saveCustomerED(CustomerED cusED) {

		return (Integer) ht.save(cusED);
	}

	@Override
	public void updateCustomerED(CustomerED cusED) {

		ht.update(cusED);
	}

	@Override
	public void deleteCustomerED(int cId) {
		ht.delete(new CustomerED(cId));
	}

	@Override
	public CustomerED getCustomerById(int cId) {

		return ht.get(CustomerED.class, cId);
	}

	@Override
	public List<Item> getAllCustomerED(int cusId) {

		String hql="from com.app.model.Item where cusId=?";
		List<Item> item=ht.find(hql, cusId);
		
		return item;
	}
	
}
