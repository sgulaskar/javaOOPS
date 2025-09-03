package abstraction;

public class Thar implements Gadi,Interface1{

	@Override
	public void accelerate() {
		System.out.println("Thar is in Accelerate mode");
		
	}

	@Override
	public void brakes() {
		System.out.println("Thar is in brakes mode");
		
	}

	@Override
	public void gearmode() {
		System.out.println("Thar is in Gearmode");
		
	}

}
