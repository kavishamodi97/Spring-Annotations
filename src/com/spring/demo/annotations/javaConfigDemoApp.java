package com.spring.demo.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class javaConfigDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//read spring configuration java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// retrieve spring beans

		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		// call methods
		System.out.println(theCoach.getDailyWorkOut());
		
		System.out.println(theCoach.getDailyFortune());

		// close
		context.close();
	}

}
