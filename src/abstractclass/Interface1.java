package abstractclass;

public class Interface1 {

	public static void main(String[] args) {
		
		car1 c1 =new car1();
		c1.accelerate();
		c1.breakmode();
		c1.Gearmode();
		
		
		System.out.println("------------------------");
		
		vehicle c2=new car1();
		c2.accelerate();
		c2.Gearmode();
		
		System.out.println("---------------------------");
		
		xuv x1=new car1();
		x1.breakmode();

	}

}
