package com.ugurcan.springtraining;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		Trainer phytonTrainer = context.getBean("phytonTrainerComponent", Trainer.class);
		Trainer groovyTrainer = context.getBean("groovyTrainer", Trainer.class);
		

		//call a method on the bean
		System.out.println(phytonTrainer.GetDailyTraining());
		System.out.println(groovyTrainer.GetDailyTraining());
		
		//close the context
		context.close();
	}

}
