package aasthaJJun20;

public class FindIndexOfChars {
	void countChars(String input){
		for(int index = 0; index < input.length(); index++){
			if(index == input.indexOf(input.charAt(index))){
				if(input.indexOf(input.charAt(index)) != input.lastIndexOf(input.charAt(index))){
					System.out.println(input.charAt(index) + " -> first index = " + input.indexOf(input.charAt(index))+" Last index = "+input.lastIndexOf(input.charAt(index)));
				}
			}
		}
	}
	
	public static void main(String[] args){
		FindIndexOfChars findIndexOfChars = new FindIndexOfChars();
		findIndexOfChars.countChars("technocredits");
	}
}
