package stringdemo1;

public class Palindrom {

	public static void main(String[] args) {
		String g1="NAYAN";
		String rev="";
		for(int i=(g1.length()-1);i>=0;i--)
		{
			rev=rev+g1.charAt(i);
		}
		if(g1.equals(rev))
		{
			System.out.println("String is Palindrom");
		}
		else
		{
			System.out.println("String is  not Palindroms");
		}
		

	}

}
