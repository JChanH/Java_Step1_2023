package baseball;

import java.util.Random;
import java.util.Scanner;

public class baseballinfo {
	// 맴버변수
	public int user1;
	public int user2;
	public int user3;
	public int com1;
	public int com2;
	public int com3;
	// 초기화 (0이나 공백으로 설정)
	public int strike = 0;
	public int ball = 0;
	public String check = "";

	Scanner scan = new Scanner(System.in);

	public String check() {
		String check = "";
		//int com1 = 0, com2 = 0, com3 = 0;
		baseballinfo base = new baseballinfo(); // 같은 클래스 내부이더라도 불러와야 한다
		do {// 1부터 9사이의 난수 발생 (3개) 정보 맴버 변수에 넣어주기
			base.com1 = new Random().nextInt(9) + 1;
			base.com2 = new Random().nextInt(9) + 1;
			base.com3 = new Random().nextInt(9) + 1;
		} while (base.com1 == base.com2 || base.com2 == base.com3 || base.com1 == base.com3);

		// 컴푸터 준비 완료
		// 사용자가 입력할 수
		System.out.println("숫자 준비 완료");
		while (true) {
			System.out.println("1~9까지의 수를 입력하세여");
			System.out.print("첫번째 수를 입력하세여");
			base.user1 = scan.nextInt();
			System.out.print("두번째 수를 입력하세여");
			base.user2 = scan.nextInt();
			System.out.print("세번째 수를 입력하세여");
			base.user3 = scan.nextInt();

			// 만약에 com1과 사용자가 입력한 젓번째 숫자가 같을 확율
			if (base.user1 == base.com1) {
				strike++;
			} else if (base.user1 == base.com2 || base.user1 == base.com3)
				ball++;

			if (base.user2 == base.com2) {

				strike++;
			} else if (base.user2 == com1 || base.user2 == base.com3)
				ball++;

			if (base.user3 == base.com3) {
				strike++;
			} else if (base.user3 == base.com2 || base.user3 == base.com1)
				ball++;

			// 정답처리
			if (strike == 3) {                                            
				System.out.println("정답!!" + base.com1 + base.com2 + base.com3);
				check = "WIN";
				break;
			} else {// 오답 처리
				if (strike > 0 || ball > 0) {
					System.out.println("스트라이크" + strike);
					System.out.println("볼" + ball);
				} else {
					System.out.println("Out");
				} // else
				System.out.println("==========================");

			} // else
			//값 클리어 
			strike =0;
			ball=0;

		} // while
		return check; // check 값을 반환한다
	}// check

}
