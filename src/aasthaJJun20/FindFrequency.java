package aasthaJJun20;
import java.util.Scanner;

public class FindFrequency {
	void frequencyOfChar(String input, char ch){
		int count = 0;
		for(int index = 0; index<input.length(); index++){
			if((String.valueOf(input.charAt(index)).equalsIgnoreCase(String.valueOf(ch))))
				count++;
		}
		System.out.println(ch+" -> "+count+" time in "+input);
	}
	
	void frequencyOfEachChar(String input){
		for(int index = 0; index<input.length(); index++){
			frequencyOfChar(input,input.charAt(index));
		}
	}
	
	void frequencyInEachName(String[] names){
		for(int index = 0; index < names.length; index++){
			frequencyOfEachChar(names[index]);
			System.out.println("-----------------------------------------");
		}
	}
	
	public static void main(String[] args){
		FindFrequency findFrequency = new FindFrequency();
		Scanner scanner = new Scanner(System.in);
		String status = "";
		do{
			System.out.print("Please enter a name? : ");
			String name = scanner.next();
			System.out.print("Which letter's frequency you want? ");
			String letter = scanner.next();
			findFrequency.frequencyOfChar(name,letter.charAt(0));
			System.out.println("---------------------------------------------------------------");
			System.out.print("Enter a name to get the frequency of each letter of that name: ");
			findFrequency.frequencyOfEachChar(scanner.next());
			System.out.println("---------------------------------------------------------------");
			System.out.print("How many names would you like to enter in array to get the frequency of each letter of each name? ");
			int size = scanner.nextInt();
			String[] names = new String[size];
			for(int index = 0; index<names.length; index++) {
				System.out.print("Enter name " + (index+1)+" : ");
				names[index] = scanner.next();
			}
			findFrequency.frequencyInEachName(names);
			System.out.println("\nPress y if you want to continue");
			status = scanner.next();
		}while(status.equalsIgnoreCase("y"));
		scanner.close();
	}
}
