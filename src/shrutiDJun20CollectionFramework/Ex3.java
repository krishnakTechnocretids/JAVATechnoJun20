package shrutiDJun20CollectionFramework;

import java.util.ArrayList;

public class Ex3 {
	void removeInteger(){
		ArrayList<Integer> names = new ArrayList<Integer>();
		names.add(100);
		names.add(13);
		names.add(33);
		names.add(40);
		names.add(44);
		names.add(3);
	
		
	System.out.println("ori list: "+ names);	
	//names.remove(3); // it will delete 3rd index
	System.out.println("new list: "+ names);
	names.remove(new Integer(3)); // will remove the number 3 of index 5
		
}
	
	public static void main(String[] args) {
		Ex3 e = new Ex3();
		e.removeInteger();
	}
}
