package com.annotations;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = {"com.mynewpack"})
public class MyConfigration {

//	@Bean //for create a bean of class
//	public Student getStudent() {
//		System.out.println("Student Object");
//		return new Student();
//	}
	@Bean //bean is used only for predefined classes // @Component is used for User Defined classes
	public Date getDate() {
		System.out.println("new Date creating");
		return new Date();
	}
	@Bean("Employee1")
	@Lazy
	public EmployeeComponentAnnotation getComponnet() {
		System.out.println("new Componant 1 creating");
		return new EmployeeComponentAnnotation("ram1");
	}
	@Bean("Employee2")
	@Lazy
	public EmployeeComponentAnnotation createComponnet() {
		System.out.println("new Componant 2 creating");
		return new EmployeeComponentAnnotation("ram");
	}
}
