package com.capgemini.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private Long id;
	private String name;
	
	@Autowired
	@Qualifier("address2")
	private Address address;
	

	/*Employee(Long id, String name){
		this.id=id;
		this.name=name;
		System.out.println("in constructor");
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
	}*/
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}


}
