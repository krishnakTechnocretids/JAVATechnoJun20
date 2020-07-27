package shrutiDJun20CollectionFramework;

import java.util.ArrayList;

public class Ex4 {

	void addObject(){
		ArrayList<Object> names = new ArrayList<Object>();
		names.add("Shruti");
		names.add("Ankit");
		names.add("Kunal");
		names.add("Simps");
		names.add("Runs");
		names.add("Bits"); 
		
		System.out.println("size: "+ names.size());
		System.out.println(names);
	System.out.println((names.set(4, "runnu")));
//	names.set(4, "runnu");
	names.add(2,"raju");
//	System.out.println((names.add(2,"raju")));
	
		System.out.println(names);
	
}
	
	public static void main(String[] args) {
		
		Ex4 e = new Ex4();
		e.addObject();
	
}
}
