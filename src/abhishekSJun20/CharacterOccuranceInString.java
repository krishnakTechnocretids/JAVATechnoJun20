package abhishekSJun20;

public class CharacterOccuranceInString {

	static void countChars(String input) {
		for (int index = 0;index<input.length();index++) {
			int count = 0;
			if (index == input.indexOf(input.charAt(index))) {
				for (int innerIndex = 0; innerIndex < input.length(); innerIndex++) {
					if (input.charAt(index) == input.charAt(innerIndex))
						count++;
				}
			}
			if (count > 1)
				System.out.println(input.charAt(index) + " -> first index = " + input.indexOf(input.charAt(index))
				+ " Last index = " + input.lastIndexOf(input.charAt(index)));
		}
	}
	
	public static void main(String[] args) {
		//CharacterOccuranceInString findIndexOfChars = new CharacterOccuranceInString();
		//findIndexOfChars.countChars("technocredits");
		countChars("technocredits");
	}
}
			
