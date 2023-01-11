package chapter06;

public class StudentInfoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentInfo studentKim = new StudentInfo();
		
		studentKim.studentID = 1004;
		studentKim.grade=3;
		studentKim.address = "서울시";
		//studentKim.studnentName = " " private라서 사용 못한다
		//직접적으로 정보를 직접 넣어주는건 안되지만, setStudnetName을 통해 넣어줄수 있다
		//같은 클라스 내부에 있기 때문에..
		studentKim.setStudentName("김찬희");
		studentKim.getStudentName();
		
		
	}

}
