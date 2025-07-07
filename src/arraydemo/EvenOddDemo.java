package arraydemo;

public class EvenOddDemo {
	int a[]={56,87,96,23,47,65,66,11,22,88};
	void even()
	{
		System.out.println("Even No  in Array :");
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
	}
	void odd()
	{
		System.out.println("odd No  in Array :");
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
	}
	public static void main(String[] args)
	{
		EvenOddDemo e=new EvenOddDemo();
		e.even();
		e.odd();
	}

}
