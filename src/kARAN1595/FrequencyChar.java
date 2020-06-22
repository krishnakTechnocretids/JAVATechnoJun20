package kARAN1595;

import java.util.Scanner;

public class FrequencyChar {

	
	void displayFrequencyArray(String[] array,char charfrequency) {
		int charFrequencyCount=0;
	
		
		for(int index=0;index<array.length;index++)
		{
			String charfreq=array[index];
			for(int element=0;element<charfreq.length();element++) {
				if(charfreq.charAt(element)==charfrequency) {
					charFrequencyCount++;
				}
			}
		}
		System.out.println("Character count:"+charFrequencyCount);
		
	}
	public static void main(String[] args) {
         FrequencyChar frequencyChar = new FrequencyChar();
         Scanner scanner = new Scanner(System.in);
         
         
         System.out.println("Enter Array Size:");
         int arrayLength = scanner.nextInt();
         String[] array = new String[arrayLength];
         for(int index=0;index<arrayLength;index++) {
        	 System.out.println("Enter array elements:"+(index+1)+":");
        	 //array[index]=scanner.nextLine();
        	 array[index]=scanner.next();
         }
         System.out.println("Enter character want to search:");
         char ch = scanner.next().charAt(0);
         
         frequencyChar.displayFrequencyArray(array,ch);
         scanner.close();
	}

}
/*Output:-Enter Array Size:
4
Enter array elements:1:
fdfsdfs
Enter array elements:2:
sfffds
Enter array elements:3:
fdsfsd
Enter array elements:4:
dsfsdfs
Enter character want to search:
f
Character count:10
*/