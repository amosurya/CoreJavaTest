package com.capgemini.model;

public class Address {
	
	private Long depId;
	private String depName;
	
	Address(){
	System.out.println("-------------");	
	}
	
	public Long getDepId() {
		return depId;
	}
	public void setDepId(Long depId) {
		this.depId = depId;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}

}
