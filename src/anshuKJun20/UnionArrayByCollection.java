package anshuKJun20;

import java.util.ArrayList;
import java.util.Arrays;

public class UnionArrayByCollection {
	
	void findUnionOfArray(ArrayList<String> nameList1 , ArrayList<String> nameList2 ) {
		nameList1.addAll(nameList2);
		for(int index = 0 ; index < nameList1.size(); index++) {
			if(nameList1.indexOf(nameList1.get(index)) != nameList1.lastIndexOf(nameList1.get(index))){
				nameList1.remove(nameList1.lastIndexOf(nameList1.get(index)));
			}
		}
		System.out.println(" Final ArrayList is = " +nameList1);
	}
	public static void main(String[] args) {
		UnionArrayByCollection unionArray = new UnionArrayByCollection();
		String[] name1 = {"Palak", "Viresh", "Yash", "Aavruti", "Viresh"};
		String[] name2 = {"Deavina","Palak","Viresh", "Nikhil", "Nikhil"};
		ArrayList<String> nameList1 = new ArrayList<String>(Arrays.asList(name1));
		ArrayList<String> nameList2 = new ArrayList<String>(Arrays.asList(name2));
		
		System.out.println(" Input 1 = " +nameList1);
		System.out.println(" Input 2 = "+nameList2);
		unionArray.findUnionOfArray(nameList1, nameList2);
	}
}
