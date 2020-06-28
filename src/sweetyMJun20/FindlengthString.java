package sweetyMJun20;
import java.util.Scanner;
public class FindlengthString {
	String name1;
	int maxLength=0;
	void findlengthofstring(String[] input){
		for(int index=0;index<input.length;index++){
			System.out.println(input[index] + ":" + input[index].length());
			if(input[index].length() > maxLength){
				maxLength = input[index].length();
				name1 = input[index];
			}
		}
		//System.out.println("Maximum length of string is: " + maxLength);
		System.out.println("Maximum length of string name is: " + name1 + " " +maxLength);
	}
	
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many times you want to configure?");
		int size=scanner.nextInt();
		String []name=new String[size];
		for(int index=0;index<name.length;index++){
			System.out.println("Enter name " +(index+1) + ":");
			name[index]=scanner.next();
		}
		FindlengthString findlengthstring=new FindlengthString();
		findlengthstring.findlengthofstring(name);
	}
 
}
