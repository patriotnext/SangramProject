package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item_tab")
public class Item implements Comparable<Item>{
	@Id
	@Column(name="i_id")
	private int itmId;
	
	@Column(name="i_code")
	private String itmCode;
	@Column(name="i_name")
	private String itmName;
	@Column(name="i_cost")
	private double itmCost;
	@Column(name="i_bcode")
	private String barcode;
	@Column(name="i_dcount")
	private String discount;
	@Column(name="i_mfd")
	private String mfd;
	
	public Item() {
		super();
	}
	
	public Item(int itmId) {
		super();
		this.itmId = itmId;
	}

	public int getItmId() {
		return itmId;
	}
	public void setItmId(int itmId) {
		this.itmId = itmId;
	}

	public String getItmCode() {
		return itmCode;
	}
	public void setItmCode(String itmCode) {
		this.itmCode = itmCode;
	}
	public String getItmName() {
		return itmName;
	}
	public void setItmName(String itmName) {
		this.itmName = itmName;
	}
	public double getItmCost() {
		return itmCost;
	}
	public void setItmCost(double itmCost) {
		this.itmCost = itmCost;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getMfd() {
		return mfd;
	}
	public void setMfd(String mfd) {
		this.mfd = mfd;
	}

	public Item(int itmId, String itmCode, String itmName, double itmCost, String barcode, String discount,
			String mfd) {
		super();
		this.itmId = itmId;
		this.itmCode = itmCode;
		this.itmName = itmName;
		this.itmCost = itmCost;
		this.barcode = barcode;
		this.discount = discount;
		this.mfd = mfd;
	}

	@Override
	public String toString() {
		return "Item [itmId=" + itmId + ", itmCode=" + itmCode + ", itmName=" + itmName + ", itmCost=" + itmCost
				+ ", barcode=" + barcode + ", discount=" + discount + ", mfd=" + mfd + "]";
	}

	@Override
	public int compareTo(Item o) {
		return this.getItmId()-o.getItmId();
	}

}
