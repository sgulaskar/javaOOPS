package demos;

public class IfDemo {
	int a=100;
	int b=45;
	void display()
	{
		if(a>b)
		{
			System.out.println("a is greater");
		}
		else
		{
			System.out.println("b is greater");
		}
	} 
	public static void main(String[] args)
	{
		IfDemo i=new IfDemo();
		i.display();
	}

}
