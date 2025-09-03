package inheritance1;

public class Rectangle extends Shape{

	int l=5;
	int b=6;
	void area()                             //method overriding
	{
		int a=l*b;
		System.out.println("Area if Rectangle is :"+ a);
	}
	void draw()                             //method overriding
	{
		System.out.println("Rectangle Shape is drawn");
	}
}
