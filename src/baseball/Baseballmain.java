package baseball;

public class Baseballmain {

	public static void main(String[] args) {

		String check = "";
		baseballinfo game = new baseballinfo();

		do {
			check = game.check(); // return한 check 값을 넣어준다
		} while (check != "WIN"); //

		System.out.println("승리~");
	}

}