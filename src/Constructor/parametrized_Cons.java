package Constructor;

public class parametrized_Cons 
{
	int id;
	String name;
	public parametrized_Cons(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	public void display()
	{
		System.out.println("Student Details Are :");
		System.out.println(id);
		System.out.println(name);
	}

	public static void main(String[] args) 
	{
		parametrized_Cons p1=new parametrized_Cons(12,"NILESH");
		p1.display();
		

	}

}
