package com.ugurcan.springtraining;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Trainer theTrainer = context.getBean("angularTrainer", Trainer.class);
		
		//call method to get daily Fortune
		System.out.println(theTrainer.GetDailyTraining());
		System.out.println(theTrainer.getDailyFortune());
		
		
		//close the context
		context.close();
	}

}
