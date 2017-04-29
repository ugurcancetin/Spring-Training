package com.ugurcan.spring.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleApp {
	
	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		Trainer theTrainer = context.getBean("myTrainer", SpringTrainer.class);
		
		System.out.println(theTrainer.getDailyTraining());
		
		context.close();
	}

}
