package demos;

public class MethodDemo {
	
	void testMethod()
	{
		System.out.println("This is a First method");
	}
	
	void second()
	{
		System.out.println("This is Second Method");
	}
	public static void main(String[] args)
	{
		MethodDemo m=new MethodDemo();
		m.testMethod();
		m.second();
				
	}
}
