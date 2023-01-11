package chapter05;

import java.util.Scanner;

public class FunTest05 {
	public String channel;
	public int chanelInt;
	public int volume;

	public FunTest05() { // 생략가능
	}

	public void channelUp(int volume) {
		System.out.println("소리를" + volume + "만큼 올립니다.");
	}

	public void channelDown(int volume) {
		System.out.println("소리를" + volume + "만큼 내립니다.");
	}
    //오버로딩 (다형성 만족)
	public void channelChange(String channel) {
		System.out.println("채널을" + channel + "로 바꿉니다");
	}

	public void channelChange(int ChannelInt) {
System.out.println("채널을" + chanelInt + "로 바꿉니다");
	}

	// ====================================================//
	public static void main(String[] args) {
		
		
		FunTest05 tv = new FunTest05();
		
		tv.channelUp(3); //불러서 사용 가능
		tv.channelDown(5);
		tv.channelChange(4);
		tv.channelChange("tvn");
		
		
		

	}
}
