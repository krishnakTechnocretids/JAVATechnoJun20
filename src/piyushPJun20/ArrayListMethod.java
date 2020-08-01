package piyushPJun20;

import java.util.ArrayList;

public class ArrayListMethod {
	void display(ArrayList<String> name) {
		System.out.print("Techno word index in given arrayList is ");
		for (int index = 0; index < name.size(); index++) {
			if (name.get(index) == "Techno") {
				System.out.print(index + ",");
			}
		}
	}

	void replaceWord(ArrayList<String> name) {
		System.out.println();
		for (int index = 0; index < name.size(); index++) {
			if (name.get(index) == "Techno")
				name.set(index, "Credits");
		}
		System.out.println(name);
	}

	void countWord(ArrayList<String> name) {
		int count = 0;
		for (int index = 0; index < name.size(); index++) {
			if (name.get(index) == "Credits") {
				count++;
			}
		}
		System.out.println("Total Credit words: " + count);
	}

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Maulik");
		name.add("Techno");
		name.add("Krishna");
		name.add("Techno");
		name.add("Credits");
		name.add("Techno");

		ArrayListMethod array = new ArrayListMethod();
		array.display(name);
		array.replaceWord(name);
		array.countWord(name);
	}
}