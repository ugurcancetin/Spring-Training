package com.ugurcan.springtraining;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AngularTrainer implements Trainer{

	private FortuneService fortuneService;
	
	@Autowired
	public AngularTrainer(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
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
