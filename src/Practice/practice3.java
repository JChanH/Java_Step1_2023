package Practice;

import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {
		int m,a,num2, balance =0;
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		while (run) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4.종료");
			System.out.println("-------------------------------");
			a=scan.nextInt();
				if (a==1) {
					System.out.println("선택" + a);
					System.out.println("현재금액" + balance);
					System.out.println("예금액>");
					m = scan.nextInt();
					balance += m;
					System.out.println("입금완료" + balance);
					while (m==0) { //while 문으로 제어 가능
						System.out.println("금액을 다시 입력해주세요");
						m = scan.nextInt();
						if (m!=0) {
							System.out.println(m+"원 입금완료");
							//break는 하지 않아도 빠져나온다??? 왜??
						}
					}
				}else if (a==2) {
					System.out.println("선택" + a);
					if (balance == 0){
						System.out.println("잔고가 없습니다.");
						
					}else {
					
					System.out.println("현재금액" + balance);
					System.out.println("출금액>");
					m= scan.nextInt();
					System.out.println("출금완료, 남은 잔액" + balance);

					while (m > balance) {
						System.out.println("금액이 부족합니다.");
					    System.out.println("다시 입력해 주세요");
					    m = scan.nextInt();
					    if (m < balance) {
					    	balance -= m;
					    	System.out.println("출금 완료, 남은 잔액" + balance);
					    }
					}
					}
				}else if (a==3) {
					System.out.println("잔고>" + balance);
				}
				else if (a==4) {
					System.out.println("종료합니다.");;	
				}
				else {
					System.out.println("잘못된 서비스를 선택하셨습니다");
				}
				
				//초기 패이지 설정
				System.out.println("1.초기메뉴 2.종료");//2번 누루면 종료 
				//1번 누루면 다시 시작
				num2 = scan.nextInt();
				
					if (num2 == 2) {
						run = false;
					}
					else if(num2 ==1){
						continue;
						
						}
					else{
						System.out.println("잘못된 서비스를 선택하셨습니다");
						System.out.println("다시 입력해 주세요");
						
				}
					
				
				
		} //while
		System.out.println("시스템을 종료합니다" + balance);
		
	}//main

}//class
