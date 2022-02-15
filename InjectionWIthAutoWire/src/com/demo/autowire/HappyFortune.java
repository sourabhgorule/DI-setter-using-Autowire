package com.demo.autowire;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements Fortune{

	@Override
	public String getDailyForune() {
		// TODO Auto-generated method stub
		return "Today is your lucky day....";
	}

}
