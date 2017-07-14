package com.ugurcan.spring.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");

		//retrieve bean from spring container
		Trainer trainer = context.getBean("myTrainer", Trainer.class);

		FortuneService fortuneService = context.getBean("myFortune", FortuneService.class);
		System.out.println(fortuneService.getFortune());
		
		
		//call methods on the bean
		System.out.println(trainer.getDailyTraining());

		//let's call our new methods for fortunes
		System.out.println(trainer.getDailyFortune());

		//close the context
		context.close();
	}

}
