package day1;

import java.util.HashMap;
import java.util.Map;

public class setclsass {

	public static void main(String[] args) {


		// map is a collection framework who works with key and value .
		
		Map<Integer ,String> m = new HashMap<>();
		
		// how to enter the data in map 
		
		m.put(1, "chandra");
		m.put(3, "Ashok");
		m.put(5, "preeti");
		m.put(2, "Adesh");
		
		m.put(8, "Adeshs");
		
		
		
		System.out.println(m);
		
		System.out.println(m.get(2));
		
		m.remove(1);
		
		System.out.println(m);

		System.out.println(m.containsKey(1));
		
		System.out.println(m.containsValue("Adesh"));
		
		System.out.println(m.size());
		
		//m.clear();
		
		//System.out.println(m);
		
		for(Map.Entry<Integer,String>  entry : m.entrySet() ) {
			
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
