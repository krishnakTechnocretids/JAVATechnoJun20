package madhuraMJun20.scannerClass;

import java.util.Scanner;

public class FrequencyOfCharacters {
	void oneChar(String name,char ch) {
		int count = 0;
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index) == ch)
				count++;
		}
		System.out.println(ch + " --> "+ count+ " time");
		
	}
	
	void allChar(String name1) {
		for(int i1=0; i1<name1.length(); i1++) {
			oneChar(name1, name1.charAt(i1));
		}
		
	}
	
	void allCharArray(String[] names) {
		for(int i3=0; i3<names.length; i3++) {
			allChar(names[i3]);
			System.out.println("====================================");
		}
		System.out.println("====================================");
	}
	public static void main(String[] args) {
		FrequencyOfCharacters frequencyOfCharacters = new FrequencyOfCharacters();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter name : ");
		String name = scanner.next();
		
		System.out.println("Enter the character : ");
		char findCh = scanner.next().charAt(0);
		frequencyOfCharacters.oneChar(name,findCh);
		System.out.println("====================================");
		System.out.println("Enter name : ");
		String name1 = scanner.next();
		frequencyOfCharacters.allChar(name1);
		System.out.println("====================================");
		System.out.println("Enter the size of an array : ");
		int size = scanner.nextInt();
		String[]names = new String[size];
		for(int i2=0; i2<size; i2++) {
			System.out.println("Enter name "+(i2+1)+ " : ");
			names[i2] = scanner.next();
		}
		frequencyOfCharacters.allCharArray(names);
		System.out.println("====================================");
		scanner.close();
	}

}
