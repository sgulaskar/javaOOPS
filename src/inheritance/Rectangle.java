package inheritance;

public class Rectangle extends Shape {
	int l=40;
	int b=30;
	void area()
	{
		int a=l*b;
		System.out.println("Area Of Rectangle is"   +a);
	}
	void draw()
	{
		System.out.println("Rectangle Shape Is Drawn");
	}
}
