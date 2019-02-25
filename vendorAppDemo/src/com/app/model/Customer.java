	package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cus_tab")
public class Customer implements Comparable<Customer> {
	@Id
	@Column(name = "c_id")
	private int cusId;
	@Column(name = "c_code")
	private String cusCode;
	@Column(name = "c_name")
	private String cusName;
	@Column(name = "c_time")
	private double cntTime;
	@Column(name = "c_percent")
	private double percent;
	@Column(name = "c_mode")
	private String cusMode;
	@Column(name = "c_mail")
	private String cusMail;
	@Column(name = "c_type")
	private String cusType;
	@Column(name = "c_addr")
	private String custAddr;
	@Column(name = "c_desc")
	private String cusDesc;

	public Customer() {
		super();
	}

	public Customer(int cusId) {
		super();
		this.cusId = cusId;
	}

	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public String getCusCode() {
		return cusCode;
	}

	public void setCusCode(String cusCode) {
		this.cusCode = cusCode;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public double getCntTime() {
		return cntTime;
	}

	public void setCntTime(double cntTime) {
		this.cntTime = cntTime;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	public String getCusMode() {
		return cusMode;
	}

	public void setCusMode(String cusMode) {
		this.cusMode = cusMode;
	}

	public String getCusMail() {
		return cusMail;
	}

	public void setCusMail(String cusMail) {
		this.cusMail = cusMail;
	}

	public String getCusType() {
		return cusType;
	}

	public void setCusType(String cusType) {
		this.cusType = cusType;
	}

	public String getCustAddr() {
		return custAddr;
	}

	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}

	public String getCusDesc() {
		return cusDesc;
	}

	public void setCusDesc(String cusDesc) {
		this.cusDesc = cusDesc;
	}

	public Customer(int cusId, String cusCode, String cusName, double cntTime, double percent, String cusMode,
			String cusMail, String cusType, String custAddr, String cusDesc) {
		super();
		this.cusId = cusId;
		this.cusCode = cusCode;
		this.cusName = cusName;
		this.cntTime = cntTime;
		this.percent = percent;
		this.cusMode = cusMode;
		this.cusMail = cusMail;
		this.cusType = cusType;
		this.custAddr = custAddr;
		this.cusDesc = cusDesc;
	}

	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", cusCode=" + cusCode + ", cusName=" + cusName + ", cntTime=" + cntTime
				+ ", percent=" + percent + ", cusMode=" + cusMode + ", cusMail=" + cusMail + ", cusType=" + cusType
				+ ", custAddr=" + custAddr + ", cusDesc=" + cusDesc + "]";
	}

	@Override
	public int compareTo(Customer o) {
		return this.getCusId() - o.getCusId();
	}

}
