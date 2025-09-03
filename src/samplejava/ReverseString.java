 
package samplejava;

public class ReverseString 
{
	 public static void main(String[] args) 
	 {
			String s = "abcdef";
			String rev="";
			
			for (int i=(s.length()-1); i>=0; i--)
			{
				rev=rev+s.charAt(i);
				
			}
			System.out.println("The reversed String is "+rev);
		
		
		}
}
