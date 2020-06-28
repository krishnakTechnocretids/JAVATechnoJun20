/*A) User can provide any positive and negative number
  B) You need to find out how many positive and negative numbers are there in array
     (Hint : here you need two variable which maintains count of positive and negative number)
     Example : input -> 10,-2,-3,4,7                 Output -> 3 positive & 2 negative numbers
  C) Create a method which return difference of positive number sum and negative number sum.
     Example : input -> 10,-2,-3,4,7                 Output -> 16              */

package jagadeeshMJun20;
import java.util.Scanner;
public class Assg15Prg2 {	
	int sumOfEvenNum (int[] num1, int size){
		int sum=0;
		int posCount=0;
		int negCount = 0; 
		for (int index=0;index<num1.length;index++) {
			if(num1[index] >= 0)
			//sum = sum+num1[index];
			posCount = posCount + 1;
			else negCount = negCount + 1;
			
			sum= sum+num1[index];					
		}
		System.out.println("===============================");
		System.out.println("Positive count is:   "+ posCount);
		System.out.println("Negative count is:   "+ negCount);
		return sum;
	}
	public static void main(String[] args) {
		Assg15Prg2 assg15Prg2 = new Assg15Prg2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Array Size (Please provide positive number:)");
		System.out.println("============================================");
		int size = scanner.nextInt();
		System.out.println("===== Provide  "+size+ "  positive and negative numbers =====");
		int[] num1 = new int[size];
		for (int index=0; index<num1.length; index++)
			num1[index] = scanner.nextInt();
		scanner.close();
		System.out.println("Sum of input numbers is :  "+assg15Prg2.sumOfEvenNum(num1,size));
		}
}