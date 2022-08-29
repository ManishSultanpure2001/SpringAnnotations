package com.annotations;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {

	private String studentName;
	public Student() {
	 
		System.out.print("I am Constuector");
		// TODO Auto-generated constructor stub
	}
public boolean studentName() {
	System.out.print("I am Manish");
	return true;
}
	
}
