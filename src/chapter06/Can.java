package chapter06;

public class Can {

	//필드 (자판기에 넣을 캔의 종류)
	private String canName;
	private int price;
	
	//생성자(constructor) 오버로딩
	
	public Can(String canName, int price) { //초기화
		this.canName = canName;
		this.price = price;
		
	}

	public String getCanName() {
		return canName;
	}

	public int getPrice() {
		return price;
	}
	
	
	
	
	
}
