package anshuKJun20;

import java.util.ArrayList;

public class RemoveStringByArrayList {

	void removeString(ArrayList<String> name) {
		while (name.contains("Techno")) {
			name.remove("Techno");
		}
		System.out.println("Final Array List = " + name);
	}

	public static void main(String[] args) {
		RemoveStringByArrayList removeStringByArrayList = new RemoveStringByArrayList();
		ArrayList<String> name = new ArrayList<String>();
		name.add("Maulik");
		name.add("Techno");
		name.add("Krishna");
		name.add("Techno");
		name.add("Credits");
		name.add("Techno");

		System.out.println("Original ArrayList = " + name);
		 removeStringByArrayList.removeString(name);
	}
}
