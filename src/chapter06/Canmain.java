package chapter06;

import java.util.Scanner;

public class Canmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int money = 0;
		String out = "";
		banding ven = new banding();
		
		
		//돈을 투입
		System.out.println("얼마를 가지고 있습니까?");
		ven.init(); //우선 init로 저장된 정보를 뿌리고 
		money= scan.nextInt();
		ven.showCans(money); //변수 money를 넣어준다 
		
		
		//음료를 선택하세요
		System.out.print("음료를 선택하세여:");
		out = scan.next(); //next를 
		ven.outCan(out);
		
		
		
		
		
	}

}
