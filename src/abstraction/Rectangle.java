package abstraction;

public class Rectangle extends Shape 
{
	
	int l=20;
	int b=50;
	void area()
	{
		int area=l*b;
		System.out.println("Area of Rectangle is:"+area);
	}
	void show()
	{
		System.out.println("This is Rectangle shape");
	}
}
