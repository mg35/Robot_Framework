package org.usfirst.frc.team1504.robot;

import org.usfirst.frc.team1504.robot.Update_Semaphore.Updatable;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class StudentsMain extends Latch_Joystick implements Updatable {

	
	//lol idk what to do with this part
	public StudentsMain(int port) {
		super(port);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void semaphore_update() {
		Latch_Joystick _drive_forward = new Latch_Joystick(3);
		// TODO Auto-generated method stub
		boolean value1;
		boolean value2;
		DoubleSolenoid ProjectSolenoid = new DoubleSolenoid(1, 2);
		//getRawButtonLatch(4);
		//Is the input thing thats inside the parentheses the port #?
		//value1 = getRawButtonLatch(4);
		value1 = _drive_forward.getRawButton(4);
		value2 = _drive_forward.getRawButton(5);
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
		a.) when a true value for the taoggle is detected, extend the soleniod
*/
/*For lack of knowledge of how to actually do this
write your thoughts/ideas here.
 
Hello World! I'm cool - Eric the loser
I don't know what i'm doing... - Alex

//Questions
 Is there a more explicit example of this code I can look at? - Alex
 */



