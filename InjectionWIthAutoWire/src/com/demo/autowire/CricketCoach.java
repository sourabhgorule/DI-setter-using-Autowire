package com.demo.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	
	private Fortune fortune;
	
	
	@Autowired
	public void setFortune(Fortune fortune) {
		this.fortune = fortune;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "run hard";
	}

	@Override
	public String getHappyFortune() {
		// TODO Auto-generated method stub
		return fortune.getDailyForune();
	}

}

/* Question
 I have commented the Autowired annotation. But still it worked. How did it work?

	    //@Autowired
	    public TennisCoach(FortuneService theFortuneService) {
	        System.out.println(" theFortuneService " + theFortuneService);
	        fortuneService = theFortuneService;
	    }
	===

	Answer

	This is a new feature of Spring 4.3.

	Here is the snippet from the Spring Docs.

	Section 1.9.2: Autowired

	As of Spring Framework 4.3, an @Autowired annotation on such a 
	constructor is no longer necessary if the target bean only defines
	 one constructor to begin with. However, if several constructors 
	 are available, at least one must be annotated to teach the container
	  which one to use.*/
