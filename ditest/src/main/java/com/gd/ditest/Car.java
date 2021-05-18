package com.gd.ditest;

import org.springframework.stereotype.Component;

@Component
public class Car implements ICar{ //상속
	@Override
	public void start() {
		System.out.println("자동차 출방!");
	}
}
