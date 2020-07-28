package technoCredits.collectionDemo.list;

import java.util.ArrayList;
import java.util.Arrays;

public class Example8 {

	public static void main(String[] args) {
		String[] name1 = {"Palak", "Yash", "Aavruti"};
		
		for(String temp : name1) {
			System.out.println(temp);
		}
		
		int num[] = {10,20,11};
		int sum = 0;
		for(int currentNumber : num) {
			sum += currentNumber;
		}
		System.out.println(sum);
		
		ArrayList<String> nameList = new ArrayList<String>(Arrays.asList(name1));
		System.out.println("-------------------");
		
		for(String currentName : nameList) {
			System.out.println(currentName);
		}
		
		// Array // Collection //  Top to Bottom
	}
}
