package chapter06;

public class BaseballGameMain {

	public static void main(String[] args) {
		String check = "";
		BaseBallGameuser game = new BaseBallGameuser();
		
		do {
			check = game.check();
		} while (check != "Win"); //
		
		
		
		
	}

}
