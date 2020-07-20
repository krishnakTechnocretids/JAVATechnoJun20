package suparnaNJune20.Assignment_31;
import java.util.InputMismatchException;
import java.util.Scanner;
public class InputNumberExceptionHandling {
	static int sum = 0, cnt = 0;
	public void sumOfNumber(int inputCnt)
	{
		
		
		Scanner scanner = new Scanner(System.in);
		for ( cnt = 1; cnt <= inputCnt; cnt++) {
			
			try {
				System.out.println("Enter "+ cnt +" input Number ");
				sum += scanner.nextInt();
				
			} catch (InputMismatchException inputMismatchException) {
				System.out.println("Enter Number input not a string  ");
				scanner.next();
				
			}
		}
		System.out.println("Sum = "+sum);
				scanner.close();
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter total number of count of number  to find sum");
new InputNumberExceptionHandling().sumOfNumber(scanner.nextInt());
	}

}
