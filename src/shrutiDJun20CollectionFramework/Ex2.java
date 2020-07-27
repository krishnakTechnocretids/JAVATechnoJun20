package shrutiDJun20CollectionFramework;

import java.util.ArrayList;

public class Ex2 {

	void removeOperation(){
		ArrayList<String> names = new ArrayList<String>();
		names.add("Shruti");
		names.add("Shruti7");
		names.add("Shruti88");
		names.add("Shruti999");
		names.add("Shruti...11");
		names.add("Shruti....12");  //size = 6
		
		
	//	System.out.println("originals:" + names);
		//names.remove(2);
		//System.out.println("new:"+ names);
		
	//	System.out.println("size is " + names.size());
		
		//System.out.println("originals:" + names);
		System.out.println(names.remove("Shruti78888"));
	//	System.out.println("new:"+ names);
		
		
	}
	
	public static void main(String[] args) {
		Ex2 e = new Ex2();
		e.removeOperation();
	}
	
}
