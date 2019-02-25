package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IItemDao;
import com.app.model.Item;
import com.app.service.IItemService;

@Service
public class ItemServiceImpl implements IItemService {
	@Autowired
	private IItemDao dao;

	
	@Override
	public int saveItem(Item itm) {
		return dao.saveItem(itm);
	}

	@Override
	public void updateItem(Item itm) {
		dao.updateItem(itm);
	}

	@Override
	public void deleteItem(int itmId) {
		dao.deleteItem(itmId);
	}

	@Override
	public Item getItemById(int itmId) {
		return dao.getItemById(itmId);
	}

	@Override
	public List<Item> getAllItem() {
		return dao.getAllItem();
	}

}
