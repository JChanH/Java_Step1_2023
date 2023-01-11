package chapter06;

import java.util.Random;

public class BaseballCom {

	public int com1;
	public int com2;
	public int com3;

	int user1;
	int user2;
	int user3;

	
	public void user(int user1, int user2, int user3) {
		this.user1 = user1;
		this.user2 = user2;
		this.user2 = user2;
	
	}
	
	public void random(){
		do {// 1부터 9사이의 난수 발생 (3개)
			com1 = new Random().nextInt(9) + 1;
			com2 = new Random().nextInt(9) + 1;
			com3 = new Random().nextInt(9) + 1;
		} while (!(com1 == com2 || com1 == com3 || com2 == com3));
		// 같은숫자가 나오면 계속 반복 => 모두 같은 숫자가 나오지 않을때까지
		
		
	}
}
