package chapter06;

import java.util.Scanner;

public class StartMain {
	public static void main(String[] args) {

		int select, bet;
		String check;
		Start start = new Start();
		Scanner sc = new Scanner(System.in);

		// 객체생성

		while (true) {
			System.out.println("숫자를 입력하세요");
			bet = sc.nextInt();
			start.check(bet);
			if (start.result == "SUCCESS")
				break;

			/*
			do{
				System.out.print("숫자 입력 : ");
				num = s.nextInt();
			}while(obj.check(num).equals("FAIL")); // 값이 틀리면 계속 Fail을 return하니까 
			//SUCCESS가 나올때까지 돌린다
		*/
		}
	}
}
