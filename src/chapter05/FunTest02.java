package chapter05;

public class FunTest02 {
	
	public static void swap (int x, int y) {
		//교체 알고리즘
		int temp = x; //x값을 temp에 넣어줌
		x=y; //y=값을 x에 넣어준다
		y=temp; //temp(x) 다시 y에 넣어준다
		System.out.println("swap() 호출 전 : a=" +x + ",b" + y);
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		
		System.out.println("swap() 호출 전 : a=" +a + ",b" + b);
		System.out.println("=================================");
		
		swap(a,b); //갯수 맞추자!!!!
		
		System.out.println("swap() 호출 후 : a=" +a + ",b" + b);
	}

}
