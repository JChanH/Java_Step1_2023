package Practice;

import java.util.Scanner;

public class pra0103 {

	public static void main(String[] args) {
		
		boolean run = true;
		int balance =0;
		
		
		while (run) { //true 인 상태에서는 계속 진행 
			Scanner scan = new Scanner(System.in);
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4.종료");
			System.out.println("-------------------------------");
			System.out.println("선택>");
			int a = scan.nextInt();
			switch(a) {
				case 1:
					System.out.println("예금액>");
					int m = scan.nextInt();
					balance +=m;
					break;
				case 2:
					System.out.println("출금액>");
					m = scan.nextInt();
					if (m>balance) {
						System.out.println("금액이 부족합니다");
					}else {	
						balance -=m;
					}
					break;
				case 3:
					System.out.println("잔고>" + balance);
					break;
				case 4:
					run = false;
					break;
			}//switch
			
		
	}//while

}//main
}//class