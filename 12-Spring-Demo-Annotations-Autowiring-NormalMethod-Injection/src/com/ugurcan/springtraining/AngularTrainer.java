package com.ugurcan.springtraining;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AngularTrainer implements Trainer{

	private FortuneService fortuneService;
	
	/*	@Autowired
	public AngularTrainer(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}*/
	
	//define constructor with no args 
	public AngularTrainer() {
		System.out.println("Angular Training -> Inside of Contructor with no args");
	}

	//create the setter injection here
	@Autowired
	public void AnyMethod(FortuneService thefortuneService) {
		this.fortuneService = thefortuneService;
		System.out.println("Angular Training -> Inside of AnyMethod-Injection");
	}

	
	@Autowired
	public void AnyOtherMethod(FortuneService thefortuneService) {
		this.fortuneService = thefortuneService;
		System.out.println("Angular Training -> Inside of AnyOtherMethod-Injection");
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
