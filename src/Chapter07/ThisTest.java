package Chapter07;

public class ThisTest {

	private int Speed;
	private int Age;
	private String RobotName;
	private String Robotnum;

	public ThisTest() {

	}

	public ThisTest(int speed, int age, String robotName, String robotnum) {
		super();
		Speed = speed;
		Age = age;
		RobotName = robotName;
		Robotnum = robotnum;
	}
	// ---------------------------------

	public void Move() {
		Speed += 20;
		System.out.println("RobotSpeed :" + Speed);
	}

	public void Stop() {
		Speed = 0;
		System.out.println("RobotSpeed : " + Speed);
	}

	public void RAge() {
		Age += 1;
		System.out.println("RobotName :" + RobotName);

	}

	public void RName() {
		System.out.println("RobotName" + RobotName);
	}

	// -----------------------------------------------------
	public int getSpeed() {
		return Speed;
	}

	public int getAge() {
		return Age;
	}

	public String getRobotName() {
		return RobotName;
	}

	public String getRobotnum() {
		return Robotnum;
	}

}
