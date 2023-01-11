package chapter05;

public class FunTest_Overloading {
	
	
	// 필드 = 맴버 변수
	
			//생성시 (디폴트 생략)
			
			//다형성을 만족
			
			
			//overloading : 메소드명을 통일성 있게 사용해야 하는 경우 메소드의 매게변수를 다르게하여 구현
			
			
	
	
	public void getReult(int n) {
		System.out.println(n+ "은(는) int 입니다");
	}
	public void getReult(String n) {
		System.out.println(n+ "은(는) String 입니다");
	}
	public void getReult(char n) {
		System.out.println(n+ "은(는) char 입니다");
	}
	public void getReult(int n, String str) {
		System.out.println(n+ "은(는) char 입니다");
	}
	

	public static void main(String[] args) {
		
		
		

	}

}
