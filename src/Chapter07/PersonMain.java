package Chapter07;


public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person P = new Person();
		System.out.println(P.name="김유신");
		System.out.println(P.height=180f);
		System.out.println(P.weight=80f);
//================================================
		Person P2 = new Person("chanhee");
		System.out.println(P2.name);
		System.out.println(P2.height = 150f);
		System.out.println(P2.weight = 70f);
		
//=======================================================
		Person P3 = new Person("찬찬", 170, 70);
		System.out.println(P3.name);
		System.out.println(P3.height);
		System.out.println(P3.weight);
		
		
	}

}
