package abhijitMJun20;
import java.util.Scanner;

public class Maxnamelength {
	void findmaxname(String[] input){
		String sname=input[0];
		for(int index=0;index<input.length;index++) {
         // System.out.println(input[index]+":" +input[index].length());
          if(input[index].length()>sname.length()) {sname=input[index];}	
		}
		System.out.println("Name of which length is maximan is :" +sname);	
	}
	public static void main(String[] args) {
	       Scanner scanner =new Scanner(System.in);
	       System.out.println("How many name you want :");
	    	int namecnt=scanner.nextInt();
	    	String []name= new String[namecnt];
	    	for(int index=0;index<name.length;index++){
	    		System.out.println("Enter your " +(index+1)+" name");
	    		name[index]=scanner.next();
	    	}
	    	Maxnamelength maxnamelength = new Maxnamelength();
	    	maxnamelength.findmaxname(name);
	    	scanner.close();
	}
}
