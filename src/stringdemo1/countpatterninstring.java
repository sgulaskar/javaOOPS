package stringdemo1;
//to count a pattern to be available in a given String
public class countpatterninstring {

	public static void main(String[] args) 
	{
		String pat="abcd";
		String txt="abcdthddfsabcdkhgfdscteabcdkjhf";
		int M=pat.length();
		int N=txt.length();
		int count=0;;
		
		for(int i=0;i<N-M;i++)
		{
			int j=0;
			for(j=0;j<M;j++)
			{
				if(txt.charAt(i+j)!=pat.charAt(j))
				{
					break;
				}
			}
			if(j==M)
			{
				count++;
				j=0;
			}
		}
		System.out.println("The count of Pattern 'abc' is : "+count);
		
	}
}

