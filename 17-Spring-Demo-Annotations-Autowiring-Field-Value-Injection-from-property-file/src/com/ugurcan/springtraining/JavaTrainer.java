package com.ugurcan.springtraining;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JavaTrainer implements Trainer {

	@Qualifier("randomFortuneService")
	@Autowired
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;

	@Value("${foo.team}")
	private String team;
	
	public JavaTrainer(){
		System.out.println(">> Java Trainer Constructor with no args");
	}
	
	@Override
	public String GetDailyTraining() {
		return "This is your new Java Trainer Baby!!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

}
