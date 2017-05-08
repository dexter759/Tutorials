
public class C3P0 implements RobotBuilder {
	
	private Robot robot;
	
	
	 public C3P0() {
		 this.robot=new Robot();
	}
	
	@Override
	public void buildRobotHead() {
		
		robot.setRobotHead("Gold Head");
		
	}

	@Override
	public void buildRobotTorso() {
		robot.setRobotTorso("Gold Torso");
	}

	@Override
	public void buildRobotArms() {
		robot.setRobotArms("Gold Arms");
		
	}

	@Override
	public void buildRobotLegs() {
		robot.setRobotLegs("Golden Legs");
		
	}
	
	@Override
	public void giveRobotText() {
		robot.setRobotSpeach("Sir, the possibility of successfully navigating an asteroid field is approximately 3,720 to 1.");
		
	}

	@Override
	public Robot getRobot() {
		
		return this.robot;
	}

}
