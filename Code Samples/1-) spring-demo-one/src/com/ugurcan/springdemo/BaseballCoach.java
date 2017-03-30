package com.ugurcan.springdemo;

public class BaseballCoach implements Coach{

	
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService)
	{
		fortuneService=theFortuneService;
		
	}
	
	@Override
	public String getDailyWorkout(){
		return("this is Baseball Coach advice");
	}

	@Override
	public String getDailyFortune() {
		
		// use the fortuneService to get a fortune
		
		return fortuneService.getFortune();
	}
}
