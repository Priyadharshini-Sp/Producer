package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {
	@RequestMapping("/employee")
	public Employee data() {
		Employee e=new Employee();
		e.setEid(1);
		e.setEname("Priya");
		e.setSalary(50000);
		e.setEid(2);
		e.setEname("riya");
		e.setSalary(30000);
		return e;
	}

}
