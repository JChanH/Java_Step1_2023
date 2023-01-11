package chapter06;

public class Subway {

	public String lineNumber;
	public int passengerCount;
	public int money;

	// 디폴트 생성자 (생략상태)

	public Subway(String lineNumber) { // 초기화
		this.lineNumber = lineNumber;
	}
	public void take(int money) {// 승객이 낸 돈
		this.money += money; //돈은 누적해준다
		passengerCount++; //승객의 수도 누적해준다
	}
	
	public void showinfo() {//버스의 정보를 출력
		
		System.out.println("버스 " + lineNumber + "번의 승객은" + passengerCount + "명이고, 수입은" + money + "입니다." );
		
		
		
		
		
	}
}
