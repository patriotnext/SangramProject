package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ven_tab")
public class Vendor implements Comparable<Vendor> {
	@Id
	@Column(name = "v_id")
	private int venId;
	@Column(name = "v_name")
	private String venName;
	@Column(name = "v_code")
	private String venCode;
	@Column(name = "v_type")
	private String venType;
	@Column(name = "v_mail")
	private String venEmail;
	@Column(name = "v_contact")
	private String venContact;
	@Column(name = "v_addr")
	private String venAddr;
	public Vendor() {
		super();
	}

	public Vendor(int venId) {
		super();
		this.venId = venId;
	}
	public int getVenId() {
		return venId;
	}

	public void setVenId(int venId) {
		this.venId = venId;
	}

	public String getVenName() {
		return venName;
	}

	public void setVenName(String venName) {
		this.venName = venName;
	}

	public String getVenCode() {
		return venCode;
	}

	public void setVenCode(String venCode) {
		this.venCode = venCode;
	}

	public String getVenType() {
		return venType;
	}

	public void setVenType(String venType) {
		this.venType = venType;
	}

	public String getVenEmail() {
		return venEmail;
	}

	public void setVenEmail(String venEmail) {
		this.venEmail = venEmail;
	}

	public String getVenContact() {
		return venContact;
	}

	public void setVenContact(String venContact) {
		this.venContact = venContact;
	}

	public String getVenAddr() {
		return venAddr;
	}

	public void setVenAddr(String venAddr) {
		this.venAddr = venAddr;
	}

	public Vendor(int venId, String venName, String venCode, String venType, String venEmail, String venContact,
			String venAddr) {
		super();
		this.venId = venId;
		this.venName = venName;
		this.venCode = venCode;
		this.venType = venType;
		this.venEmail = venEmail;
		this.venContact = venContact;
		this.venAddr = venAddr;
	}

	



	@Override
	public String toString() {
		return "Vendor [venId=" + venId + ", venName=" + venName + ", venCode=" + venCode + ", venType=" + venType
				+ ", venEmail=" + venEmail + ", venContact=" + venContact + ", venAddr=" + venAddr + "]";
	}

	@Override
	public int compareTo(Vendor o) {

		return this.getVenId() - o.getVenId();
	}

}
