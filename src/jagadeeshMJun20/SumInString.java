/* WAP to do sum of numbers in given statement. (Use split method and Exception handling concept.
 *  Do not use character class methods and ascii concept.) 

Input : I have 5 Years 6 month of experience.
Output : 11 */
package jagadeeshMJun20;

import java.util.Scanner;

public class SumInString {
 int displayOutput(String input) {
	 String[] str = input.split(" ");
	 int sum=0, index=0;
	 do {
		 try{
			 sum +=Integer.parseInt(str[index]);
		 	 }catch(NumberFormatException ae) {
			 System.out.println("Exception is handled");
		 	 }
		 index++;
		 }while(index<str.length);
	 return sum;
 }
	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Details :");
		String input = scanner.nextLine();
		System.out.println("Output is : "+new SumInString().displayOutput(input));
		scanner.close();
	}
}
