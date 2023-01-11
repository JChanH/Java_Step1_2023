package chapter05;

import java.util.Scanner;

public class FunTest_Overloading_main {

	
	public static void main(String[] args) {
		FunTest_Overloading OV = new FunTest_Overloading();
		
		OV.getReult(4);
		OV.getReult("김찬희");
		OV.getReult('a');
		
		
		OV.getReult(6 , "2023");
		
		
		
		
	}
}
