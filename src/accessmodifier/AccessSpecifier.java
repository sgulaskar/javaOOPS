package accessmodifier;

public class AccessSpecifier 
{
			public int publicVar;
		    private int privateVar;
		    protected int protectedVar;
		    int defaultVar; // Default access specifier

		    public void publicMethod() 
		    {
		    	System.out.println("This is Public");
		    	System.out.println("Code accessible from anywhere");
		    }

		    private void privateMethod() 
		    {
		        System.out.println("This is Private");
		        System.out.println("Code accessible only within the same class");
		    }

		    protected void protectedMethod() 
		    {
		    	System.out.println("This is Protected");
		    	System.out.println("Code accessible within the same class, subclasses, and same package");
		    }

		    void defaultMethod() 
		    {
		    	System.out.println("This is Default");
		    	System.out.println("Code accessible within the same package only");
		    }
		
		    public static void main(String[] args) 
		    {
		    	AccessSpecifier as=new AccessSpecifier();
		    	as.publicMethod();
		    	as.privateMethod();
		    	as.protectedMethod();
		    	as.defaultMethod();
		    		

		    }

}
