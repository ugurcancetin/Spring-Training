package com.ugurcan.spring.training;

public class JavaTrainer implements Trainer{

	//As happened on Spring Trainer Class
	private FortuneService fortuneService;
	
	//Creating the constructor Injection
	public JavaTrainer(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}	
	
	@Override
	public String getDailyTraining() {

		return "Study 1hr Java everyday";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

	public void test(){
		fortuneService.testFortune();
	}
}
