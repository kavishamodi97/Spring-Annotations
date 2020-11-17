package com.spring.demo.annotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Yeah Today is your lucky Day!!";
	}

}
