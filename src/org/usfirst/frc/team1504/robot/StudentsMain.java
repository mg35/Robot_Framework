package org.usfirst.frc.team1504.robot;

import org.usfirst.frc.team1504.robot.Update_Semaphore.Updatable;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class StudentsMain implements Updatable {

	@Override
	public void semaphore_update() {
		// TODO Auto-generated method stub
		int value;
		int value2;
		DoubleSolenoid ProjectSolenoid = new DoubleSolenoid(1, 2);
		getRawButtonLatch(4);
		//How do you use the value it returns
		//Is the input thing thats inside the parenthases the port #?
		if (value == 1)
		{
			ProjectSolenoid.set(DoubleSolenoid.Value.kForward);
		}
		getRawButtonLatch(5);
		if (value2 == 1)
		{
			ProjectSolenoid.set(DoubleSolenoid.Value.kReverse);
		}
	}
}
//where the main stuff is.
//
/*For lack of knowledge of how to actually do this
write your thoughts/ideas here.
 
Hello World! I'm cool - Alex
I don't know what i'm doing... - Alex

//Questions
 Where is a more explicit example of this code I can look at? - Alex
 */



*/