package exceptiondemo;

public class Demo2 {
	String s1;
	int b=10;
	void test()
	{
		System.out.println("This  is String");
		try
		{
			//System.out.println(s1.length());
			int a=b/0;
			System.out.println(a);
		}
		catch(NullPointerException n)
		{
			n.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
			
		}
		catch(Exception e1)
		{
			
		}
		finally
		{
			
		}
		System.out.println("String is displayed");
	}
	public static void main(String[] args) {
		Demo2 d=new Demo2();
		d.test();

	}

}
