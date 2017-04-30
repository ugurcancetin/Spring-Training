package com.ugurcan.springtraining;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Happy Fortune Service say : Today is your lucky day!";
	}

}
