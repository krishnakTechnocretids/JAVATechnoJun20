package anshuKJun20;

import java.util.Scanner;

public class StringArrayOperation {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		
		StringArrayOperation stringarrayoperation = new StringArrayOperation();
		// Client Enter Value 
		System.out.println("How many elements of string do you want to enter:");
		// Scan Client Output
		int strname = scanner.nextInt();
		  // Declare String
		String[] namearray = new String[strname];
		// operation call
		 stringarrayoperation.insertNameGivenByClient(namearray);
		 stringarrayoperation.printMaxLength(namearray);
		 stringarrayoperation.printMinLength(namearray);
		
		}
	// Method For Intiallize Array
	 String[] insertNameGivenByClient(String[] namearray){
		for(int index =0;index < namearray.length;index++) {
			// Client Intialize array
			System.out.println("Please enter your  name" +(index+1)+":");
			// Scan Client Output
			namearray[index] = scanner.next();
		}return namearray;
	}  
	//Method for Getting MaxLength
	void printMaxLength(String[] namearray){
	      int maxlength=0;
		for(int index = 0; index < namearray.length;index++) {
			
			if(namearray.length>0) {
				 maxlength = namearray[index].length();
			}else
				System.out.println("Please enter valid Input");
		}
		
		System.out.println("Maxmium lenth = "+ maxlength);
	}
	void printMinLength(String[] namearray){
		
		int minlength=namearray[0].length();
		for(int index = 1; index < namearray.length;index++) {
			
			if(minlength<namearray[0].length()) {
				 minlength = namearray[index].length();
			  }
			}
		
		System.out.println("Minimum lenth = "+ minlength);
		}
	}
///End

