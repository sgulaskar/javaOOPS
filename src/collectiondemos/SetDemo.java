package collectiondemos;

import java.util.HashSet;
import java.util.Set;


public class SetDemo {

	public static void main(String[] args) {
		
		Set<Integer> s=new HashSet<>();
		s.add(56);
		s.add(90);
		s.add(34);
		s.add(56);
		s.add(70);
		
		System.out.println(s);
		

	}

}
