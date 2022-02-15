package com.demo.autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach=context.getBean("cricketCoach",Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getHappyFortune());
		
		context.close();
		
	}
	
}
