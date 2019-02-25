package com.app.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
@Entity
@Table(name="doc_tab")
public class Document implements Comparable<Document>{
	@Id
	@Column(name="f_id")
	private int fId;
	@Column(name="f_name")
	private String fName;
	@Column(name="f_data")
	@Lob
	private byte[] fdata;
	public Document() {
		super();
	}
	
	
	public int getfId() {
		return fId;
	}


	public void setfId(int fId) {
		this.fId = fId;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public byte[] getFdata() {
		return fdata;
	}


	public void setFdata(byte[] fdata) {
		this.fdata = fdata;
	}


	@Override
	public String toString() {
		return "Document [fId=" + fId + ", fName=" + fName + ", fdata=" + Arrays.toString(fdata) + "]";
	}


	@Override
	public int compareTo(Document o) {
		return this.getfId()-o.getfId();
	}

}
