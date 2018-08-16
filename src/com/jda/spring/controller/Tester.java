package com.jda.spring.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jda.spring.beans.A;
import com.jda.spring.beans.Employee;
import com.jda.spring.beans.Question;

public class Tester {

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee employee = (Employee) context.getBean("employee");
		Question q = (Question) context.getBean("q");
		employee.show();
		q.displayInfo();
		  A a=(A) context.getBean("a");  
		    a.display();  
	}

}
