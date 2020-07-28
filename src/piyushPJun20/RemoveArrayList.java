package piyushPJun20;

import java.util.ArrayList;

public class RemoveArrayList {
	void remove(ArrayList<String> name) {
		for (int index = 0; index < name.size(); index++) {
			if (name.get(index) == ("Techno")) {
				name.remove(index);
			}
		}
		System.out.println(name);
	}

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Maulik");
		name.add("Techno");
		name.add("Krishna");
		name.add("Techno");
		name.add("Credits");
		name.add("Techno");

		new RemoveArrayList().remove(name);
	}
}