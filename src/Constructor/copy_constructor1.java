package Constructor;

public class copy_constructor1 
{
	
	    String name;
	    int age;

	    // Parameterized constructor
	    public copy_constructor1(String n, int a) 
	    {
	        name = n;
	        age = a;
	    }

	    // Copy constructor without using 'this'
	    public copy_constructor1(copy_constructor1 s) 
	    {
	        name = s.name;
	        age = s.age;
	    }

	    void display() 
	    {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }
	    public static void main(String[] args) 
	    {
	    	copy_constructor1 s1 = new copy_constructor1("Alice", 20);
	    	copy_constructor1 s2= new copy_constructor1(s1);  // Using copy constructor

	        s1.display();  // Output: Name: Alice, Age: 20
	        s2.display();  // Output: Name: Alice, Age: 20
	    }


}
