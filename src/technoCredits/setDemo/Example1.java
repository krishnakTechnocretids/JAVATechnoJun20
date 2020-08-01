package technoCredits.setDemo;

import java.util.HashSet;
import java.util.Set;

public class Example1 {
	
	public static void main(String[] args) {
		Set<String> setOfNames = new HashSet<String>();
		setOfNames.add("Maulik");
		setOfNames.add("Harshad");
		setOfNames.add("Ajit");
		setOfNames.add("Mahesh");
		System.out.println(setOfNames.add("Harshad"));
		
		System.out.println(setOfNames.size());// 
		System.out.println(setOfNames);
		
		setOfNames.remove("Ajit");
		System.out.println(setOfNames);
		
		System.out.println(setOfNames.contains("Mahesh"));
		
		System.out.println(setOfNames.isEmpty()); // true
		setOfNames.clear();
		System.out.println("Now set is empty ?? " + setOfNames.isEmpty()); 
		
		
	}
}
