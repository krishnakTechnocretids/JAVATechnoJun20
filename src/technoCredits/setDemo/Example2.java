package technoCredits.setDemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class Example2 {

	public static void main(String[] args) {
		Set<String> setOfNames = new LinkedHashSet<String>();
		setOfNames.add("Maulik");
		setOfNames.add("Harshad");
		setOfNames.add("Ajit");
		setOfNames.add("Mahesh");
		setOfNames.add("Ajit");
		
		//Failfast
		for(String name : setOfNames) {
				System.out.println(name);
		}
		
		
		
	}
}
