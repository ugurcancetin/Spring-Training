package com.ugurcan.springtraining;

import org.springframework.stereotype.Component;

@Component("phytonTrainerComponent")
public class Phyton implements Trainer {

	@Override
	public String GetDailyTraining() {
		return "Phyton Trainer says :) :) ";
	}

	@Override
	public String getDailyFortune() {
		return "Phyton Trainer give also Fortune Service ";
	}

}
