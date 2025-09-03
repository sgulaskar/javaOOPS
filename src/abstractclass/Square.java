package abstractclass;

public class Square extends Shape {
	int side=6;
	void area()
	{
		int area=side*side;
		System.out.println("Area of Square is "+ area);
	}
	void show()
	{
		super.show();    //its call a shape class show method
	}
}
