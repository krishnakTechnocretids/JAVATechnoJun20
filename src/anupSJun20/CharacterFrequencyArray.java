package anupSJun20;
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
         ====================*/

import java.util.Scanner;

public class CharacterFrequencyArray {
	void oneCharFrequency(String name, char ch) {
		int count = 0;
		String character = String.valueOf(ch);
		for(int index = 0;index<name.length();index++) {
			
			if(String.valueOf(name.charAt(index)).equalsIgnoreCase(character))
				count++;
		}
		System.out.println(ch + " --> " + count +  " times in " + name);	
	}
	void eachCharFrequency(String name) {
		for(int index = 0;index<name.length();index++) {
			oneCharFrequency(name, name.charAt(index));
		}
		
	}
	void eachCharFrequencyInArray(String[] name) {
		for(int index = 0;index<name.length;index++) {
			eachCharFrequency(name[index]);
			System.out.println("------------------------------------");
			}
		}
	
	public static void main(String[] args) {
		CharacterFrequencyArray characterFrequencyArray = new CharacterFrequencyArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name :");
		String name = sc.next();
		System.out.println("Enter the character :");
		char ch = sc.next().charAt(0); 
		characterFrequencyArray.oneCharFrequency(name,ch);
		System.out.println("Enter the Name :");
		String nameforEachCharFrequency = sc.next();
		characterFrequencyArray.eachCharFrequency(nameforEachCharFrequency);
		System.out.println("Enter the number of words ");
		int num = sc.nextInt();
		String[] nameArray = new String[num];
		for(int index = 0;index<num;index++) {
			System.out.println("Enter the word "+(index+1));
			nameArray[index] = sc.next();
		}
		characterFrequencyArray.eachCharFrequencyInArray(nameArray);
	}

}
