package Practice;

import java.util.ArrayList; //리스트 추가시 사용하는 외부 클라스 (리스트에 추가 가능한 공간을 할당해준다 -> 동적인 데이터 구조를 위해서)
import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		// 10개의 정수를 입력받아 3의 배수와 5의 배수를 각각 출력하시요
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> arry = new ArrayList<Integer>(); //상속받는 클래스로 크기가 가변적으로 변하는 선형 리스트
		//어떤 숫자를 입력하고 또 배열에 넣을지 설정해주어야 한다 (String이면 String / int 면 int)
		int a,b=9, cnt3=0, cnt5=0; // 초기값이 필요한 경우에는 리턴값을 넣어주고 나머지는 assign만 해준다
		System.out.println("정수를 10회 입력하세요: ");
		
		for(int i=9 ; b>=0; i--) {  //원하는 조건만 카운팅 하기 위해서 변수 b를 추가한다 (i는 사실상 무한대로 내려가고 조건은 b로 잡아줌)
			a= scan.nextInt();
			if (a==0) { //조건값에 추가 안하고 단순 넘어가는 조건은 b-- 생략
				System.out.println("0은 표시 불가능 입니다.");
				System.out.println("다시 입력해 주세요");
				
			}

			else if (a % 3 == 0 && a % 5 == 0) { //조건값에 누적하고 싶은 경우에만 추가
				arry.add(a);
				cnt3++;
				cnt5++;
				System.out.println(b + "번 남았습니다");
				b--; 

			} else if (a % 3 == 0) {
				arry.add(a);
				cnt3++;
				System.out.println(b + "번 남았습니다");
				b--;
				
			} else if (a % 5 == 0) {
				arry.add(a);
				cnt5++;
				System.out.println(b + "번 남았습니다");
				b--;
				
			}
			else {
				arry.add(a);
				System.out.println(b + "번 남았습니다");
				b--;
			}
		}
		
		System.out.println("지금까지 입력하신 숫자는" + arry + "이고");
		System.out.println("3의 배수는" + cnt3 + "개, 5의 배수는" + cnt5 + "개 입니다.");	
	}		
		
}
	

