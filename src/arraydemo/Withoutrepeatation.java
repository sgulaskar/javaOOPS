package arraydemo;

public class Withoutrepeatation 
{

	public static void main(String[] args) 
	{
		
		  int[] arr = {1, 2, 3, 2, 4, 5, 1, 6};

		  System.out.print("Unique elements: ");
	        for (int i = 0; i < arr.length; i++) 
	        {
	           int count = 0;

	           // Count how many times arr[i] appeared before index i
	           for (int j = 0; j < i; j++) 
	           {
	               if (arr[i] == arr[j]) 
	               {
	                   count++;
	               }
	           }

	            // If count is 0, it means it's the first occurrence
	            if (count == 0) 
	            {
	                System.out.print(arr[i] + " ");
	            }
		    }
		


	}

}
