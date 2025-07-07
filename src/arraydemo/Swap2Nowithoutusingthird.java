package arraydemo;

public class Swap2Nowithoutusingthird {

	public static void main(String[] args) 
	{
		int a=20;
		int b=30;
		
		System.out.println("Before Swapping");
		System.out.println("First num : " +a);
		System.out.println("Second num : " +b); 
		
/*		a=a+b;
		b=a-b;
		a=a-b;    */
		
		a=a*b;
		b=a/b;		
		a=a/b;
		
		System.out.println("After Swapping a= " + a +  "b =" +b);
		
	}

}
