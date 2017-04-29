package com.ugurcan.spring.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	
	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
						
		//retrieve bean from spring container
		SpringTrainer betaTrainer = context.getBean("myTrainer", SpringTrainer.class);
		SpringTrainer alphaTrainer = context.getBean("myTrainer", SpringTrainer.class);
		
		boolean result= (betaTrainer == alphaTrainer);
		
		System.out.println("\n Pointing the same object result : " + result);
		
		System.out.println("\n Memory Location for alphaTrainer : " + alphaTrainer);
		
		System.out.println("\n Memory Location for betaTrainer : " + betaTrainer);
		
		context.close();
	}

}
