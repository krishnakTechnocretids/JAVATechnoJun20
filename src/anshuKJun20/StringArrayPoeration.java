package anshuKJun20;

import java.util.Scanner;

public class StringArrayPoeration {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		
		StringArrayPoeration stringarrayoperation = new StringArrayPoeration();
		// Client Enter Value 
		System.out.println("How many elements of String do you want to Enter");
		// Scan Client Output
		int strname = scanner.nextInt();
		  // Declare String
		String[] namearray = new String[strname];
		// operation call
		 stringarrayoperation.insertNameGivenByClient(namearray);
		String[] maximumLength = stringarrayoperation.getMaxLength(namearray);
		// print Name + Length of array 
		System.out.println("The Maximum Lenth Of Array is "+maximumLength + namearray.length);
		
	}
	// Method For Intiallize Array
	String[] insertNameGivenByClient(String[] namearray){
		for(int index =0;index < namearray.length;index++) {
			// Client Intialize array
			System.out.println("Please Enter Your Element Name" +(index+1));
			// Scan Client Output
			namearray[index] = scanner.next();
		}return namearray;
	}  
	//Method for Getting MaxLength
	String[] getMaxLength(String[] namearray){
		for(int index = 0; index < namearray.length;index++) {
			int maxlength;
			if(namearray.length>0) {
				 maxlength = namearray.length;
			}else
				System.out.println("Please enter valid Input");
		}return namearray;
	}
	
}///End

