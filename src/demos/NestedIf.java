package demos;

public class NestedIf {
	int a=45;
	int b=67;
	int c=69;
	
	void test()
	{
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is Greater");
			}
		}
			else
			{
				if(b>c)
				{
					System.out.println("b is greater");
				}
				else
				{
					System.out.println("c is greater");
				}
			}
		}
		public static void main(String[] args)
		{
			NestedIf n=new NestedIf();
			n.test();
		}
		
	

}
