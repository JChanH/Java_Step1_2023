package chapter06;

public class TeamGroup {
 //맴버변수 (배열 -> 팀구성원)
	private TeamMember member[] = new TeamMember[6]; //TeamMember를 불러옴과 동시에 6개의 자리를 마련해 준다 
	
	public void init() { //모델링을 통한 정보 투입
		member[0] = new TeamMember("윤영훈", "남");
		member[1] = new TeamMember("이재민", "남");		
		member[2] = new TeamMember("장여주", "여");
		member[3] = new TeamMember("전솔민", "남");
		member[4] = new TeamMember("허초회", "남");
		member[5] = new TeamMember("김찬희", "남");
		
	}
	
	public void Disp() {
		for (int i =0; i<member.length ; i++) {
			System.out.println(member[i].getName());
			
		}
			
		
		
	}
			
	
	
}
