package abstraction;

public class Kia  implements Car{

	@Override
	public void Accelerate() {
		System.out.println("Kia is in Accelerate Mode");
		
	}

	@Override
	public void brakes() {
		System.out.println("Kia car is applying brakes");

		
	}

	@Override
	public void gearmode() {
		System.out.println("Kia is in Gearmode");
		
	}

}
