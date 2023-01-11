package chapter06;

import java.util.Random;

public class Start {

	private int random = new Random().nextInt(50) + 1;
	private int count = 0, answear;
	public String result = "FAIL";

	public String check(int mynumber) {
		// ramdom 값보다 작으면 up/ 크면 down / 일치하면 -> result = "SUCCESS"
		count++;

		if (mynumber < random) {
			System.out.println("up");
		} else if (mynumber > random)
			System.out.println("down");
		else {
			System.out.println(count + "만에 정답");
			result = "SUCCESS";
		}

		return result;

	}

}
