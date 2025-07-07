package Polymorphism;

 class Dog
{
	    void makeSound() 
	    {
	        System.out.println("Animal makes a sound");
	    }
}

	class Cat extends Dog 
	{
	    @Override
	    void makeSound() 
	    {
	        System.out.println("Dog barks");
	    }
	}
	public class MethodOverride  
	{
	    public static void main(String[] args) 
	    {
	        Cat c1 = new Cat(); // Upcasting
	        c1.makeSound();        // Output: Dog barks
	    }
	}

