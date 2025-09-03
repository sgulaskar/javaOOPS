package demos;

public class ForDemo {
	void display()
	{
		System.out.println("Increment number 1 t0 10");
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
	}
	void reverse()
	{
		System.out.println("decrement number 10 t0 1");
		for(int i=10;i>0;i--)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args)
	{
		ForDemo f1=new ForDemo();
		f1.display();
		f1.reverse();
	}

}
