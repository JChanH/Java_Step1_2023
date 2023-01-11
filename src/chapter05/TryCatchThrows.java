package chapter05;

public class TryCatchThrows {

	public static void fun() throws Exception { // 문제가 생기면 우선 확인을 해야하는 경우 (예방조치)

		try { // 정상코드
			System.out.println("fun()메서드");
			throw new Exception(); // 수행문 안에 해당 문구가 없으면 throw Exception을 사용 못한다

		}

		catch (RuntimeException e) { // RuntimeException : 실행중에 발생하는 에러
			// 애러시 수행하는 수 행문
			System.out.println("예외발생");
		} finally { //위에서 애러가 터져도 finally는 읽어준다 (레러를 잡지 못해도 에러를 잡아도 무조건 수행하는 코드)
			System.out.println("finally 문장");

		}

	}

	public static void main(String[] args) {
		// static임으로 바로 호출 가능해야하지만 위에서 throw Exception을 사용했음으로 trycatch 문구에서만 사용 가능
		// fun();

		try {
			fun();
		} catch (Exception e) { //
			// handle exception
			System.out.println("main()의 catch문 문장");
		}

	}

}
