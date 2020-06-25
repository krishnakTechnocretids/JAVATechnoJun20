package palakSJun20;
/* Write a program which print first and last index of every characters only if character has multiple occurrence.
Input : technocredits
Output :
t -> first index = 0 Last index = 11
e -> first index = 1 Last index = 8
c -> first index = 2 Last index = 6 */

public class FirstLastIndexOfCharacters {

	//Method for Finding first and last index of every characters
	void findFirstAndLastIndex(String input){
		
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int count = 0;
				if(index == input.indexOf(ch)) {
					for(int i = 0; i < input.length(); i++) {
						if (input.charAt(i) == ch) {
							count++;
						}
					}
				if (count > 1)
					System.out.print(ch+ " -> First Index = "+ input.indexOf(ch) + " Last Index = "+ input.lastIndexOf(ch) +"\n");	
			}
		}
	}
	
	public static void main(String[] args) {
		String string = "technocredits";
		FirstLastIndexOfCharacters indexOfCharacters = new FirstLastIndexOfCharacters();
		System.out.println("Input : " + string);
		indexOfCharacters.findFirstAndLastIndex(string);

	}

}
