package com.spring.demo.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	String data[] = { "Your limitation—it's only your imagination.", "Success doesn't just find you.",
			"Dream bigger." };

	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		String fortune = data[index];
		return fortune;
	}

}
