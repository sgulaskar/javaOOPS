package stringdemo1;

public class ReverseEachWordInPlace 
{

	public static void main(String[] args) 
	{
		String input = "hello world java";
        String[] words = input.split(" ");
        String result = "";

        for (String word : words) {
            String reversedWord = "";

            // Reverse each word
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }

            // Add to result with a space
            result += reversedWord + " ";
        }

        // Trim trailing space and print
        System.out.println("Reversed Words (Original Position): " + result.trim());
		
	}

}
