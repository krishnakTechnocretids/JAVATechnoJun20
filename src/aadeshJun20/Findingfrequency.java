package aadeshJun20;

import java.util.Scanner;

public class Findingfrequency {

	void findchar( String input,char ch) {
		   int count=0;
		   for( int index=0;index<input.length();index++){

			   if(input.charAt(index)==ch) {count++;
			  } 
		   }
		   System.out.println( "Totoal count of " +ch+ " in " +input + " is " +count+"\n" );
	   }
	    public static void main(String[] args) {
		
		Findingfrequency findingFrequency = new Findingfrequency();
		Scanner scanner= new Scanner(System.in);
		System.out.println("How many names do you want? :");
 	int namecnt=scanner.nextInt();
 	String []name= new String[namecnt];
 	for(int index=0;index<name.length;index++){
 		System.out.println("Enter your " +(index+1)+" Name");
 		name[index]=scanner.next();
 		System.out.println("Enter the name which you want to find");
     	char findchar=scanner.next().charAt(0);
 		findingFrequency.findchar(name[index],findchar);
 	}
     scanner.close();
	}
}
