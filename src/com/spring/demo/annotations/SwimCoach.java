package com.spring.demo.annotations;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private  FortuneService fortuneService;
	
	@Value("${foo.email}")
	String email;
	
	@Value("${foo.team}")
	String team;
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
		return "daily swim  2 hours";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

}
