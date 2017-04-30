package com.ugurcan.springtraining;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		JavaTrainer theTrainer = context.getBean("javaTrainer", JavaTrainer.class);
		
		//call method to get daily Fortune
		System.out.println(theTrainer.GetDailyTraining());
		System.out.println(theTrainer.getDailyFortune());
		
		System.out.println("Email : " + theTrainer.getEmail());
		System.out.println("Team : " + theTrainer.getTeam());
		
		
		//close the context
		context.close();
	}

}
