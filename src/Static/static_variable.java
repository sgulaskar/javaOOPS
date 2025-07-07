package Static;


	public class static_variable 
	{
	    static String college = "ABC University";  // Shared by all students
	    String name;

	    static_variable(String name) 
	    {
	        this.name = name;
	    }

	    void display() 
	    {
	        System.out.println(name + " studies at " + college);
	        
	    }

	    public static void main(String[] args) 
	    {
	    	static_variable  s1 = new static_variable ("Alice");
	    	static_variable  s2 = new static_variable ("Bob");
	        s1.display();
	        s2.display();

	    }

}

