package chapter04;

public class BookArray02 {

	public static void main(String[] args) {
		//전혀 다른 클래스에서 가지고 오는것은 library
		//다른 클래스의 book();을 5번 호출  ==> 메모리 확보
		book library [] = new book[5];

		//정보 입력용으로 사용하는 팩키지
		library[0] = new book("데미안", "헤르만 해세"); //[0]에 넣어준다
		library[1] = new book("신", "베르나르 베르베르");
		library[2] = new book("노인과 바다", "노인");
		library[3] = new book("드레곤볼", "미야자키");
		library[4] = new book("드레곤라자", "이영도");
		
		library[3].showBookinfo(); // showBookinfo에 정보 넣고  
	}

}
