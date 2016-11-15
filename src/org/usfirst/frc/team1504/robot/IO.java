package org.usfirst.frc.team1504.robot;

public class IO
{
	private static Latch_Joystick _drive_forward = new Latch_Joystick(Map.DRIVE_CARTESIAN_JOYSTICK);
	private static Latch_Joystick _drive_rotation = new Latch_Joystick(Map.DRIVE_POLAR_JOYSTICK);
	
	public static final long ROBOT_START_TIME = System.currentTimeMillis();
	
	/**
	 * Drive stuff
	 */
	
	/**
	 * Handle getting joystick values
	 * @return
	 */
	public static double[] drive_input() {
		double[] inputs = new double[2];

		inputs[0] = Map.DRIVE_INPUT_MAGIC_NUMBERS[0] * Math.pow(Utils.deadzone(_drive_forward.getRawAxis(Map.JOYSTICK_Y_AXIS)), 2) * Math.signum(_drive_forward.getRawAxis(Map.JOYSTICK_Y_AXIS));// y
		inputs[1] = Map.DRIVE_INPUT_MAGIC_NUMBERS[1] * Math.pow(Utils.deadzone(_drive_rotation.getRawAxis(Map.JOYSTICK_X_AXIS)), 2) * Math.signum(_drive_rotation.getRawAxis(Map.JOYSTICK_X_AXIS));// w
		
		return inputs;
	}
	
	public static double drive_wiggle()
	{
		return (_drive_rotation.getRawButton(4) ? -1.0 : 0.0) + (_drive_rotation.getRawButton(5) ? 1.0 : 0.0);
	}
	
	/*public static void TOBENAMED() {
		boolean value1;
		boolean value2;
		Latch_Joystick _drive_forward = new Latch_Joystick(Map.STUDENTS_MAIN_DRIVE_FORWARD);
		value1 = _drive_forward.getRawButton(Map.PISTON_EXTEND);
		value2 = _drive_forward.getRawButton(Map.PISTON_RETRACT);
		if (value1 == true){
			value2 = false;
			ProjectSolenoid.set(DoubleSolenoid.Value.kForward);
		}
		//getRawButtonLatch(5);
		//value2 = getRawButtonLatch(5);
		if (value2 == true){
			value1 = false;
			ProjectSolenoid.set(DoubleSolenoid.Value.kReverse);
		}
	}*/
	
	public static boolean JOYSTICKEXTEND(){
		Latch_Joystick _drive_forward = new Latch_Joystick(Map.STUDENTS_MAIN_DRIVE_FORWARD);
		boolean value1B;
		//boolean value2;
		value1B = _drive_forward.getRawButton(Map.STUDENTS_MAIN_PISTON_EXTEND);
		return(value1B);
	}
	/*public static boolean JOYSTICKRETRACT(boolean value2){

		value2 = _drive_forward.getRawButton(Map.STUDENTS_MAIN_PISTON_RETRACT);
		return(value2);
	}*/

}
