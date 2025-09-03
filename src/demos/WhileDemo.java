package demos;

public class WhileDemo 
{
	void display()
	{
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
	}
	

	public static void main(String[] args) 
	{
		
		WhileDemo wd=new WhileDemo();
		wd.display();
	}

}
