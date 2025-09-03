package exceptiondemo;

public class Demo1 {

	public static void main(String[] args) {
		int a=10;
		int b;
		System.out.println("This is a Program of Division");
		System.out.println("Perform a Division");
		try
		{
			b=a/2;
			System.out.println(b);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("This is Finally Block");
		}
		System.out.println("Division is performed");
	}

}
