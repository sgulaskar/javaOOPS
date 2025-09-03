package demos;

public class AdditinalOperators {

	int a=25;
	int b=5;
	int c;
	void add()
	{
		c=a+b;
		System.out.println("Addition is="+c);
	}
	void sub()
	{
		c=a-b;
		System.out.println("Subtraction is="+c);
	}
	void mul()
	{
		c=a*b;
		System.out.println("Multiplication is="+c);
	}
	void div()
	{
		c=a/b;
		System.out.println("Division is="+c);
	}
	public static void main(String[] args)
	{
		AdditinalOperators a=new AdditinalOperators();
		a.add();
		a.sub();
		a.mul();
		a.div();
		
	}
}
