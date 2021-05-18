package com.gd.ditest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// ApplicationContext ac -> Spring 2개의 빈 1)new Car(); 2)new Person();
		System.out.println("test");
		//새로운걸 만들면 안되고 Person p = new Person(); 
		//빈을 가져오기
		ApplicationContext ac = SpringApplication.run(Application.class, args);
		Person p = ac.getBean(Person.class); 
		p.drive(); //왜 아직도 nullpoint
	}

}
