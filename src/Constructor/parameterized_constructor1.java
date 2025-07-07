package Constructor;

public class parameterized_constructor1 
{
    String name;
    int age;
    
   public parameterized_constructor1(String n,int a)
   {
    name = n;  // No conflict, so 'this' is not required
    age = a;
   }
   
   void display()
   {
       System.out.println("Name: " + name + ", Age: " + age);
   }
	public static void main(String[] args) 
	{
		parameterized_constructor1 p2=new parameterized_constructor1 ("Raghav",111);
		p2.display();

	}

}
