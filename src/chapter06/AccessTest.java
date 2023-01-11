package chapter06;

public class AccessTest {

	
	//필드
	private int aa;
	public int bb;
	int cc;
	
	//디폴트 생성자
	public AccessTest() { //void는 쓰지 않기
		
	}
	
	//메서드
	
	public void setAa(int aa) {
		this.aa = aa; //데이터를 올린다 
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public void Disp() {
		
		System.out.println("aa값 :" + aa + "\nbb값 : " + bb + "\ncc: " + cc);
	}
	
	
	public static void main(String[] args) {
		// 객체 (obj)
		
		AccessTest obj = new AccessTest();
		obj.setAa(10);
		//obj.Aa = 10 (같은 클라스 안에 있기 때문에 이렇게 써도 ㄱㅊ 음)
		obj.setBb(20);
		obj.setCc(30);
		obj.Disp();

	}

}
