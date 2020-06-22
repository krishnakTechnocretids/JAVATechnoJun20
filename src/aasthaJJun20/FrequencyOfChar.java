package aasthaJJun20;
import java.util.Scanner;

class FrequencyOfChar{
	
	int getFrequencyOfChar(String[] names, char ch){
		int countChar = 0;
		for(int arrIndex = 0; arrIndex < names.length; arrIndex++){
			for(int index = 0; index < names[arrIndex].length(); index++){
				if((String.valueOf(names[arrIndex].charAt(index)).equalsIgnoreCase(String.valueOf(ch))))
					countChar++;
			}
		}
		return countChar;
	}
	
	
	public static void main(String[] args){
		FrequencyOfChar frequencyOfChar = new FrequencyOfChar();
		Scanner scanner = new Scanner(System.in);
		String status = "";
		
		do{
			System.out.println("How many names would you like to enter?");
			int size = scanner.nextInt();
			String[] names = new String[size];
			for(int index = 0; index < names.length; index++){
				System.out.println("please enter name "+ (index+1));
				names[index] = scanner.next();
			}
			System.out.println("Which character's frequency is required?");
			char ch = scanner.next().charAt(0);
			System.out.println("The frequency of '"+ ch +"' in the entered names : " + frequencyOfChar.getFrequencyOfChar(names,ch) + " times");
			System.out.println("Press y if you want to continue");
			status = scanner.next();
		}while(status.equals("y"));
		scanner.close();
	}
}
