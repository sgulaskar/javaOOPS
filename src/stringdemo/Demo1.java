package stringdemo;

public class Demo1 {

	public static void main(String[] args) {
		String s1="java";
		String s2="JAVA";
		
		String s3=new String("coding");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// char at s1 of 2 index
		System.out.println(s1.charAt(2));
		//char at s2 of index 3
		System.out.println(s2.charAt(3));
		//s1 equL TO S2 IF IN CASE OF S1 IS CAPITAL S2 IS LOWER STRING THEN IT  RETURNS  FALSE
		System.out.println(s1.equals(s2));
		System.out.println(s3.indexOf('i'));
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s3.compareTo(s2));
		System.out.println(s3.length());
		System.out.println(s2.concat(s3));
		System.out.println(s2.contains(s1));
		System.out.println(s2.lastIndexOf(1));

	}

}
