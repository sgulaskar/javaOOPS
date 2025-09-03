package abstraction;

public class InterfaceDemo {

	public static void main(String[] args) {
		
		Kia k1=new Kia();
		k1.Accelerate();
		k1.brakes();
		k1.gearmode();
		
		System.out.println("-----------------------------");
		
		Swift s1=new Swift();
		s1.Accelerate();
		s1.brakes();
		s1.gearmode();
		
		System.out.println("--------------------------------");
		
		Car c1=new Kia();   //create reference of Car class of methods because abstact method not create a object
		c1.Accelerate();
		c1.brakes();
		c1.gearmode();
		System.out.println("--------------------------------");
		
		Car c2=new Swift();
		c2.Accelerate();
		c2.brakes();
		c2.gearmode();
		

	}

}
