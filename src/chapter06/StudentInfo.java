package chapter06;

public class StudentInfo {
	
	//필드
	int studentID;
	private String studentName;
	int grade;
	String address;
	
	
	
	//생성자 생략 : free compile
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentName() {
		return studentName;
	}
	
}
