package chapter06;

public class TeamMain {

	public static void main(String[] args) {
		
		TeamGroup team = new TeamGroup();
		TeamMember t = new TeamMember();
		//메서드를 통해서 팀명을 초기화
		t.setTeamName("팀허브"); //set을 이용하여 초기화해주기
		System.out.println("팀명: " + t.getTeamName() );
		System.out.println("-----------------");
		System.out.println("[팀원 명단]");
		team.init();//TeamGroup에 초기화된 정보를 가지고 와서
		team.Disp();//프린트
		
		System.out.println();
		
		t.setmName("허초회"); //set으로 데이터 주입
		t.setsName("윤영훈");
		t.setMphone("010-4688-2773");
		System.out.println("팀장님 :" + t.getmName());
		System.out.println("전화번호 :" + t.getMphone() );
		
		//t.sName = "윤영훈" 집점 등록해주는 것도 가능함 (public의 경우에만 가능 
		
		
		
		
		
	}

}
