package stringdemo;

public class DisplayDemo {
	
	public static void main(String[] args)
	{
		String s="SANGRAM";
		
		for(int i=0;i<=s.length()-1;i++)
		
		{
			System.out.println(s.charAt(i));
		}
		System.out.println("Reverse String");
	
		for (int i=s.length()-1;i>=0;i--)
		
		{
			System.out.println(s.charAt(i));
		}
	}

}
