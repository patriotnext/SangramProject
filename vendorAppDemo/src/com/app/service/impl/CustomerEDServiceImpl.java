package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ICustomerEDDao;
import com.app.model.CustomerED;
import com.app.model.Item;
import com.app.service.ICustomerEDService;
@Service
public class CustomerEDServiceImpl implements ICustomerEDService {
	@Autowired
	private ICustomerEDDao dao;

	@Override
	public int saveCustomerED(CustomerED cusED) {
		return dao.saveCustomerED(cusED);
	}

	@Override
	public void updateCustomerED(CustomerED cusED) {
		dao.updateCustomerED(cusED);
	}

	@Override
	public void deleteCustomerED(int cId) {
		dao.deleteCustomerED(cId);
	}

	@Override
	public CustomerED getCustomerById(int cId) {
		return dao.getCustomerById(cId);
	}

	@Override
	public List<Item> getAllCustomerED(int cId) {
		return dao.getAllCustomerED(cId);
	}
	

}
