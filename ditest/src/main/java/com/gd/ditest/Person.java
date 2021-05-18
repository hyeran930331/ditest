package com.gd.ditest; //디펜드식 인덱스

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Person {
	public void drive() {
		Car c = new car;
		//car이라는 클래스가 없다면 실행되지 않아서 = 의존성이 높다.
		//그래서 Car이 없더라도 에러가 안나도록
		//1.첫번째 의존성 Car 데이터타입
		//2.두번째 생성자 Car()
		c.start();
	}
}
