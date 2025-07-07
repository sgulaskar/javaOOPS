package arraydemo;

public class ArrayDemo {

	int arr[]={8,56,75,45,69,15,89};
	void display()
	{
		System.out.println("Array in order");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
	}
	void reverse()
	{
		System.out.println("Array in reverse order");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		ArrayDemo a=new ArrayDemo();
		a.display();
		a.reverse();
		

	}

}
