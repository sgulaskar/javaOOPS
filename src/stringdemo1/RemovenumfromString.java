package stringdemo1;

public class RemovenumfromString {

	public static void main(String[] args) {
		String s="s6a9n4";
		String numericstring="";
		for (int i = 0; i < s.length(); i++) 
		{
			if (!Character.isDigit(s.charAt(i))) 
			{
				numericstring = numericstring + s.charAt(i);

			}

		}
		System.out.println("The numeric string is :" + numericstring);

	}

	}


