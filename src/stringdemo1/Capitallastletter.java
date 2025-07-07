package stringdemo1;

public class Capitallastletter 
{
	
	
	public static void main(String[] args) 
	{
        String input = "hello world java program";
        String[] words = input.split(" ");
        String result = ""; // final result string

        for (String word : words) 
        {
            if (word.length() == 1) 
            {
                // If the word has only 1 character, capitalize it
                result += Character.toUpperCase(word.charAt(0)) + " ";
            } 
            else if (word.length() > 1) 
            {
                String front = word.substring(0, word.length() - 1); // all but last char
                char last = Character.toUpperCase(word.charAt(word.length() - 1)); // last char cap                                                                                          ital
                result += front + last + " ";
            }
        }

        System.out.println("Result: " + result.trim());
    }
	    }
	


