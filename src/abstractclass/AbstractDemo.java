package abstractclass;

public class AbstractDemo {

	public static void main(String[] args) {
		
		Shape s1= new Rectangle();
		s1.show();
		s1.area();

		System.out.println("------------------------------");
		
		Square s2=new Square();
		s2.show();
		s2.area();
	}

}
