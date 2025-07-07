package inheritance;

 class Match
{
	public void OneDay()
	{
		System.out.println("This is 20-20 Match");
	}
}
public class SingleInheritance1 extends Match 
{

	public static void main(String[] args) 
	{
		SingleInheritance1 obj=new SingleInheritance1();
		obj.OneDay();
		
	}

}
