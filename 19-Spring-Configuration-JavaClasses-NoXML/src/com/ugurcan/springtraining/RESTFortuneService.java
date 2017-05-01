package com.ugurcan.springtraining;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "REST Fortune Service";
	}

}
