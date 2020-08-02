package technoCredits.mapDemo;

import java.util.HashMap;

public class Example1 {

	public static void main(String[] args) {
		HashMap<Integer,String> studentMap = new HashMap<Integer,String>(); 
		studentMap.put(3,"Madhura");
		studentMap.put(2,"Yash");
		studentMap.put(1,"Maulik"); // 1
		studentMap.put(4,"Archana");
		
		System.out.println(studentMap.size());
		System.out.println(studentMap.containsKey(11));
		System.out.println(studentMap.containsValue("Yash"));
		
		System.out.println(studentMap);
		System.out.println(studentMap.remove(2));
		System.out.println(studentMap);
		
	}
}
