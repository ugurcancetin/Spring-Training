package com.ugurcan.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAdress;
	private String team;
	
	
	
	 public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {

		System.out.println("CricketCoach : inside setter method- setEmailAddress");
		this.emailAdress = emailAdress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach : inside setter method- setTeam");
		this.team = team;
	}
	
	

	//create a no-arg constructor
	public CricketCoach(){
		
		System.out.println("CricketCoach : inside no-arg constructor");
	}
	
	// our setter method for injecting the dependency
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("I am inside of CricketCoach setter method");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
	
		return "This is a cricket coach advice";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
