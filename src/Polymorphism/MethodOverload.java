package Polymorphism;





public class MethodOverload 
{
	
	void add( )
	{
		int a= 20;
		int b=25;
		System.out.println(a+b);
	}
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	void add(float a,float b)
	{
		float c=a+b;
		System.out.println("Addition is :"+c);
	}
	void add(int a, float b)
	{
		float c=a+b;
		System.out.println("addition is:"+c);
	}

	public static void main(String[] args) {
		
		MethodOverload p1=new MethodOverload();
		p1.add();
		p1.add(6, 8);
		p1.add(20, 2.5f);
		p1.add(4.5f, 2.0f);
		

	}

}
