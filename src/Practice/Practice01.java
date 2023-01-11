package Practice;
import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
int a,b , total2=0;
		
		System.out.println("0~10까지의 정수를 입력하시오(총 10회 입력)");
		b = scan.nextInt();
		if (0 <= b || b <11) {
			
			for (a = 9; a>=0 ; a--) {
				total2++; // cnt=cnt+1
				if (a==0)
					System.out.println("감사합니다.");
				else if (b==0)
					continue;
					if (b%2 == 0)
	
				else 
					continue;
			}
		}
		else {
			System.out.println("숫자는 0~10까지 입력해주세요");
			
		}
		
		System.out.println("짝수는 총" + total2 +"개 입니다");
		
	}

}
