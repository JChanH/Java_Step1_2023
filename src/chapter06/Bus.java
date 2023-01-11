package chapter06;

public class Bus {
	// 맴버
	public int busNumber; //버스 번호
	public int passengerCount; //승객수
	public int money; //얼마를 벌었는가? //플러스 누적

	// 디폴트 생성자 (생략상태)

	public Bus(int busNumber) { // 초기화
		this.busNumber = busNumber;
	}
	public void take(int money) {// 승객이 낸 돈
		
		this.money += money; //돈은 누적해준다
		passengerCount++; //승객의 수도 누적해준다
	}
	
	public void showinfo() {//버스의 정보를 출력
		
		System.out.println("버스 " + busNumber + "번의 승객은" + passengerCount + "명이고, 수입은" + money + "입니다." );
		
		
		
		
		
	}
	

}
