package madhuraMJun20.scannerClass;

/*Find all differ index from given arrays.
               i/p:- arr1: {"Maulik", "Harsh", "Krishna", "Technocredits"}
                       arr2: {"Maulik","Harsh","Technocredits","Krishna"}		*/
public class AllDifferIndexString {
	void findAllDiffer(String[] arr1, String[] arr2) {
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					System.out.println("Values are not matching at index -> " + i + ", [arr1 value is " + arr1[i]
							+ ", arr2 value is " + arr2[i] + "]");
				}
			}
		} else
			System.out.println("Arrays are not equal");
	}

	public static void main(String[] args) {
		AllDifferIndexString allDifferIndexString = new AllDifferIndexString();
		String[] arr1 = { "Maulik", "Harsh", "Krishna", "Technocredits" };
		String[] arr2 = { "Maulik", "Harsh", "Technocredits", "Krishna" };
		allDifferIndexString.findAllDiffer(arr1, arr2);
	}
}