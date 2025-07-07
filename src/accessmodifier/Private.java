package accessmodifier;

public class Private 
{
	private int data=40;  
	private void msg()
	{
		System.out.println("Hello java");
	}  
	public static void main(String[] args)
	{
		System.out.println("this is private");
		Private p =new Private();
		p.msg();
	}
}
		  
