package Practice;

public class Test_data {
//맴벼변수 입력 //필드
	public String studentName;
	public int testScore;
	// 초기화

	// 생성자
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getTestScore() {
		return testScore;
	}

	public void setTestScore(int testScore) {
		this.testScore = testScore;
	}

	// =======================================
	public Test_data(String studentName) { //string이 들어오면 studentName으로 저장되고
		this.studentName = studentName;
	}

	public Test_data(int testScore) { //int로 들어오면 testScore에 저장된다
		this.testScore = testScore;
	}

}
