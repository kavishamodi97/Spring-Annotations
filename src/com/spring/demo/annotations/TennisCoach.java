package com.spring.demo.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	

	// Constructor Injection with Annotations
	/*
	 * @Autowired public TennisCoach(FortuneService theFortuneService) {
	 * fortuneService=theFortuneService; }
	 */

	// Define setter methods for injection with annotations
//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService) {
//		this.fortuneService = theFortuneService;
//	}

	// define custom method Injection with annotations
	//@Autowired
	public void doPractice(FortuneService thFortuneService) {
		System.out.println("Set Up Method Injection");
		this.fortuneService = thFortuneService;
	}
	
	//define init method
	@PostConstruct
	public void doStartUpStuff() {
		System.out.println("Inside Init Method");
	}
	
	//define destroy method
	@PreDestroy
	public void doCleanUpStuff() {
		System.out.println("Inside Destroy Method");
	}
	
	@Override
	public String getDailyWorkOut() {
		return "Practice 30 Mintues for backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
