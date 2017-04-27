package com.ugurcan.spring.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		//retrieve bean from spring container
		GolangTrainer trainer = context.getBean("GolangTrainer", GolangTrainer.class);
				
		//call methods on the bean
		//will get back later
		System.out.println(trainer.getDailyFortune());
		System.out.println(trainer.getDailyTraining());
			
				
		//close the context	
		context.close();

	}

}
