package chapter05;

public class FunTest08 {
	
	//맴버 변수(필드)
	
	//디폰트 생성시
	
	//매소드 : 재귀함수 //자기가 자기를 호출하는 함수
	public static int Recur(int a) { //매게변수를 변경하면서 계속 자기 자신을 소환함
		int result;
		//팩토리얼 함수  ex. 5*4*3*2*1*
		System.out.println(a + " ");
		
		if (a==1) {
			return(1);
			
		}else {
			result = a*Recur(a-1); //5*(4*(3*(2*1))
		}
		
		
		//return (1); //정상종료는 아니지만 오류없이 코드의 흐름을 막는다...
		return result; //정상종료되었으나 넘어가는 값이 없음 
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		Recur(0);
		int x =5;
		System.out.println("메소드 호출");
		int res= Recur(x);
		System.out.println();
		System.out.println("1 ~ " + x + "까지의 수를 곱한 값 :" + );
		
		
		
	}

}
