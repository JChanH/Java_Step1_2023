package chapter06;

public class ComputerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer myComputer = new Computer();
		
		
		//방법1
		int values1[] = {1,2,3}; //값을 assign하고 
		int result=myComputer.sum1(values1); //넣어줌 
		System.out.println("result" + result);
		
		
		//방법2
		int result2 = myComputer.sum1(new int [] {1,2,3,4,5}); //바로 초기화 시켜주는 방법도 있음
		System.out.println("result2" + result2);
		
		//방법3
		
		int result3 = myComputer.sum2(1,2,3); //그냥 배열을 널어주어도 애러 안남
		System.out.println("result3" + result3);
		
		//방법4
		int result4 = myComputer.sum2(1,2,3,4,5,6,7,8); //그냥 배열을 널어주어도 애러 안남
		System.out.println("result3" + result4);
		
	}

}
