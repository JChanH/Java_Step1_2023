package chapter05;

import javax.swing.JOptionPane;

public class TryCatch { //예외처리 TryCatch문 사용법 //예상치 않은 일이 일어났을때 처리 방법 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int num1, num2;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("값1"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("값2"));
		/*
		
		int res = num1/num2;
		System.out.println(res);
		*/
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		//at chapter05.TryCatch.main(TryCatch.java:18) 
		//값에 0을 넣어주는 경우 위와 같이 애러가 뜬다.
		
		//위에서 애러가 나는 경우에 아래까지 읽지 않지만, trycatch문에서는 전부 읽어준다
		try { //해당 작업 코드
			System.out.println(num1/num2);

		}catch (ArithmeticException e) { //각종 애러 코드만 모아둔 곳 ==>Exception + 변수방 아무거나 넣어주기

			//ArithmeticException (수학적 애러가 나는 경우)
			System.out.println("숫자 0으로는 나눌수 없습니다.");
			
		}
		System.out.println("error 후 컴파일 => 프로그램 종료");
		
	}

}
