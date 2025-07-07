package superkeyword;


	class Parent2 
	{
	    void display() 
	    {
	        System.out.println("Display method from Parent");
	    }
	}

	class Child2 extends Parent2 
	{
	    void display() 
	    {
	        super.display(); // Calls Parent's display() method
	        System.out.println("Display method from Child");
	    }
	}

	public class Parentclassmethod 
	{ 
	    public static void main(String[] args) 
	    {
	        Child2 obj = new Child2();
	        obj.display();
	    }
	}

	

