package stringdemo1;

public class string {

	public static void main(String[] args) {
		String s1="java";
		String s2=new String("Program");
		String s3="MAHABHARATA";
		String s4="JAVA";
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("------------------------");
		// character of s3 at 4 index
		System.out.println(s3.charAt(4));
		
		System.out.println("------------------------");
		//s1 equL TO S2 IF IN CASE OF S1 IS CAPITAL S2 IS LOWER STRING THEN IT  RETURNS  FALSE

		System.out.println(s3.indexOf('B'));
		System.out.println(s1.toUpperCase());
		System.out.println(s4.toLowerCase());
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s3.compareTo(s2));
System.out.println("-----------------------");
		System.out.println(s3.length());
		System.out.println(s1.concat(s2));
		System.out.println(s2.contains(s1));
		System.out.println(s2.lastIndexOf(1));
	}

}
