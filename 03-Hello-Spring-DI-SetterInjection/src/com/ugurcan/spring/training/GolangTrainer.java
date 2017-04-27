package com.ugurcan.spring.training;

public class GolangTrainer implements Trainer {
	
	private FortuneService fortuneService;

	
	
	
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
