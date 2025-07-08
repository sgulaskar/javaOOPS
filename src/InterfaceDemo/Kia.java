package InterfaceDemo;

public class Kia implements Car 
{

		@Override
		public void accelerate() {
			System.out.println("Kia is in Accelerate Mode");
			
		}

		@Override
		public void breake() {
			System.out.println("Kia is in Break Mode");
			
		}

		@Override
		public void Gearmode() {
			System.out.println("Kia is in Gearmode");
			
		}


}
