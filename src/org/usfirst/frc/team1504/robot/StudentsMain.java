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
		// TODO Auto-generated method stub
		boolean value1;
		boolean value2;
		DoubleSolenoid ProjectSolenoid = new DoubleSolenoid(1, 2);
		//getRawButtonLatch(4);
		//Is the input thing thats inside the parentheses the port #?
		value1 = getRawButtonLatch(4);
		if (value1 == true){
			ProjectSolenoid.set(DoubleSolenoid.Value.kForward);
		}
		//getRawButtonLatch(5);
		value2 = getRawButtonLatch(5);
		if (value2 == true){
			ProjectSolenoid.set(DoubleSolenoid.Value.kReverse);
		}
	
	system.out.println("Moo!")
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



