package com.app.dao;

import java.util.List;

import com.app.model.Vendor;

public interface IVendorDao {
	public int saveVendor(Vendor vn);
	public void updateVendor(Vendor vn);
	public void deleteVendor(int venId);
	public Vendor getVendorById(int venId);
	public List<Vendor> getAllVendor();

}
