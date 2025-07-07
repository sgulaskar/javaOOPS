package superkeyword;
 // Corrected package name

//Parent class
class Parent 
{
 Parent(String msg) 
 {
     System.out.println("Parent constructor: " + msg);
 }
}

//Child class extending Parent
class Child extends Parent 
{
 Child() 
 {
     super("Hello from Child!"); // Passing argument to Parent's constructor
     System.out.println("Child constructor called");
 }
}

//Main class to run the program


public class Parentclasswithparaconst 
{

	public static void main(String[] args) 
	{
		Child obj = new Child();

	}

}
