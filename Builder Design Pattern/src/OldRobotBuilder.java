
public class OldRobotBuilder implements RobotBuilder	{

	private Robot robot;
	
	
	 public OldRobotBuilder() {
		 this.robot=new Robot();
	}
	
	@Override
	public void buildRobotHead() {
		
		robot.setRobotHead("Tin Head");
		
	}

	@Override
	public void buildRobotTorso() {
		robot.setRobotTorso("Tin Torso");
	}

	@Override
	public void buildRobotArms() {
		robot.setRobotArms("Blowtorch Arms");
		
	}

	@Override
	public void buildRobotLegs() {
		robot.setRobotLegs("Roller Skates");
		
	}
	
	@Override
	public void giveRobotText() {
		robot.setRobotSpeach("Hi my name is R32D and I wish to help you whit your design patterns\n"
				+ "bu dam du dam di ra di du I m a robot and I like you");
		
	}

	@Override
	public Robot getRobot() {
		
		return this.robot;
	}

	

}
