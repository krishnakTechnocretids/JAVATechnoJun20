package archanaNJun20;

import java.util.ArrayList;
import java.util.Arrays;

public class RetrieveAllUnique {
	static void printUnique(ArrayList<String> input1, ArrayList<String> input2) {
		ArrayList<String> temp = new ArrayList<String>();
		input1.addAll(input2);
		for (String element : input1) {
			if (!temp.contains(element))
				temp.add(element);
		}
		System.out.println("output : " + temp);
	}
	public static void main(String[] args) {
		String[] name1 = { "Palak", "Viresh", "Yash", "Aavruti" };
		String[] name2 = { "Deavina", "Palak", "Viresh", "Nikhil" };
		ArrayList<String> input1 = new ArrayList<String>(Arrays.asList(name1));
		ArrayList<String> input2 = new ArrayList<String>(Arrays.asList(name2));
		RetrieveAllUnique.printUnique(input1, input2);
	}
}