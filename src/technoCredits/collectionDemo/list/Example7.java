package technoCredits.collectionDemo.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example7 {

	List<String> l1 = new ArrayList<String>();
	
	static List<String> m1(){
		return new ArrayList<String>();
	}
	
	
	static Object m2() {
		return new String("Techno");
	}
	
	public static void main(String[] args) {
		String[] name1 = {"Palak", "Yash", "Aavruti"};
		String[] name2 = {"Deavina", "Viresh", "Nikhil"};
		
		ArrayList<String> nameList1 = new ArrayList<String>(Arrays.asList(name1));
		ArrayList<String> nameList2 = new ArrayList<String>(Arrays.asList(name2));
		ArrayList<String> allNames = new ArrayList<String>(nameList1);
		
		allNames.addAll(nameList2);
		
		//List<String> temp = Example7.m1();
	}
}
