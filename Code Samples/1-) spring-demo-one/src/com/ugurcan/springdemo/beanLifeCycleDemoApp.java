package com.ugurcan.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanLifeCycleDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("beanScoper-applicationContext.xml");
		
		
		//retrieve bean from spring container
		Coach theCoach=context.getBean("myCoach",Coach.class);
		Coach alphaCoach=context.getBean("myCoach",Coach.class);

		//check if they are the same 
		boolean result = (theCoach == alphaCoach);
		System.out.println("\nPointing to the same object: " + result);
		System.out.println("\nMemory Location for theCoach: " + theCoach);
		System.out.println("\nMemory Location for theCoach: " + alphaCoach);
		
		context.close();
	}

}
