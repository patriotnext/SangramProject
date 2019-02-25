package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cused_tab")
public class CustomerED implements Comparable<CustomerED> {
	@Id
	@Column(name="c_id")
	private int cId;
	@Column(name="c_name")
	private String cName;
	@Column(name="c_Email")
	private String cEmail;
	@Column(name="c_Type")
	private String cType;
	@Column(name="c_Addr")
	private String cAddr;
	@Column(name="c_password")
	private String password;
	@Column(name="c_tock")
	private String accTock;

	public CustomerED() {
		super();
	}

	public CustomerED(int cId) {
		super();
		this.cId = cId;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcEmail() {
		return cEmail;
	}

	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}

	public String getcType() {
		return cType;
	}

	public void setcType(String cType) {
		this.cType = cType;
	}

	public String getcAddr() {
		return cAddr;
	}

	public void setcAddr(String cAddr) {
		this.cAddr = cAddr;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccTock() {
		return accTock;
	}

	public void setAccTock(String accTock) {
		this.accTock = accTock;
	}
	
	

	@Override
	public String toString() {
		return "CustomerED [cId=" + cId + ", cName=" + cName + ", cEmail=" + cEmail + ", cType=" + cType + ", cAddr="
				+ cAddr + ", password=" + password + ", accTock=" + accTock + "]";
	}

	@Override
	public int compareTo(CustomerED o) {
		return this.cId-o.cId;
	}
	



}
