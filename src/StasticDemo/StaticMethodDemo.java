package StasticDemo;

public class StaticMethodDemo 
{
	private static int i = 10;
	public String s1="Sangram";
	
	    public static void staticMethod() 
	    {
	        System.out.println("This is a static method.");//A static method can only access static data members and static methods 
	        System.out.println(i);				//of another class or same class but cannot access non-static methods and variables.
	         
	    }

	    public static void main(String[] args) 
	    {
	        StaticMethodDemo.staticMethod();
	    	staticMethod(); // Calling the static method directly using the class name or directly using method name
	    }
	}


	


