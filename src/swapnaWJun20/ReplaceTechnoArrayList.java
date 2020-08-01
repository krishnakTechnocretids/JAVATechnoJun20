package swapnaWJun20;

import java.util.ArrayList;

public class ReplaceTechnoArrayList {

	int wordCount;

	void replaceWord(ArrayList<String> input, String toBeRemoved, String toReplaceWith) {
		System.out.print("Techno word index in given arrayList is : ");
		while (input.contains(toBeRemoved)) {
			int indexWord = input.indexOf(toBeRemoved);
			System.out.print(indexWord + " ");
			input.set(indexWord, toReplaceWith);
		}
		for (int index = 0; index < input.size(); index++) {
			if (input.get(index).contains(toReplaceWith))
				wordCount++;
		}
		System.out.println("\nOutput list :" + input);
		System.out.println("Total Credits words : " + wordCount);
	}

	public static void main(String[] args) {
		ArrayList<String> input = new ArrayList<String>();
		input.add("Maulik");
		input.add("Techno");
		input.add("Krishna");
		input.add("Techno");
		input.add("Credits");
		input.add("Techno");
		System.out.println("Input : " + input);
		String toBeRemoved = "Techno", toReplaceWith = "Credits";
		new ReplaceTechnoArrayList().replaceWord(input, toBeRemoved, toReplaceWith);
	}
}