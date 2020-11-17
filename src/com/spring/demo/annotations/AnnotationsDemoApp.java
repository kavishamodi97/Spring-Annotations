package com.spring.demo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemoApp {

	public static void main(String[] args) {
		
		// read spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve spring beans

		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		// call methods
		System.out.println(theCoach.getDailyWorkOut());
		
		System.out.println(theCoach.getDailyFortune());

		// close
		context.close();

	}

}
