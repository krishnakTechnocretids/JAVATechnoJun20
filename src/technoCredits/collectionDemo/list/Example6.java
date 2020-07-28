package technoCredits.collectionDemo.list;

import java.util.ArrayList;

// union of two ArrayList
// Rachna, Shruti, Archna
// Raj, Harshad, Mahesh
//
public class Example6 {

	void addAllList(ArrayList<String> list1, ArrayList<String>list2) {
		ArrayList<String> temp = new ArrayList<String>(list1);
		
		for(int index = 0;index<list2.size(); index++) {
			temp.add(list2.get(index));
		}
		System.out.println(temp);
	}
	
	void addAllList1(ArrayList<String> list1, ArrayList<String>list2) {
		
		list1.addAll(list2);
		System.out.println(list1);
	}
	
	void removeAllOperation(ArrayList<String> list1, ArrayList<String>list2) {
		list1.removeAll(list2);
		System.out.println(list1);
	}
	
	void retainAllOperation(ArrayList<String> list1, ArrayList<String>list2) {
		ArrayList<String> temp = new ArrayList<String>(list1);
		temp.retainAll(list2);
		System.out.println(temp);
	}
	
	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Rachna");
		al1.add("Shruti");
		al1.add("Archana");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Raj");
		al2.add("Harshad");
		al2.add("Mahesh");
		al2.add("Archana");
		
		/*new Example6().addAllList1(al1, al2);
		
		System.out.println(al1.size()); // 
*/		
		//new Example6().removeAllOperation(al1, al2);
		
		new Example6().retainAllOperation(al1, al2);
	}
}
