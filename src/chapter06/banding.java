package chapter06;

import java.util.Scanner;

public class banding {
//맴버변수

	private Can[] can = new Can[5];
	private int money;
	// can[0] = new Can("환타", 1000); private 변수방임으로 반드시 메소드 안에서 초기화 한다.

	// 메소드
	public void init() { // 변수 초기화
		can[0] = new Can("환타", 1000); // 선언만 해주는 경우 ... 메서드 안에만 구현해야함
		can[1] = new Can("콜라", 2000); // 선언만 해주는 경우 ... 메서드 안에만 구현해야함
		can[2] = new Can("사이다", 1500); // 선언만 해주는 경우 ... 메서드 안에만 구현해야함
		can[3] = new Can("제로", 2500); // 선언만 해주는 경우 ... 메서드 안에만 구현해야함
		can[4] = new Can("참이슬", 3000); // 선언만 해주는 경우 ... 메서드 안에만 구현해야함

	}

	// 사용 가능한 음료수 보여주기
	public void showCans(int m) { // Canmain에서 가져온 money를 다시 m으로 변환
		money = m; // m은 다시 money로 변환해 준다
		for (int i = 0; i < can.length; i++)
			// 돈과 가격과 비교
			if (can[i].getPrice() <= money) { // Price에 입력된 정보를 가져온다{
				System.out.println(can[i].getCanName() + " - " + can[i].getPrice());
				
			}
	}

	public void outCan(String name) {
		for (int i = 0; i < can.length; i++)
			if (can[i].getCanName().equals(name)) {
				System.out.println(can[i].getCanName() + "을 선택하셨습니다.");
				System.out.println("잔액 : " + (money - can[i].getPrice()));
			}

	}

}
