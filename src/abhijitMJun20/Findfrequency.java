package abhijitMJun20;

import java.util.Scanner;

public class Findfrequency {

	void findchar( String input,char ch) {
		   int count=0;
		   for( int index=0;index<input.length();index++){
			 
			   if(input.charAt(index)==ch) {count++;
			  } 
		   }
		   System.out.println( "Totoal count of " +ch+ " in " +input + " is " +count+"\n" );
	   }
	    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Findfrequency findFrequency = new Findfrequency();
		Scanner scanner= new Scanner(System.in);
		System.out.println("How many name you want :");
 	int namecnt=scanner.nextInt();
 	String []name= new String[namecnt];
 	for(int index=0;index<name.length;index++){
 		System.out.println("Enter your " +(index+1)+" name");
 		name[index]=scanner.next();
 		System.out.println("Enter name which you want to find");
     	char findchar=scanner.next().charAt(0);
 		findFrequency.findchar(name[index],findchar);
 	}
     scanner.close();
	}
}
