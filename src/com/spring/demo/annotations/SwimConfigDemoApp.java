package com.spring.demo.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimConfigDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

		System.out.println(theCoach.getDailyWorkOut());

		System.out.println(theCoach.getDailyFortune());

		System.out.println("Email: " + theCoach.getEmail());

		System.out.println("Team: " + theCoach.getTeam());

		context.close();
	}

}
