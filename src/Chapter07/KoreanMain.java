package Chapter07;

public class KoreanMain {
//하나의 틀로 여러게의 정보를 뽑아 쓸는게 가능함
	public static void main(String[] args) {
		Korean K1 = new Korean ("박자바", "010-7557-232");
		System.out.println("nation:" + K1.nation);
		System.out.println("name:" + K1.name);
		System.out.println("name:" + K1.ssn);
		
		System.out.println("===================================");
		
		Korean K2= new Korean ("김씨 ","010--232");
		System.out.println("nation:" + K2.nation);
		System.out.println("name:" + K2.name);
		System.out.println("name:" + K2.ssn);
	}

}
