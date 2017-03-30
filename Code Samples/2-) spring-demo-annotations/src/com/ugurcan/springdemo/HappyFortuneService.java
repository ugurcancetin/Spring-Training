package com.ugurcan.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "HappyFortuneService class getFortune method.Implemented FortuneService";
	}



}
