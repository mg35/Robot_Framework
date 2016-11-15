package org.usfirst.frc.team1504.robot;

import org.usfirst.frc.team1504.robot.Update_Semaphore.Updatable;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class Thing2B implements Updatable {


	@Override
	public void semaphore_update() {
	 	Latch_Joystick button1 = new Latch_Joystick(3);
		
		DoubleSolenoid ProjectSolenoid = new DoubleSolenoid(Map.STUDENTS_MAIN_PISTON_PORT_ONE,Map.STUDENTS_MAIN_PISTON_PORT_TWO);
		
		boolean value1 = button1.getRawButtonLatch(4);
		boolean value2 = button1.getRawButtonLatch(5);
		
		if (value1 == true) {
			value2 = false;
			ProjectSolenoid.set(DoubleSolenoid.Value.kForward);
		}
		
		if (value2 == true) {
			value1 = false;
			ProjectSolenoid.set(DoubleSolenoid.Value.kReverse);
		}
	}
}
//where the main stuff is.
//
/*	1.) Record the input of the button
		a.) call upon thy Latch_Joystick.java
		b.) take the direct input from the joystick button
	2.) Send the input to the soleniod
		a.) route the button's imput to the soleniod
	3.) Extend the soleniod.
		a.) when a true value for the toggle is detected, extend the soleniod
*/
/*For lack of knowledge of how to actually do this
write your thoughts/ideas here.
We don't know what we're doing... -Everyone who isn't helping
//Questions
 Is there a more detailed example of this code I can look at? - Alex
 */
