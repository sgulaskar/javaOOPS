package stringdemo1;

public class Each_char_repeat_3_times {

	public static void main(String[] args) 
	{
		 String input = "a,bb,cc";
	        String[] words = input.split(",");
	        String result = "";

	        for (int i = 0; i < words.length; i++) {
	            char ch = words[i].charAt(0);  // Get first character of each word
	            int repeat = 0;

	            if (ch == 'a') repeat = 3;
	            else if (ch == 'b') repeat = 6;
	            else if (ch == 'c') repeat = 9;

	            for (int j = 0; j < repeat; j++) {
	                result += ch;
	            }

	            if (i < words.length - 1) {
	                result += ",";
	            }
	        }

	        System.out.println("Output: " + result);
		

	}

}
