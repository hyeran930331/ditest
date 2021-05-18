package com.gd.ditest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("test");
		Person p = new Person();
		p.drive(); //왜 아직도 nullpoint
	}

}
