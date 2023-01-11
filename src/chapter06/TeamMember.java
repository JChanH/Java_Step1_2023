package chapter06;

public class TeamMember {
	
	//멤버변수
		public String TeamName; //팀명
		public String mName; //팀장
		public String mphone; //팀장전화번호
		public String sName; //부팀장
		public String name;  //팀운
		public String gender; //팀원 성별

		
		//외부에서 들어오는 데이터는 모델이라고 함
		
		//생성자 (construtor) //default 값
		public TeamMember() {
			
		}
		
		//오버로딩
		public TeamMember(String name, String gender) {
			this.name=name;
			this.gender=gender;
		}

		public String getTeamName() {
			return TeamName;
		}

		public void setTeamName(String teamName) {
			TeamName = teamName;
		}

		public String getmName() {
			return mName;
		}

		public void setmName(String mName) {
			this.mName = mName;
		}

		public String getMphone() {
			return mphone;
		}

		public void setMphone(String mphone) {
			this.mphone = mphone;
		}

		public String getsName() {
			return sName;
		}

		public void setsName(String sName) {
			this.sName = sName;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}
		
//메소드를 통한 초기화

}


