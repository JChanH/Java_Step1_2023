package Practice;

public class while00 {
	public static void main(String[] args) {
		
		
		int num =1, sum =0;
		
		while (num<=10) {
			
			num++;
			sum +=num;
			
		}
		System.out.println("현재의 num값" +num);
		System.out.println("1~10까지의 합" + sum);
	}

}
