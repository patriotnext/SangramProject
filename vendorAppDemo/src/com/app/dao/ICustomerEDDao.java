package com.app.dao;

import java.util.List;

import com.app.model.CustomerED;
import com.app.model.Item;

public interface ICustomerEDDao {
public int saveCustomerED(CustomerED cusED);
public void updateCustomerED(CustomerED cusED);
public void deleteCustomerED(int cId);
public CustomerED getCustomerById(int cId);
public List<Item> getAllCustomerED( int cusId);
}
