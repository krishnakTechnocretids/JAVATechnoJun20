import java.util.Scanner;

public class NameLength {
	
	void printLength(String[] input) {
		String max = input[0];
		for(int index=1; index<input.length;index++) {
			if(input[index].length() > max.length())
				max = input[index];
		}
		System.out.println(" Maximum length of String is:" + max.length());
	}

	public static void main(String[] args) {
		NameLength namelength = new NameLength();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" How many Elements you want to enter: ");
		int size = scanner.nextInt();
		String[] name = new String[size];
		
		for(int index=0; index<name.length; index++) {
			System.out.println(" Enter Name" + (index+1) + ":");
			name[index] = scanner.next();
		}
		
		namelength.printLength(name);
		scanner.close();
	}
	
	
}
