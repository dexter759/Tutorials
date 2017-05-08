
public class TestRobotBuilder {
	
	public static void main(String[]args){
		
		RobotBuilder C3P0 = new C3P0();
		
		RobotEngineer robotEngineer = new RobotEngineer(C3P0);
		
		robotEngineer.makeRobot();
		
		Robot firstRobot = robotEngineer.getRobot();
		
		System.out.println("Robot Built");
		
		System.out.println(firstRobot.getRobotText());
		
	}

}
