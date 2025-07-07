package stringdemo1;

public class Removealphabetfromstring {

	public static void main(String[] args) {
		String s="s6a9n4";
		String num="";
						
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				num=num+s.charAt(i);
			}
		}
		System.out.println("The numeric string is :" + num);
	}

}
