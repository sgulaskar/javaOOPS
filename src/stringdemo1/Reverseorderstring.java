package stringdemo1;

public class Reverseorderstring 
{

	public class ReverseWords {
	    public static void main(String[] args) {

	        String input = "hello world java";
	        String[] words = input.split(" ");
	        String reversed = "";

	        for (int i = words.length - 1; i >= 0; i--) {
	            reversed += words[i] + " ";
	        }

	        System.out.println("Word-Reversed: " + reversed.trim());
	    }
	}

	}


