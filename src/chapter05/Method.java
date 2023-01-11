package chapter05;

import java.util.Scanner;

public class Method {

	// 맴버변수(=필드)

	// 생성자 생략

	// 매소드

	void makeBread() {
		System.out.println("빵을 만듭니다");

	}

	// 매소드 1 overloading

	void makeBread(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + "빵을 만들었습니다.");
		}
		System.out.println("요청하신" + count + "개의 빵이 모두 완료되었습니다");

	}

	// method 2
	void makeBread(int count, String str) {
		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + "번" + str + "을 만들었습니다.");
		}
		System.out.println("요청하신" + count + str + "빵이 모두 완료되었습니다");

	}

	// order method
	void order() {
		int count = 0;
		String str = null;
		Scanner sc = new Scanner(System.in);
		boolean Con = true;
		int x;
		while (Con) {
			System.out.println("1. 빵 갯수 선택 | 2. 빵의 객수와 종류 | 3. 종료");
			System.out.print("선택>" );
			x = sc.nextInt();
			if (x == 1) {
				System.out.println("주문할 빵의 갯수");
				count = sc.nextInt();
				makeBread(count);
			} else if (x == 2) {
				System.out.println("주문할 빵의 갯수>");
				count = sc.nextInt();
				System.out.println("빵의 종류>");
				str = sc.next();
				makeBread(count, str);
			}
			else {
				System.out.println("프로그램 종료");
				Con = false;
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
