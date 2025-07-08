package InterfaceDemo;


	public class Swift implements Car 
	{

		@Override
		public void accelerate() {
			System.out.println("Swift is in Accelerate mode");
			
		}

		@Override
		public void breake() {
			System.out.println("Swift is in Break Mode");
			
		}

		@Override
		public void Gearmode() {
		System.out.println("Swift is in Gearmode");
			
		}

}
