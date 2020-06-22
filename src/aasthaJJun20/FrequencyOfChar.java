package aasthaJJun20;
import java.util.Scanner;
//To find the char in each string of an array
class FrequencyOfChar{
	
	void frequencyOfChar(String[] names, char ch){
		for(int arrIndex = 0; arrIndex < names.length; arrIndex++){
			int countChar = 0;
			for(int index = 0; index < names[arrIndex].length(); index++){
				if((String.valueOf(names[arrIndex].charAt(index)).equalsIgnoreCase(String.valueOf(ch))))
					countChar++;
			}
			System.out.println("Total number of '"+ch+"' in name "+(arrIndex+1)+": '"+names[arrIndex]+"' is : "+countChar+" times");
		}
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
			frequencyOfChar.frequencyOfChar(names,ch);
			System.out.println("Press y if you want to continue");
			status = scanner.next();
		}while(status.equalsIgnoreCase("y"));
		scanner.close();
	}
}
