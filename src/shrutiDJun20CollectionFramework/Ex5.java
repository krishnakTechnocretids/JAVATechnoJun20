package shrutiDJun20CollectionFramework;

import java.util.ArrayList;

public class Ex5 {

	void findIndexofPerson(){
		

			ArrayList<String> names = new ArrayList<String>();
			names.add("Shruti");
			names.add("Ankit");
			names.add("Kunal");
			names.add("Simps");
			names.add("Runs");
			names.add("Ankit"); 
			
			System.out.println(names.indexOf("Ankit"));
			System.out.println(names.indexOf("invalid name which is not present"));
			System.out.println(names.indexOf("invalid name which is not present2"));
			System.out.println(names.contains("raj"));
			System.out.println(names.contains("Runs"));
		
		
		
	}
	
	public static void main(String[] args) {
		Ex5 e = new Ex5();
		e.findIndexofPerson();
	}
	
	
	
}
