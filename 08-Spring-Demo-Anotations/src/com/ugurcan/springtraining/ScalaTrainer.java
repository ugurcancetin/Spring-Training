package com.ugurcan.springtraining;

import org.springframework.stereotype.Component;

@Component("ScalaTrainerComponent")
public class ScalaTrainer implements Trainer {

	@Override
	public String GetDailyTraining() {
		return "Practice Scala daily 1 hr";
	}

}
