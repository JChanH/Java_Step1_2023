package chapter05;

import javax.swing.JOptionPane;

public class FunTest04 {
	
	
	public static void Disp(String A[]) {
		String res = ""; //초기화
		
		//res에 str 값을 넣어준다
		for(int i =0 ; i < A.length ; i++) {
			res += A[i] +" " ; 
			
		/*
		 * for (String str : A) {
		 * 		res += str + " ";
		 * }
		 */

		}
		JOptionPane.showMessageDialog(null, "배열의 원소값\n\n" + res);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str[] = {"Java", "Oracle", "Jsp", "Html5, Css, Js, Jq", "SprintBoot", "PythonCamp"};
		
		
		Disp(str); //str을 Disp에 넣어준다 
		
		
		
		
	}

}
