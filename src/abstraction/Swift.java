package abstraction;

public class Swift implements Car {

	@Override
	public void Accelerate() {
		System.out.println("Swift is in Accelerate Mode");
		
	}

	@Override
	public void brakes() {
		System.out.println("Swift is Applying Brakes");
		
	}

	@Override
	public void gearmode() {
		System.out.println("Swift is in Gearmode");
		
	}

}
