package com.ugurcan.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
	
		return("Today is your lucky day.."
				+ "Fortune Service Class");
	}

}
