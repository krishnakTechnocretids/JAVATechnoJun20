package piyushPJun20;
import java.util.Scanner;

public class CharacterFrequency {

	void oneChar(String name, char ch){
		int count=0;
	for(int index =0; index<name.length();index++)	{
			if(name.charAt(index)==ch)
				count++;
		}
		System.out.println(" Character "+ch+" is present "+count + " time" );
	}

	void allChar(String name){
		
		for(int index=0;index<name.length();index++) {
			oneChar(name, name.charAt(index));
		}
	}

	void arrayAllchar(String input[]) {
		for(int index=0;index<input.length;index++)
		{
			allChar(input[index]);
				
		}
	}
	
	public static void main(String[] args) {

		CharacterFrequency charfreq = new CharacterFrequency();
		Scanner scanner = new Scanner(System.in);

		System.out.println(" Enter Name :");
		String name = scanner.next();

		System.out.println(" Enter character to search in array : ");
		char ch = scanner.next().charAt(0);
		charfreq.oneChar(name, ch);
		charfreq.allChar(name);	

		System.out.println("Enter Array size:");
		int size= scanner.nextInt();

		String array[]= new String [size];

		for(int index=0; index<array.length;index++)	{
			System.out.println(" Enter the array value at index "+index+":");
			array[index]=scanner.next();
		}

		charfreq.arrayAllchar(array);
		scanner.close();
	}
}