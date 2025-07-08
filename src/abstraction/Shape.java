package abstraction;

public abstract class Shape {

	abstract void area();      //Abstract Method
	
	void show()     //Non Abstract Method
	{
		System.out.println("This is Shape");
	}
}
