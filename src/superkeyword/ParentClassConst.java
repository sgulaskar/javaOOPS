package superkeyword;


	class Parent1 
	{
	    Parent1() 
	    {
	        System.out.println("Parent class constructor");
	    }
	}

	class Child1 extends Parent1 
	{
	    Child1() 
	    {
	        super();  // Calls the Parent class constructor
	        System.out.println("Child class constructor");
	    }
	}

	 class ParentClassConst 
	{
	    public static void main(String[] args)
	    {
	        Child1 obj = new Child1();
	    }
	}


	


