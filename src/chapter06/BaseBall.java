package chapter06;

import java.util.Random;
import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) {
		// 야규게임
		Scanner scan = new Scanner(System.in);

		// 컴푸터가 발생한 난수 1개
		int com1 = 0;
		int com2 = 0;
		int com3 = 0;

		do {// 1부터 9사이의 난수 발생 (3개)
			com1 = new Random().nextInt(9) + 1;
			com2 = new Random().nextInt(9) + 1;
			com3 = new Random().nextInt(9) + 1;
		} while (!(com1 == com2 || com1 == com3 || com2 == com3));
		{
			// 같은숫자가 나오면 계속 반복 => 모두 같은 숫자가 나오지 않을때까지
		}
		// 컴푸터 준비 완료
		// 사용자가 입력할 수
		System.out.println("숫자 준비 완료");
		int user1 = 0;
		int user2 = 0;
		int user3 = 0;
		while (true) {
			System.out.println("1~9까지의 수를 입력하세여");
			System.out.print("첫번째 수를 입력하세여");
			user1 = scan.nextInt();
			System.out.print("두번째 수를 입력하세여");
			user2 = scan.nextInt();
			System.out.print("세번째 수를 입력하세여");
			user3 = scan.nextInt();

			int strike = 0;
			int ball = 0; //
			// 만약에 com1과 사용자가 입력한 젓번째 숫자가 같을 확율
			if (user1 == com1) {

				strike++;
			} else if (user1 == com2 || user1 == com3)
				ball++;

			if (user2 == com2) {

				strike++;
			} else if (user2 == com1 || user2 == com3)
				ball++;

			if (user3 == com3) {
				strike++;
			} else if (user3 == com2 || user3 == com1)
				ball++;

			// 정답처리
			if (strike == 3) {
				System.out.println("정답!!" + com1 + com2 + com3);
				break;
			} else {// 오답 처리
				if (strike == 0 && ball == 0) {
					System.out.println("아웃!!");
				} else {
					System.out.println("스트라이크" + strike);
					System.out.println("볼" + ball);
				}

			}

		}

	}

}
