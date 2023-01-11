package chapter05;

import java.util.Scanner;

public class FunTest07 {
/*
	public static String edustep(int edu) { //값은 int로 받고 String으로 출력한다

		String step;

		if (edu == 1) {
			step = "1단계";
		}
		if (edu == 2) {
			step = "2단계";
		}
		if (edu == 3) {
			step = "3단계";
		}
		else {
			step = "해당하는 단계가 없습니다";
			
		}
		
		
		return step;

	} //메소드
*/
	
	public static void edustep (int edu) { //값은 int로 받고 String으로 출력한다

		String step;

		if (edu == 1) {
			step = "1단계";
		
		}
		else if (edu == 2) {//else if을 사용해야 한다
			step = "2단계";
	
		}
		else if (edu == 3) {
			step = "3단계";
			
		}
		else {
			step = "해당하는 단계가 없습니다";
			
		}
		System.out.println("현재 수업 단계는"+step + "입니다");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunTest07 ED = new FunTest07();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("스터디 단계를 입력하세요");
		int number = sc.nextInt();
		edustep(number);
		System.out.println(number);
		
		//String step = edustep(number);
		
		//System.out.println("현재 수업 단계는 :" + step + "입니다.");
		//System.out.println("현재 수업 단계는 :" + edustep(number) + "입니다.");
		
		//return 값이 없는 경우
		
		
		
	}

}
