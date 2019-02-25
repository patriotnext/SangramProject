package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_Tab")
public class Order implements Comparable<Order>{
	
	@Id
	@Column(name="o_id")
	private int oId;
	@Column(name="o_code")
	private String oCode;
	@Column(name="o_cost")
	private double oCost;
	@Column(name="o_dsknt")
	private double dsknt;
	@Column(name="o_custid")
	private int custId;
	

	public Order() {
		super();
	}

	public Order(int oId) {
		super();
		this.oId = oId;
	}

	public int getoId() {
		return oId;
	}

	public void setoId(int oId) {
		this.oId = oId;
	}

	public String getoCode() {
		return oCode;
	}

	public void setoCode(String oCode) {
		this.oCode = oCode;
	}

	public double getoCost() {
		return oCost;
	}

	public void setoCost(double oCost) {
		this.oCost = oCost;
	}

	public double getDsknt() {
		return dsknt;
	}

	public void setDsknt(double dsknt) {
		this.dsknt = dsknt;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}
	@Override
	public String toString() {
		return "Order [oId=" + oId + ", oCode=" + oCode + ", oCost=" + oCost + ", dsknt=" + dsknt + ", custId=" + custId
				+ "]";
	}
	@Override
	public int compareTo(Order o) {
		return this.oId-o.oId;
	}
	
	

}
