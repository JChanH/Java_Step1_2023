package chapter06;

import java.util.Scanner;

public class BaseBallGameuser {
	Scanner scan = new Scanner(System.in);

	public void check() {
		BaseballCom info = new BaseballCom();
		info.random();
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
			if (user1 == info.com1) {

				strike++;
			} else if (user1 == info.com2 || user1 == info.com3)
				ball++;

			if (user2 == info.com2) {

				strike++;
			} else if (user2 == info.com1 || user2 == info.com3)
				ball++;

			if (user3 == info.com3) {
				strike++;
			} else if (user3 == info.com2 || user3 == info.com1)
				ball++;

			if (user1 == info.com1 && user2 == info.com2 && user3 == info.com3) {
				System.out.println("정답" + info.com1 + info.com2 + info.com3);
				break;
			} else {
				if (user1 == info.com1 || user2 == info.com2 || user3 == info.com3) {
					System.out.println("스트라이크" + strike);
					System.out.println("볼" + ball);
				} else {
					System.out.println("아웃!");
				}

			}
		}
	}
}
