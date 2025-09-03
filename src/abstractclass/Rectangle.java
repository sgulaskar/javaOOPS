package abstractclass;

public class Rectangle extends Shape{
	
	int l=20;
	int b=30;
	
	void area()
	{
		int area=l*b;
		System.out.println("Area of Rectagle is "+ area);
	}
	void Show()
	{
		System.out.println("This is Rectangle Shape");
	}

}
