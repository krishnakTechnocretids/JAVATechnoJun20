package technoCredits.mapDemo;

import java.util.HashMap;

public class Example2 {

	public static void main(String[] args) {
		HashMap<Integer,String> studentMap = new HashMap<Integer,String>(); 
		studentMap.put(3,"Madhura"); // null
		studentMap.put(2,"Yash"); // null
		System.out.println(studentMap.put(1,"Maulik")); // null
		studentMap.put(4,"Archana"); // null
		System.out.println(studentMap.put(1, "Deavina")); // Maulik
		System.out.println(studentMap.put(1, "Anup")); // Deavina
		
		
		System.out.println(studentMap.size()); // 
		System.out.println(studentMap);
		
	}
}
