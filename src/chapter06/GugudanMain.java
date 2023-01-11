package chapter06;

import java.util.Scanner;

public class GugudanMain {

	public static void main(String[] args) {
		GuguDan gd = new GuguDan();
		
		int num ; 
		System.out.println("출력할 단을 일력하세요");
		Scanner sc=new Scanner(System.in);
		num = sc.nextInt();
		gd.showTable(num);
		
		
		
		
	}

}
