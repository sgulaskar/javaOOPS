package inheritance1;

public class HirachicaleInhetance {

	public static void main(String[] args) {
		
		Shape s=new Shape();
		s.draw();
		s.area();
		
		System.out.println("------------------------------");
		Squar sq=new Squar();
		sq.draw();
		sq.area();
		
		System.out.println("-------------------------------");
		Rectangle re=new Rectangle();
		re.draw();
		re.area();
		
		System.out.println("-------------------------------");
		
		System.out.println("Dynamic method Selection");
		
		Shape s1= new Rectangle();    //always overriden method
		s1.area();
		s1.draw();
		
		System.out.println("--------------------------------");
		Shape s2=new Squar();   //s2 is reference variable pointing to an object of its subclass
		s2.area();
		s2.draw();
	}

}
