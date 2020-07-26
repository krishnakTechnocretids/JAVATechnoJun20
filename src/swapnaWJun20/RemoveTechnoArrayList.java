package swapnaWJun20;

import java.util.ArrayList;

public class RemoveTechnoArrayList {

	void removeWord(ArrayList<String> input, String toBeRemoved) {
		for (int index = 0; index < input.size(); index++) {
			if (input.contains(toBeRemoved)) {
				input.remove(toBeRemoved);
			}
		}
		System.out.println("Output : " + input);
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
		String toBeRemoved = "Techno";
		new RemoveTechnoArrayList().removeWord(input, toBeRemoved);
	}
}