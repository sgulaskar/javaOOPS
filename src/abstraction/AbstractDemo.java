package abstraction;

public class AbstractDemo {
	public static void main(String [] args)
	{
		Shape s1=new Rectangle();
		s1.area();
		s1.show();
		
		
		Square s2=new Square();
		s2.show();
		s2.area();
	}

}
