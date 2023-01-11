package chapter06;

public class TakeTrans {
//객체 (실행)
	public static void main(String[] args) {
		// 학생 2명 생성
		StdInfo studentJames = new StdInfo("James", 12000, 1); // money를 넣어준거
		StdInfo studentTom = new StdInfo("Tom", 12000, 2);

		// 버스타기
		Bus bus100 = new Bus(100); //Bus내부의 busNumber에 100을 넣어준다
		studentJames.takebus(bus100); //StdInfo내부의 takebus에 대입 (같은 타임으로 받아 주어야 함 = bus의 매게변수
		
		  // 정보확인
		studentJames.showInfo();
		bus100.showinfo();

		// 지하철타기
		Subway subway = new Subway("명동"); // Subway 내부에 lineNumber에 "명동"을 저장하고 subway라는 매게를 통해 공간을 마련한다 
		studentTom.takeSubway(subway); //같은 매게변수인 subway를 대입한다
		
		// 정보확인
		studentTom.showInfo();
		subway.showinfo();
		
		//지하철 타기
		Subway subwayGreen  =new Subway("2호선");
		studentTom.takeSubway(subwayGreen);
		
		studentTom.showInfo();
		subway.showinfo();
		
	}

}
