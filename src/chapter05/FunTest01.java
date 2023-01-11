package chapter05;

import javax.swing.JOptionPane;

public class FunTest01 {
	
	//합계 메서드 (함수)
	//접근지정자 : (공용: 제한없음) / protected (패키지내에서 공용으로 사용, 상속에서 사용) / private(class 내에서만 한정적으로 사용 가능함)          
 	
	//
	public static void sum(int num1, int num2) {//void = 리턴없음 //매게변수의 타입과 곗수만 잘 맞춰주자//순차지향형이지만 밑에 있어도 무관함

 		//int num1=3;
 		//int num2=5;
 		int total = num1 + num2;
 		System.out.println(total);
 		
		
		
	}
	
	//실행 담당하는 메소드
	public static void main(String[] args) {
		int a,b;
		a = Integer.parseInt(JOptionPane.showInputDialog("값1"));
		b= Integer.parseInt(JOptionPane.showInputDialog("값2"));
		//static 에서 호출되지 않았음 -> error
		//sum(a,b);
		
		
		FunTest01 obj = new FunTest01();//obj를 통해서 FunTest를 불러온다
		obj.sum(a, b);

	}

}
