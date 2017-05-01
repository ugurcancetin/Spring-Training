package com.ugurcan.springtraining;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		//read spring config file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		Trainer theTrainer = context.getBean("angularTrainer", Trainer.class);
		
		//call method to get daily Fortune
		System.out.println(theTrainer.GetDailyTraining());
		System.out.println(theTrainer.getDailyFortune());
		
		
		//close the context
		context.close();
	}

}
