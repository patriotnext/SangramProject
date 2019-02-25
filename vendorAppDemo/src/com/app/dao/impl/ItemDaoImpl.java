package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IItemDao;
import com.app.model.Item;
@Repository
public class ItemDaoImpl implements IItemDao {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public int saveItem(Item itm) {
		return(Integer)ht.save(itm);
	}

	@Override
	public void updateItem(Item itm) {
			ht.update(itm);
	}

	@Override
	public void deleteItem(int itmId) {
			ht.delete(new Item(itmId));
	}

	@Override
	public Item getItemById(int itmId) {
		Item itm=ht.get(Item.class, itmId);
		return itm;
	}

	@Override
	public List<Item> getAllItem() {
		List<Item> list=ht.loadAll(Item.class);
		return list;
	}

}
