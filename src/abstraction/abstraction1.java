package abstraction;

public class abstraction1 {

	public static void main(String[] args) {
		Thar t=new Thar();
		t.accelerate();
		t.brakes();
		t.gearmode();
		
		
		
		Gadi g=new Thar();
		g.gearmode();
		
		Interface1 i1=new Thar();
		i1.accelerate();
		i1.brakes();

	}

}
