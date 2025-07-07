package stringdemo1;

public class Capitalfirstletter 
{
	 public static void main(String[] args) 
	 {
	String input = "hello world java program";
    String[] words = input.split(" ");
    String result = " "; // Use simple String instead of StringBuilder

    for (String word : words) 
    {
        if (!word.isEmpty()) 
        {
            // Capitalize first letter + rest of the word
            result += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
    }

    // Trim trailing space and print
    System.out.println("Capitalized: " + result.trim());
	
    
    
    
    /*public static void main(String[] args) 
	{
		String input = "hello world java program";
        String[] words = input.split(" ");
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) 
        {
            if (!word.isEmpty()) 
            {
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                           .append(word.substring(1)).append(" ");
            }
        }

        System.out.println("Capitalized: " + capitalized.toString().trim());
    }*/

	}}


