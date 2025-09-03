package inheritance;

public class square extends Shape {
	int side=12;
	void area()
	{
		int a=side*side;
		System.out.println("Area of Square:"+a);
	}
}
