package technoCredits.collectionDemo.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example6 {

	public static void main(String[] args) {
		String[] names = {"Barkha","Suparna","Rachana"};
		
		List<String> listOfName= Arrays.asList(names);
		System.out.println(listOfName);
		
		ArrayList<String> al = new ArrayList<String>(listOfName);
		al.remove(0);
		System.out.println(al);
	}
}
