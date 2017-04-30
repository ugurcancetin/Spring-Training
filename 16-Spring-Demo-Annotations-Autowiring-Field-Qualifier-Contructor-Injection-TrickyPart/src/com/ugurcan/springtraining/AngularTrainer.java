package com.ugurcan.springtraining;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AngularTrainer implements Trainer{

	//Class name with lowercase beginning
/*	@Autowired
	@Qualifier("randomFortuneService")*/
	private FortuneService fortuneService;
	
	//define constructor with no args 
	public AngularTrainer() {
		System.out.println("Angular Training -> Inside of Contructor with no args");
	}

	//define constructor 
	@Autowired
	public AngularTrainer(@Qualifier("randomFortuneService") FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside constructor using @autowired and @qualifier");
		 fortuneService = theFortuneService;
	}
	
	@Override
	public String GetDailyTraining() {
		return ">> getDailyTraining Method from Angular Trainer";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
		/*return fortuneService.getFortune();*/
	}

}
