package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_ta")
public class User implements Comparable<User>{
	@Id
	@Column(name="u_id")
	private int uId;
	@Column(name="u_name")
	private String uName ;
	@Column(name="u_email")
	private String uemail ;
	@Column(name="u_contact")
	private String  uContact;
	@Column(name="u_pwd")
	private String  uPwd;
	@Column(name="u_address")
	private String  uAddress;
	
	
	
	public User() {
		super();
	}

	public User(int uId) {
		super();
		this.uId = uId;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getuContact() {
		return uContact;
	}

	public void setuContact(String uContact) {
		this.uContact = uContact;
	}

	public String getuPwd() {
		return uPwd;
	}

	public void setuPwd(String uPwd) {
		this.uPwd = uPwd;
	}

	public String getuAddress() {
		return uAddress;
	}

	public void setuAddress(String uAddress) {
		this.uAddress = uAddress;
	}
	

	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", uemail=" + uemail + ", uContact=" + uContact + ", uPwd="
				+ uPwd + ", uAddress=" + uAddress + "]";
	}

	@Override
	public int compareTo(User o) {
		return this.uId-o.uId;
	}

}
