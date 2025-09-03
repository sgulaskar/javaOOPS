package inheritance1;

public class SingleInheritance {

	public static void main(String[] args) {
		
		Shape s=new Shape();
		
		s.draw();
		s.area();
		System.out.println("-----------------------------------------");
		
		Rectangle r= new Rectangle();
		
		r.draw();
		r.area();

	}

}
