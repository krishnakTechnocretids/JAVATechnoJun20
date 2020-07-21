package barkhaPJun20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling_AcceptAndAddIntegers {
	
	void acceptAndAddInt() {
		int countInt=0;
		int sum=0;
		int num;
		int totalNumToAdd=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Let us know how many numbers you want to add: ");  //Need to handle this as well..if user enter String
		try {
			totalNumToAdd=scanner.nextInt();
			while(countInt<totalNumToAdd) {                           //countInt=0; so countInt<totalNumToAdd(0,1,2). Program will run untill countInt<totalNumToAdd=fail
				try {
				System.out.println("Plz enter numbers you want to add: ");
				num=scanner.nextInt();                                //if user entered word or char or special char then it catch block will execute(will handle exception)
				sum+=num;
				countInt++;
				}catch(InputMismatchException ime) {
					scanner.next();
				}
			}
			System.out.println("Sum of provided Numbers are :"+sum);
		}catch(InputMismatchException ime) {
			System.out.println("INVALID INPUT");
			scanner.next();
		}
		scanner.close();
	}
	public static void main(String[] args) {
	new ExceptionHandling_AcceptAndAddIntegers().acceptAndAddInt();;
	}	
}					