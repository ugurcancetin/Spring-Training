package com.ugurcan.springtraining;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		Trainer theTrainer = context.getBean("ScalaTrainerComponent", ScalaTrainer.class);
		
		//call a method on the bean
		System.out.println(theTrainer.GetDailyTraining());
		
		//close the context
		context.close();
	}

}
