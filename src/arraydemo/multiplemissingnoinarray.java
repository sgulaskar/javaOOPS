package arraydemo;

public class multiplemissingnoinarray 
{
	

	    public static void main(String[] args) {
	        int[] arr = {1, 3, 5, 6, 7};

	        // Find max number from array
	        int max = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }

	        // Check each number from 1 to max
	        System.out.print("Missing numbers: ");
	        for (int i = 1; i <= max; i++) {
	            boolean found = false;
	            for (int j = 0; j < arr.length; j++) {
	                if (arr[j] == i) {
	                    found = true;
	                    break;
	                }
	            }
	            if (!found) {
	                System.out.print(i + " ");
	            }
	        }
	    }
	}


	


