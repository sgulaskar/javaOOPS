package inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
	
		Shape s=new Shape();
		s.draw();
		s.area();
		
		System.out.println("----------------------------");
	
		Rectangle r=new Rectangle();
		r.draw();
		r.area();
		
		System.out.println("--------------------");
		square sq=new square();
		sq.draw();
		sq.area();
		
		System.out.println("--------------------");
		System.out.println("Dynamic Method Selection");
		Shape s1=new Rectangle();
		s1.draw();   //Always overidden method
		s1.area();
		
		Shape s2=new square(); //s1=reference variable pointing to an object of its subclass
		s2.draw();
		s2.area();
	}

}
