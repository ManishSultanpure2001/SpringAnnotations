package com.mynewpack;

import org.springframework.stereotype.Component;

@Component
public class Dog {

	public Dog() {
		System.out.println("I am dog class Constructor");
	}
	public boolean eating() {
		System.out.println("Dog is eating");
		return true;
	}

	
}
