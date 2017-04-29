package com.ugurcan.spring.training;

public class GolangTrainer implements Trainer {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	
	
	public String getEmailAddress() {
		System.out.println("GolangTrainer : Get email address"); 
		return emailAddress;
	}

	public void setEmailAddress(String emailAdress) {
		System.out.println("GolangTrainer : Set email address");
		this.emailAddress = emailAdress;
	}

	public String getTeam() {
		System.out.println("GolangTrainer : Get team");
		return team;
	}

	public void setTeam(String team) {
		System.out.println("GolangTrainer : Set team");
		this.team = team;
	}

	public GolangTrainer() {
		System.out.println("Inside of no-arg Constructor of GolangTrainer"); 
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Inside of setter Method of GolangTrainer"); 
	}

	@Override
	public String getDailyTraining() {
		return "Golang Trainer says that : Learn basics of Go.";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
