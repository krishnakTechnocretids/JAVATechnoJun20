package shrutiDJun20CodeExams;

/*
 Print minimum rotation required to compare both strings equality.
 Example 1  : 
 String input1 = "abcdef";
 String input2 = "defabc";
 output : 3
 */
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.LinkedHashSet;

public class CodeExam10 {

	void rotateElemets(ArrayList<String> list1, ArrayList<String> list2) {

		int count = 0;
		ArrayList<String> tempList1 = new ArrayList<String>(list1);
		if (list1.size() == list2.size()) {
			for (String temp : list1) {
				if (tempList1.equals(list2)) {
					break;
				} else {
					temp = tempList1.remove(list1.size() - 1);
					tempList1.add(0, temp);
					count++;
				}
			}
			System.out.println("No. Of rotation needed for inputs to match--> "
					+ count);
		} else {
			System.out.println("Inputs provided are of diff length");
		}
	}

	void rotateElementWithoutCollection(String input1, String input2) {
		int count = 0;
		if (input1.length() == input2.length()) {
			while (!input1.equals(input2)) {
				input1 = input1.substring(input1.length() - 1)
						+ input1.substring(0, (input1.length() - 1));
				count++;
			}
			System.out.println("Required No of Rotation -> "+count);
		} else {
			System.out.println("Provided inputs are of different length");
		}
	}

	public static void main(String[] args) {
		String input1 = "abcdef";
		String input2 = "defabc";

		String[] arr1 = input1.split("");
		String[] arr2 = input2.split("");

		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(arr1));
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(arr2));

		CodeExam10 codeExam10 = new CodeExam10();
		//codeExam10.rotateElemets(list1, list2);
		codeExam10.rotateElementWithoutCollection(input1, input2);
		
	}
}
