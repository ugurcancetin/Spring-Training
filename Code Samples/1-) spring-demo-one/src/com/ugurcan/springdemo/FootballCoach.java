package com.ugurcan.springdemo;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public FootballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return ("This is a football Coach advice");
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "football coach says that : " + fortuneService.getFortune();
	}

	//add an init method
	public void doMyStartupStuff(){
		
		System.out.println("Football Coach : inside method of doMyStartupStuff");
	}
	//add a destroy method
	public void doMyCleanupStuff(){
		
		System.out.println("Football Coach : inside method of doMyCleanupStuff");
	}
}
