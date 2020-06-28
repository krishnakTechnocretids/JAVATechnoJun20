/*2) Create a class with following functionality. [Estimated time: 35 mins]
a) Find one character frequency from given name.
     Input: name - technocredits
               character - e
     Output : e -> 2 time in technocredits

b) Find all character frequency from given name.
     Input: name - aakanksha
     Output : a -> 4
	           a -> 4
                   k -> 2
                   a -> 4
                   n -> 1
                   k -> 2
                   s -> 1
                   h -> 1
                   a -> 4
c) Find all character frequency from each name given in String array.
     Input : Array -> {"raj", "aarya", "aavruti", "shruti"}
     Output : r -> 1 time in raj
                   a -> 1 time in raj
                   j -> 1 time in raj
         =====================
		   a -> 3 time in aarya
		   a -> 3 time in aarya
		   r -> 1 time in aarya
                   y -> 1 time in aarya
                   a -> 3 time in aarya	
         ====================
          And so on....		 */

package rachanaGJun20.String;

import java.util.Scanner;

public class CharacterCounting {

	void findOneCharFreq(String name, String ch) { // method will find frequency of any given character from a string
		int charcount = 0;
		for (int i = 0; i < name.length(); i++) {
			String str = String.valueOf(name.charAt(i));
			if (str.equalsIgnoreCase(ch)) {
				charcount++;
			}
		}
		System.out.println("name: "+name+" character: "+ch+" count: "+charcount);
	}

	void findAllCharFreq(String name) {

		for (int j = 0; j < name.length(); j++) {
			findOneCharFreq(name, String.valueOf(name.charAt(j)));

		}
	}

	void findAllCharFreqFromArray(String[] nameArray) {

		for (int j = 0; j < nameArray.length; j++) {
			for (int i = 0; i < nameArray[j].length(); i++) {
				findOneCharFreq(nameArray[j], String.valueOf(nameArray[j].charAt(i)));
			}
			System.out.println("=======================================");
		}

	}

	public static void main(String[] args) {
		CharacterCounting charactercounting = new CharacterCounting();
		Scanner scanner = new Scanner(System.in);
		boolean flag=true;
		do {
		System.out.println("MainMenu\n 1. Find one character frequency from given name\n 2. Find all character frequency from given name\n 3.Find all character frequency from each name given in String array\n 4.Exit");
		System.out.println("Please enter your choice");
		int usechoice = scanner.nextInt();
		
		switch(usechoice) {
			case 1:{
				System.out.println("Please enter a String");
				String stringname= scanner.next();
				System.out.println("Enter charater");
				String ch = scanner.next();
				charactercounting.findOneCharFreq(stringname,ch);
				break;
			}
			case 2:{
				System.out.println("Please enter a String");
				String stringname= scanner.next();
				charactercounting.findAllCharFreq(stringname);
				break;
			}
			case 3:{
				System.out.println("Enter how many Strings you want");
				int size=scanner.nextInt();
				System.out.println("Enter strings");
				String[] stringArray = new String[size];
				for(int i=0;i<size;i++) {
					stringArray[i]=scanner.next();
				}
				charactercounting.findAllCharFreqFromArray(stringArray);
				break;
			}
			case 4:{
				flag=false;
				break;
			}
			default:
				System.out.println("invalid output!");
	}
		}while(flag);
}
	}

