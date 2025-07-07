package Static;

public class static_class 
{
	private static String str = "GeeksforGeeks";
	
	
	static class MyNestedClass 
	{
		public void disp()
		{ 
	          System.out.println(str); 
	        }
	    }
	
	public static void main(String[] args) 
	{
		static_class.MyNestedClass obj = new static_class.MyNestedClass();
		obj.disp();

	}

}
