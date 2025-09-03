package StasticDemo;

public class Stastic1 
{		
		public static int staticVariable = 10;
	    private int instanceVariable;

	    public Stastic1(int instanceVariable) 
	    {
	        this.instanceVariable = instanceVariable;
	    }

	    public static void staticMethod() 
	    {
	        System.out.println("Static method called");
	        System.out.println("Static variable value: " + staticVariable);
	        // You cannot access instance variables directly from a static method.
	        // System.out.println("Instance variable value: " + instanceVariable);
	    }

	    public void instanceMethod() {
	        System.out.println("Instance method called");
	        System.out.println("Static variable value: " + staticVariable);
	        System.out.println("Instance variable value: " + instanceVariable);
	    }

	    public static void main(String[] args) 
	    {
	    	Stastic1 .staticMethod();  // Calling the static method directly using the class name

	    	Stastic1  obj1 = new Stastic1(20);
	        obj1.instanceMethod();  // Calling the instance method on an object

	        Stastic1  obj2 = new Stastic1(30);
	        obj2.instanceMethod();  // Another object with a different instance variable value
	    }
}


