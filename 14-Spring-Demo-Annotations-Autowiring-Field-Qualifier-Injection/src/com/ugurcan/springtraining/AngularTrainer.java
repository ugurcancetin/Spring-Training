package com.ugurcan.springtraining;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AngularTrainer implements Trainer{

	//Class name with lowercase beginning
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	//define constructor with no args 
	public AngularTrainer() {
		System.out.println("Angular Training -> Inside of Contructor with no args");
	}

	@Override
	public String GetDailyTraining() {
		return "This is new Angular Training : Welcome to Angular Class";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
