package com.ugurcan.spring.training;

public class SpringTrainer implements Trainer {
	
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public SpringTrainer(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String getDailyTraining(){
		
		return "Study 30 mins on Spring MVC";
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
	
	public void startUpMethod(){
		System.out.println("define your start-up methods here");
	}
	public void cleanUpMethod(){
		System.out.println("define your clean-up methods here");
	}
}
