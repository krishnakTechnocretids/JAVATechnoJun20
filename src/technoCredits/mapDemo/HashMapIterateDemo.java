package technoCredits.mapDemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashMapIterateDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> studentMap = new HashMap<Integer,String>(); 
		studentMap.put(3,"Madhura");
		studentMap.put(2,"Yash");
		studentMap.put(1,"Maulik"); 
		studentMap.put(4,"Archana");
		studentMap.put(5,"Archana");
		studentMap.put(1,"Archana");
		
		Set<Integer> keys= studentMap.keySet();
		/*for(int num : keys) {
			System.out.println(num + ":" + studentMap.get(num));
		}*/
		
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()) {
			int key = itr.next();
			System.out.println(key + ":" + studentMap.get(key));
		}
		
		/*Set<Integer> set = new HashSet<Integer>();
		set.add(11);
		set.add(3);
		set.add(99);
		
		for(int num : set) {
			System.out.println(num);
		}
		
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
	}
}
