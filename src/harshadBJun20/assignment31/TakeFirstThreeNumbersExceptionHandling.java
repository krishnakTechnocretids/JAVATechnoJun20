/*Assingnment 31 : 19th July 2020

WAP to get first 3 numbers from user. Print 3 numbers and their sum.(Use exception handling concept. )
Note : User may enter wrong inputs, make sure program should not break.

Input :
10
TechnoCredits
2tech3
30
40
Output : values are 10,30,40 and total is 80*/

package harshadBJun20.assignment31;


import java.util.Scanner;

public class TakeFirstThreeNumbersExceptionHandling {
	
	void displaySumOfNumbers() {
		int[] numArray = new int[3];
		int num=0,count=0, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the numbers:");
		while (count<numArray.length)
		{
			try
			{
				num = Integer.parseInt(sc.next());
				numArray[count]=num;
				sum += num;
				count++;
			}
			/*catch(InputMismatchException e){
				//sc.next();
			}*/
			catch(NumberFormatException ne) {
				
			}
				
		}
		System.out.print("Values are ");
		for(int index=0;index<numArray.length;index++)
			System.out.print(numArray[index]+",");
		System.out.print(" and total is "+sum);

		sc.close();
	}
	public static void main(String[] args) {
		new TakeFirstThreeNumbersExceptionHandling().displaySumOfNumbers();
	}
}
