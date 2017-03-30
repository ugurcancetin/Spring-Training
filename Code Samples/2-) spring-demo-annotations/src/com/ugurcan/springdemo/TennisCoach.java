package com.ugurcan.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;
	
	public TennisCoach(){
		System.out.println(">> Tennis Coach instructor");
	}
	
	/* This constructor injection
	@Autowired
	public TennisCoach(FortuneService theFortuneService){
		fortuneService=theFortuneService;		
	}
	*/
	
	// define  a setter method
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println(">> Tennis Coach setter");
	}*/
	
	@Override
	public String getDailyWorkout() {
		
		return ("This is tennis coach advice");
	}

	

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	
	

}
