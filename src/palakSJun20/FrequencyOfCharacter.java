package palakSJun20;

import java.util.Scanner;


	public class FrequencyOfCharacter {
	
	//Finding Character from Array String
	void findCharacterFromArray(String[] array , char findCh){
		String name = null;
		//Looping array
		for (int i = 0; i < array.length; i++) {
			int count = 0;
			name = array[i];
			
			//Looping Each array String
			for (int j = 0; j < name.length(); j++) {
				if(name.charAt(j) == findCh) 
					count++;
			}
				System.out.println("Name is " + name +" character "+ findCh + " --> "+ count );
		}
		
	}
	
	///Finding Character from Array String using Ignore Case 
	void findCharacterFromArrayAnotherMethod(String[] array , char findCh){
		String name = null;
		
		String findChar = String.valueOf(findCh);
		for (int i = 0; i < array.length; i++) {
			name = array[i];
			int count = 0;
			for (int j = 0; j < array[i].length(); j++) {
				if(String.valueOf(name.charAt(j)).equalsIgnoreCase(findChar))
					count++;
			}
				System.out.println("Name is " + name +" character "+ findChar + " --> "+ count);
		}
	}
	
	public static void main(String[] args) {
		FrequencyOfCharacter frequencyOfCharacter = new FrequencyOfCharacter();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size = sc.nextInt();
		String[] array = new String[size];
		
		//Taking Array Input from User
		for (int index = 0; index < array.length; index++) {
			System.out.println("Enter Name");
			array[index] = sc.next();
		}
		
		System.out.println("Enter the character You want to search");
		char findCh = sc.next().charAt(0);
		
		//Calling Method Finding Character from Array String
		frequencyOfCharacter.findCharacterFromArray(array , findCh);
		System.out.println("");
		frequencyOfCharacter.findCharacterFromArrayAnotherMethod(array, findCh);
		
		sc.close();
	}

}
