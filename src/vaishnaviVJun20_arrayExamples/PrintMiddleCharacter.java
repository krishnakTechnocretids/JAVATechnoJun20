package vaishnaviVJun20_arrayExamples;

public class PrintMiddleCharacter {

	void PrintMiddleCharacterOfWord(String s) {
		String[] array = s.split(" ");
		for(int index=0;index<array.length;index++) {
			int middle=0;
			if(array[index].length()%2==0) {
			middle = (array[index].length()/2)-1;
			System.out.println(array[index].charAt(middle) +" is middle character in "+array[index]);
			}
			else {
				middle = array[index].length()/2;	
				System.out.println(array[index].charAt(middle) +" is middle character in "+array[index]);
	        }
	   }	
   }
	
	public static void main(String[] args) {
		PrintMiddleCharacter printMiddleCharacter = new PrintMiddleCharacter();
		String input= "Harsh Maulik";
		printMiddleCharacter.PrintMiddleCharacterOfWord(input);
	}

}
