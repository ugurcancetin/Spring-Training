package com.ugurcan.spring.training;

public class PhytonTraining implements Trainer {

	private FortuneService fortuneService;
	
	

	public PhytonTraining() {
		super();
		System.out.println("Pyhton Training Class Constructor no field");
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Phyton Trainer Class -> setFortuneService Method");
	}

	@Override
	public String getDailyTraining() {
		return "Phyton Trainer Class";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
