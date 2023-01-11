package chapter06;

public class StdInfo { // 학생 정보

	// 필드
	public String studentName; // 학생 이름
	public int money; // 학생의 돈 소비 (마이너스 누적)
	public int grade; // 학생의 학년

	// free compile

	// 생성자 오버로딩
	public StdInfo(String studentName, int money, int grade) {
		this.studentName = studentName;
		this.money = money;
		this.grade = grade;
	}

	// 버스
	public void takebus(Bus bus) {// 매게변수로 class가 통채로 들어오는것도 가능함 //다만 같은 메게변수로 받아주어야 함
		// Bus bus = new Bus();
		if (grade == 1) {
			bus.take(500); // Bus 클래스 내부의 take 메소드를 불러온다 돈을 누적한다
			this.money -= 500; // 학생의 지출
		} else
			bus.take(1000);
		this.money -= 1000;
	}

	// 지하철
	public void takeSubway(Subway subway) {// 매게변수로 class가 통채로 들어오는것도 가능함 //Subway와 연동하기 위해서
		if (grade == 1) { //학년마다 다르게 돈 나감
			subway.take(800);
			this.money -= 800; // 학생의 지출
		} else {
			subway.take(1000);
			this.money -= 1000; // 학생의 지출
		}
	}

	public void showInfo() {
		System.out.println(studentName + "님의 잔액은 :" + money + "원 입니다.");

	}
}
