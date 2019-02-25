package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IVendorDao;
import com.app.model.Vendor;

@Repository
public class VendorDaoImpl implements IVendorDao {
	@Autowired
	private HibernateTemplate ht;

	@Override
	public int saveVendor(Vendor vn) {
		int venId = (Integer) ht.save(vn);
		return venId;
	}

	@Override
	public void updateVendor(Vendor vn) {

		ht.update(vn);
	}

	@Override
	public void deleteVendor(int venId) {
		ht.delete(new Vendor(venId));
	}

	@Override
	public Vendor getVendorById(int venId) {

		Vendor vn = (Vendor) ht.get(Vendor.class, venId);
		return vn;
	}

	@Override
	public List<Vendor> getAllVendor() {
		List<Vendor> list = ht.loadAll(Vendor.class);
		return list;
	}

}
