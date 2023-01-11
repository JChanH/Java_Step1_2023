package chapter06;

class person2 {
	String name;
	int age;

	public person2() {
		this("이름없음", 0); //Person2(String str, int a)
	}

	public person2(String name, int age) {
		this.name=name;
		this.age=age;
	}

	// 자기자신의 주소
	person2 returnSelf() {
		return this; //자기 자신을 참조한다
	}

}

public class CallAnotherConst {

	public static void main(String[] args) {

		person2 noName = new person2();
		System.out.println(noName.name);
		System.out.println(noName.age);
		System.out.println("noName의 주소 : " + noName);
		System.out.println("noName의 주소 : " + noName.returnSelf());
		// noName과 p의 객체는 전혀 다른곳으로 할당
		System.out.println("------------------------------------");
		person2 p = new person2();
		System.out.println("p의 주소 : " + p);
		// 주소 복사
		System.out.println("------------------------------------");
		person2 person = noName.returnSelf();
		System.out.println(person);
		System.out.println(noName);

	}

}