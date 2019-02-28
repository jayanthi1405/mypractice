package com.lenova.tmt.security.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Details {

	@Id
	private int usename;
	private String passward;
	
	@Override
	public String toString() {
		return "Details [usename=" + usename + ", passward=" + passward + "]";
	}
	public int getUsename() {
		return usename;
	}
	public void setUsename(int usename) {
		this.usename = usename;
	}
	public String getPassward() {
		return passward;
	}
	public void setPassward(String passward) {
		this.passward = passward;
	}
	
	
	
	
	

}
