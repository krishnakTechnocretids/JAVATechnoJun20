package harshadBJun20;

import java.util.Scanner;

public class FrequencyOfCharactersInStringArray{
	
	void frequencyOfCharMatch(String[] name,char ch){
		int freqCount=0;
		String freqChar= String.valueOf(ch);
		for(int index=0;index<name.length;index++) {
			freqCount=0;
			for(int j=0;j<name[index].length();j++) {
				String cmpChar= String.valueOf(name[index].charAt(j));
				if(cmpChar.equalsIgnoreCase(freqChar)){
					freqCount++;
					//System.out.println("Hello");
				}
			}
			
			//System.out.println("Name "+(index+1)+" : "+name[index]+" ---> "+freqCount);
			System.out.println(ch+" occurs in "+"Name "+(index+1)+" : "+name[index]+" ---> "+freqCount+ " times");
		}
	}
	
	public static void main(String args[]){
		FrequencyOfCharactersInStringArray frequencyOfCharactersInStringArray = new FrequencyOfCharactersInStringArray();
		Scanner sc = new Scanner(System.in);
		int size=0;
		char freqChar;
		System.out.println("Enter how many names you want to store in array: ");
		size = sc.nextInt();
		String[] names = new String[size];
		
		for(int index=0;index<size;index++){
			System.out.println("Enter Name "+(index+1)+ ": ");
			names[index]=sc.next();
			//names[index]=sc.nextLine();
		}
		
		System.out.println("Enter a character for which you want frequency match count from all elements of array: ");
		freqChar = sc.next().charAt(0);
		
		frequencyOfCharactersInStringArray.frequencyOfCharMatch(names,freqChar);
		
		sc.close();
	}
}