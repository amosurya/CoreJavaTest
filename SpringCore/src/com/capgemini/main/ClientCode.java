package com.capgemini.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.model.Employee;

public class ClientCode {

	public static void main(String[] args) {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("ApplicationContextConfig.xml");
		Employee employee = (Employee)context.getBean("emp");
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		
		System.out.println(employee.getAddress().getDepId());
		System.out.println(employee.getAddress().getDepName());
		Employee employeea = (Employee)context.getBean("myFoo");
		/*Employee employee1 = (Employee)context.getBean("empconst");
		System.out.println(employee1.getId());
		System.out.println(employee1.getName());*/
		
	/*	Employee employee1 = (Employee)context.getBean("empconst");
		System.out.println(employee1.getId());
		System.out.println(employee1.getName());*/
	}

}
