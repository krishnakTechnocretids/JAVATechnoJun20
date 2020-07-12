/*
 * Assignment 16 : 24th Jun 2020

1) Create a class where you need to check given number is there in predefined array or not, if present then print frequency of the number. [Estimated time: 15 mins]

Input : Predefined array -> {10,3,9,-99,81,3,-11}
           Number to be check -> 33
Output : Given number 33 is not present in predefined array.

Input : Number to be check -> 3
output : Given number 3 is present in predefined array with frequency 2.

2) Create a class with following functionality. [Estimated time: 35 mins]
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
package suparnaNJune20.Assignment16;

public class ArrayOperation {
void findNoInArray(int arrayOfNo[], int findNo) {
	int noCnt=0;
	System.out.println("Number to be check -> " +findNo);
	
	for (int index=0; index < arrayOfNo.length; index++)
	{
		if  (arrayOfNo[index] == findNo)
			noCnt++;
	}
	
	if (noCnt == 0)
		System.out.println("\nOutput : Given number "+ findNo +" is not present in predefined array.");
	else 
		System.out.println("\noutput : Given number"+ findNo +" is present in predefined array with frequency "+noCnt);

		
}

void findCharInArray (String str, char ch) {
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrayOfNo [] = {10,3,9,-99,81,3,-11};
		System.out.println("check given number is there in predefined array or not, if present then print frequency of the number. ");
		System.out.println("\nInput : Predefined array -> {10,3,9,-99,81,3,-11}");
		
		
		new ArrayOperation().findNoInArray(arrayOfNo ,3);
		new ArrayOperation().findNoInArray(arrayOfNo ,123);
	}

}
