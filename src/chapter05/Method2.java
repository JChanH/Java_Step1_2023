package chapter05;

import java.util.Scanner;

public class Method2 {
	int count = 0, num;
	boolean run = true;
	String str = "";

	Scanner sc = new Scanner(System.in);
	Method br = new Method ();

	void order2() {
	while(run) {
			System.out.println("1. 빵 갯수 선택 | 2. 빵의 객수와 종류 | 3. 종료");
			System.out.print("선택>" );
			num = sc.nextInt();
			switch (num) {
			case 1 :
				System.out.println("주문할 빵의 갯수");
				count = sc.nextInt();
				br.makeBread(count);
				break;
			case 2:
				System.out.println("주문할 빵의 갯수>");
				count = sc.nextInt();
				System.out.println("빵의 종류>");
				str = sc.next();
				br.makeBread(count, str);
			break;
				default:
					System.out.println("프로그램 종료");
					run = false;
		}
}
}
}