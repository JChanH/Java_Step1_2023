package chapter06;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		
		Car C = new Car();
		System.out.println("제작회사 :" + C.company);
		System.out.println("모델명 :" + C.model);
		System.out.println("색깔 :" + C.color);
		System.out.println("최고속도 :" + C.maxSpeed);
		System.out.println("최고속도 :" + C.speed);
		System.out.println("------------------------");
		C.speed = 60;
		System.out.println("변경된 현재속도 :" + C.speed);
		
		
		
		
		
	}
}

