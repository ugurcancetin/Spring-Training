package com.ugurcan.springtraining;

import org.springframework.stereotype.Component;

@Component
public class GroovyTrainer implements Trainer {

	@Override
	public String GetDailyTraining() {
		return "Don't forget to practice at Groovy Scpripts";
	}

	@Override
	public String getDailyFortune() {
		return "Groovy Traine gives Fortune Service,too!!!";
	}

}
