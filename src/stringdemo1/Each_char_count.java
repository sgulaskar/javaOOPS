package stringdemo1;

public class Each_char_count {

	public static void main(String[] args) 
	{
		String input = "Sangram";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Skip if character already printed
            if (input.indexOf(ch) != i) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == ch) {
                    count++;
                }
            }

            System.out.println(ch + " = " + count);
        }
    }

	

}
