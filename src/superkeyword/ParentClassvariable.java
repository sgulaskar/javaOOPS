package superkeyword;

	class Parent3 
	{
	    String name = "Parent Class";
	}

	class Child3 extends Parent3 
	{
	    String name = "Child Class";

	    void showNames() 
	    {
	        System.out.println("Parent Name: " + super.name); // Accessing Parent's field
	        System.out.println("Child Name: " + name);        // Accessing Child's field
	    }
	}

	public class ParentClassvariable 
	{
	    public static void main(String[] args) 
	    {
	        Child3 obj = new Child3();
	        obj.showNames();
	    }
	}


	


