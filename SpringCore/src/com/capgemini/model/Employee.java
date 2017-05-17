package com.capgemini.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private Long id;
	private String name;
	
	//@Autowired
	private Address address;
	
	
	Employee(){
		System.out.println("in emp constructor def");
	}
	Employee(Long id, String name){
		System.out.println("in emp constructor arg");
		this.id=id;
		this.name=name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}


}
