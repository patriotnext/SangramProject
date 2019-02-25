package com.app.service;

import java.util.List;

import com.app.model.Vendor;

public interface IVendorService {

	public int saveVendor(Vendor vn);
	public void updateVendor(Vendor vn);
	public void deleteVendor(int venId);
	public Vendor getVendorById(int venId);
	public List<Vendor> getAllVendor();

}
