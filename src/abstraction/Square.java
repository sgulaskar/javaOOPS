package abstraction;

public class Square extends Shape{
	int side=6;
	void area()
	{
		int area=side*side;
		System.out.println("area of square is :"+area);
	}

}
