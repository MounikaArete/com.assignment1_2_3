package com.assignment3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appconfig.xml");
		Fruits fruits = (Fruits)context.getBean("vitamin");
		System.out.println("Calling Vitamin method: "+fruits.getVitamin());
		
		context.close();
		
	}

}
