package com.spring.demo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
	

		//load spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean
		
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		
		Coach alphaCoach=context.getBean("tennisCoach",Coach.class);
		
		boolean isSame=(theCoach==alphaCoach);
		
		System.out.println("Point to same memory location or not?? " + isSame);
		
		System.out.println("Memory location of Object 1 is:- " +theCoach);
		
		System.out.println("Memory location of Object 2 is:- " +alphaCoach);
	
		//close
		context.close();
	}

}
