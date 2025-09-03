package demos;

public class Variable {
	
	int a=20;
	String name= "Sangram";
	char c='T';
	float f=2.55f;
	
	
	void Display()
	{
		System.out.println(a);
		System.out.println(name);
		System.out.println(c);
		System.out.println(f);
	}
	
	public static void main(String[] args)
	{
		Variable v=new Variable();
		v.Display();
	}
	
	

}
