/*
 Create a class with following functionality. [Estimated time: 35 mins]
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
          And so on....		 
 */
package shrutiDJun20;

import java.util.Scanner;

public class CharFrequency {
	
	void findChar(String name, char ch){
		int count = 0;
		for(int i=0;i<name.length();i++){
			if(name.charAt(i)==ch)
			count++;	
		}
		System.out.println(name + ": Frequency of charecter '"+ch + "' is "+ count + " times.");
	}
	
	void findAllChar(String name){
		for(int charIndex=0; charIndex<name.length(); charIndex++){
			findChar(name, name.charAt(charIndex));
		}
		System.out.println("***************************************");
	}
	
	void findAllCharFromArray(String nameAr[]){
		for(int i=0; i<nameAr.length; i++){
			findAllChar(nameAr[i]);	
			}
	}
public static void main(String[] args) {
	CharFrequency charFrequency = new CharFrequency();
	charFrequency.findChar("technocredit", 'e');
	System.out.println("***************************************");
	charFrequency.findAllChar("aakankshaa");
	Scanner scanner = new Scanner(System.in);
	System.out.println();
	System.out.println("How many names you would like to enter");
	int size = scanner.nextInt();
	String[] nameArray = new String[size];
	 for(int i=0; i<size; i++){
		 System.out.println("Please enter name"+(i+1));
	nameArray[i] = scanner.next();
	 }
	 charFrequency.findAllCharFromArray(nameArray);
	 scanner.close();
}
}
