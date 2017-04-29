package com.ugurcan.spring.training;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "This is from HappyFortuneService class";
	}

}
