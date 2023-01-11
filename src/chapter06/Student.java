package chapter06;

public class Student {
	
	//필드
	
	int studentID;
	public String studentName;
	int grade;
	String address;
	
	//free compile 
	public Student() {//오버로딩된 생성자가 있으면 디폴트를 사용하기 위해서는 반드시 
//명시해 주어야 한다(생략이 불가능)
		
		
	}
	//생성자 오버로딩
	
	public Student(String studentName, String address) { //생성자는 초기화를 해두고 들어가기 때문에 따로 해줄 필요는 없음
		this.studentName = studentName;
		this.address = address;
		
		
	}
	
	
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void showStudentInfo() {
		System.out.println(studentName+ " ," + address);
		
		
	}
	
	
}
