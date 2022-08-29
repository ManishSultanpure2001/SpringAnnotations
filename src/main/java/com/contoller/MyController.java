package com.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.annotations.Student;

@Controller
@ComponentScan(basePackages = {"com.annotations"})
public class MyController {
	
	@Autowired
private Student student;
	
@RequestMapping(value="/home",method = RequestMethod.GET)
@ResponseBody//serialize the object and return in the JSON form
	public Student home(@RequestBody Student st) {
	System.out.println("I am Controller");
		return student;
	}

//@RequestMapping(value = "/user/{userId}",method = RequestMethod.GET)
//public String user(@PathVariable("userId" Integer id)) {
//	return String.valueOf(id);
//}
	
}
