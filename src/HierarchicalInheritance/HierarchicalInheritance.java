package HierarchicalInheritance;


class Animal 
{
	   void makeSound() 
	   {
	      System.out.println("Animal makes a sound");
	   }
}
class Dog extends Animal 
{
	   void bark() 
	   {
	      System.out.println("Dog barks");
	   }
}
class Cat extends Animal 
{
	   void meow() 
	   {
	      System.out.println("Cat meows");
	   }
}
class Lion extends Animal
{
	 void roar()
	{
		System.out.println("The lion is Roaring");
	}
}

public class HierarchicalInheritance 
{

	public static void main(String[] args)
	{
		Dog d1 = new Dog();
        d1.makeSound();  // Corrected method name
        d1.bark();       // Additional method from Dog class

        // You can also test others like:
        Cat c1 = new Cat();
        c1.makeSound();
        c1.meow();

        Lion l1 = new Lion();
        l1.makeSound();
        l1.roar();
	
		
	}

	
		
}
	

