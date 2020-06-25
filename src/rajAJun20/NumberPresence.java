package rajAJun20;

import java.util.Scanner;

public class NumberPresence {
	
	void isNumberPresent(int[] input , int number ){
		int count = 0;
		for(int index = 0 ; index < input.length ; index++) {
			if(input[index] == number) 
				count++ ;
		}
			 if(count == 0) 
				System.out.println("Given number " + number + " is not present in predefined array " );
			 else 
				System.out.println("Given number " + number + " is present in predefined array " );
			
	}
	
	public static void main(String[] args) {
		NumberPresence numberPresence = new NumberPresence();
		int[] array = {10,3,9,-99,81,3,-11};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number you want to find :");
		int num = scan.nextInt();
		
		numberPresence.isNumberPresent(array,num);
		scan.close();
	}

}
