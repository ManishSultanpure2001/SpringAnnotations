package com.annotations;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mynewpack.Dog;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner
{
	@Autowired
	private Student student;
	@Autowired
	private Date date;
	@Autowired
	@Qualifier("Employee2")
	private  EmployeeComponentAnnotation componentAnnotation;
	@Autowired
	private Dog dog;
    public static void main( String[] args )
    {
    SpringApplication.run(App.class, args);
    }
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println( "Hello World!"+ student);
	       System.out.println( "Hello World!"+ componentAnnotation);
		System.out.println(dog.eating());
	}

	
}
