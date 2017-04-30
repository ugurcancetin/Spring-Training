package com.ugurcan.springtraining;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AngularTrainer implements Trainer{

	//The magic is thanks Java reflection technology, we are able to inject this object.
	@Autowired
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
