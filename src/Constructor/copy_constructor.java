package Constructor;

public class copy_constructor
{
		
	String name;
    int age;

     public copy_constructor(String name, int age) 
     {
	        this.name = name;
	        this.age = age;
	 }

		  // Copy constructor
	public copy_constructor(copy_constructor s) 
	{
		this.name = s.name;
        this.age = s.age;
    }

    void display() 
    {
	        System.out.println("Name: " + name + ", Age: " + age);
	}

	public static void main(String[] args) 
	{
		copy_constructor s1 = new copy_constructor("Alice", 20);
		copy_constructor s2 = new copy_constructor(s1); // Copying s1 into s2

        s1.display();  // Output: Name: Alice, Age: 20
        s2.display();  // Output: Name: Alice, Age: 20
		    }

	}


