package kartikeyDJune20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueFromArrayList {
	void uniqueInArrays(ArrayList<String> list1, ArrayList<String> list2) {
		
	list2.removeAll(list1);
	list1.addAll(list2);
	System.out.println(list1);
	
	}
	
	public static void main(String[] args) {
		String[] str1= {"Palak", "Viresh", "Yash", "Avruti"};
		String[]  str2= {"Deavina", "Palak", "Viresh", "Nikhil"};
		
		ArrayList<String> al1= new ArrayList<String>(Arrays.asList(str1));
		ArrayList<String> al2=new ArrayList<String>(Arrays.asList(str2));
		new UniqueFromArrayList().uniqueInArrays(al1, al2);		
	}
}
