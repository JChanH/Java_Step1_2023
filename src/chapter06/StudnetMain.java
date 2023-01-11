package chapter06;

public class StudnetMain {

	public static void main(String[] args) {
		// 필드를 이용하여 set

		Student student1 = new Student(); // Student에 디폴트 생성자가 없으면 모호성에 빠짐
		// 오버로딩을 사용하였으면 오버로딩을 우선해서
		student1.studentName = "김치";
		student1.address = "서울시";
		student1.showStudentInfo();
		System.out.println("---------------");
		
		
		// 메소드를 이용하여 set //모델링
		Student student2 = new Student();
		student2.setStudentName("박수");
		student2.setAddress("경기도");
		student2.showStudentInfo();
		System.out.println("---------------");
		
		//생성자 오버로딩으로 set //직접 입력하는 경우 (오버로딩한 매게변수에
		Student student3 = new Student("김치즈", "서울시 은평구");
		student3.showStudentInfo();
		System.out.println("---------------");
	}

}
