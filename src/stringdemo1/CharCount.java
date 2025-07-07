 package stringdemo1;
//count the number of occurrence of a single character in a String:
public class CharCount {

	public static void main(String[] args) {
		String str="Mahabharata";
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a')
			{
				count=count+1;
			}
			
			
		}
		System.out.println("Maximum no 'a' Occurance count is : "+count);
		

	}

}
