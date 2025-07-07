package collectiondemos;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	

	public static void main(String[] args) {
		
		Map<Integer,String> m=new HashMap<>();
		
		m.put(25, "Ram");
		m.put(45, "Sita");
		m.put(65, "Laxman");
		m.put(86, "Ram");
		m.put(45, "Shiv");
		
		System.out.println(m);
		

	}

}
