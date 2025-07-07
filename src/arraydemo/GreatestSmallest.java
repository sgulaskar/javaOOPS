package arraydemo;

public class GreatestSmallest {
	int a[]={56,85,12,45,65,78,92,3,77,62};
	int temp=a[0];
	int temp1=a[0];
	void max()
	{
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>temp)
			{
				temp=a[i];
			}
			
		}
		System.out.println("Greatest Number is-> "+temp);
	}
	void min()
	{
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<temp1)
			{
				temp1=a[i];
			}
			
		}
		System.out.println("Smallest Number is-> "+temp1);
	}
	public static void main(String[] args) {
		GreatestSmallest g=new GreatestSmallest();
		g.max();
		g.min();
	}

}
