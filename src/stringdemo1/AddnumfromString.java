package stringdemo1;

public class AddnumfromString {

	public static void main(String[] args)
	{
	
			String s = "ab5ds51s2";
			int digit = 0;
			String numericstring = "";  
			for (int i = 0; i < s.length(); i++) 
			{
				if (Character.isDigit(s.charAt(i))) 
				{
					numericstring= 	s.substring(i,i+1);
					digit = digit+ Integer.parseInt(numericstring);
				}
			}
			System.out.println("The numeric string is :" + digit);	
		}


	}


