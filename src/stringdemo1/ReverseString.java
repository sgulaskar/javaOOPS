package stringdemo1;

public class ReverseString {

	public static void main(String[] args) 
	{
		String g1="SANGRAM";
		String rev="";
		for(int i=(g1.length()-1);i>=0;i--)
		{
			rev=rev+g1.charAt(i);
		}
		System.out.println("The Reverse String is :"+rev);

	}

}
 