package arraydemo;

public class RepeatedNumbers 
{

	public static void main(String[] args) 
	{
		int[] arr = {1, 2, 3, 2, 4, 5, 1};

        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[i] == arr[j]) 
                {
                    System.out.println("Repeated number: " + arr[i]);
                    break; // Exit inner loop once duplicate is found
                }
            }
        }
	}
}

	


