package technoCredits.mapDemo;

import java.util.HashMap;

public class Example3 {

	public static void main(String[] args) {
		HashMap<Integer,String> studentMap = new HashMap<Integer,String>(); 
		studentMap.put(3,"Madhura");
		studentMap.put(2,"Yash");
		studentMap.put(1,"Maulik"); 
		studentMap.put(4,"Archana");
		studentMap.put(5,"Archana");
		studentMap.put(1,"Archana");
		
		System.out.println(studentMap.get(1));
		
		
	}
}
