package com.ugurcan.springtraining;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AngularTrainer implements Trainer{

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//define constructor with no args 
	public AngularTrainer() {
		System.out.println("Angular Training -> Inside of Contructor with no args");
	}

/*	//define constructor 
	@Autowired
	public AngularTrainer(@Qualifier("randomFortuneService") FortuneService theFortuneService) {
		System.out.println(">> AngularTrainer: inside constructor using @autowired and @qualifier");
		 fortuneService = theFortuneService;
	}
	*/
	//define my init method
	//it has to be public void
	@PostConstruct
	public void doAnyStartUpStuff(){
		System.out.println(">> This is my init stuff");
	}
	
	//define my destroy method
	//it has to be public void
	@PreDestroy
	public void cleanUpStuff(){
		System.out.println(">> This is my clean up stuff");
	}
	
	@Override
	public String GetDailyTraining() {
		return ">> getDailyTraining Method from Angular Trainer";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
