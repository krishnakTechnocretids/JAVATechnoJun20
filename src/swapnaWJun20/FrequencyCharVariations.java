package swapnaWJun20;

import java.util.Scanner;

public class FrequencyCharVariations {

	//Char frequency in a name
	void nameFrequency(String name, char ch){
		int count=0;

		for(int index =0; index<name.length();index++)	{
			if(name.charAt(index)==ch)
				count++;
		}
		System.out.println("Character "+ch+" is present for "+count);
	}

	//All char frequency in a name
	void allCharNameFrequency(String name){
		System.out.println("====================================");
		for(int index=0;index<name.length();index++) {
			nameFrequency(name, name.charAt(index));
		}
	}

	//All char frequency in a an array of strings
	void arrayAllcharFrequency(String inp[]) {
		for(int index=0;index<inp.length;index++)
		{
			System.out.println("====================================");
			String name=inp[index];
			for(int index1=0;index1<name.length();index1++)
			{
				nameFrequency(name, name.charAt(index1));
			}
		}
	}
	
	public static void main(String[] args) {

		FrequencyCharVariations frequencyCharVariations = new FrequencyCharVariations();

		Scanner scanner = new Scanner(System.in);

		//single char in a name
		System.out.println("Enter the name :");
		String name = scanner.next();

		System.out.println("Enter the character to search in an array : ");
		char ch = scanner.next().charAt(0);
		frequencyCharVariations.nameFrequency(name, ch);

		//All characters in a name
		frequencyCharVariations.allCharNameFrequency(name);	

		System.out.println("====================================");

		//All characters of all strings in an array
		System.out.println("Enter the Array size:");
		int arraySize= scanner.nextInt();

		String inpArray[]= new String [arraySize];

		//Array values input
		for(int index=0; index<inpArray.length;index++)	{
			System.out.println("Enter the array value at index "+index+":");
			inpArray[index]=scanner.next();
		}

		frequencyCharVariations.arrayAllcharFrequency(inpArray);
		scanner.close();
	}
}