package chapter05;

public class FunTest06 {
	public String channel;
	public int chanelInt;
	public int volume;
	//생성자 생략
	
	//void외에 모든 타입의 메소드 반드시 return 값을 갖는다
	
	public int channelUp(int volume) { //void ==> int로 변경 (데이터를 넘겨줄때 int로 던져준다)
		this.volume = volume; //stack에 있는 메모리를 heap메모리로 올려준다
		System.out.println("소리를 높이겠습니다");
		return volume+2; //내부에서 연산
		
	}
	public int channelDown(int volume) { //void ==> int로 변경 (데이터를 넘겨줄때 int로 던져준다)
		this.volume = volume; //stack에 있는 메모리를 heap메모리로 올려준다
		System.out.println("소리를 높이겠습니다");
		return volume+2; //내부에서 연산
		
	}
	
	
	
	
	public static void main(String[] args) { //리턴값이 존재하지 않는다
		FunTest06 vol = new FunTest06();
		
		/*방법01
		vol.channelUp(1);
		System.out.println("소리를 " + vol.channelUp(1)+ "만큼 올립니다."); //연산된 값을 뿌린다
		*/
		
		
		//방법2
		int volume = vol.channelUp(1); 
		System.out.println("소리를 " + volume+ "만큼 올립니다.");
		

}
}
