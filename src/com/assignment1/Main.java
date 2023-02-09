package com.assignment1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//JavaLanguage JW = new JavaWorld();
		//System.out.println(JW.learningJava());
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("AppContext.xml");
		JavaLanguage JL = context.getBean("Framework",JavaLanguage.class);
		System.out.println("Calling Learning Java method: "+JL.learningJava());
		System.out.println("Calling Learning Python method: "+JL.learningPython());
		
		context.close();
		
	}

}
