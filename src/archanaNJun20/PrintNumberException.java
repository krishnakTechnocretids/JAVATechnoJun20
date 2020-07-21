package archanaNJun20;
import java.util.InputMismatchException;
import java.util.Scanner;
public class PrintNumberException{
	void  sumOfDigits(){
		int[] array = new int[3];
		int counter = 0, sum = 0;
		String concatNumber=""; 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter numbers:");
		while(counter<=2){
			try{
				array[counter] = scanner.nextInt();
				sum += array[counter];
				concatNumber += array[counter] + ", ";
				counter++;
			}
			catch(InputMismatchException ie){
				System.out.println("Please enter integer number");
				scanner.next();
			}
		}
		System.out.println(concatNumber+" : Sum of numbers is "+sum);
		scanner.close();
	}
	public static void main(String[] args) {
		PrintNumberException printNumberException=new PrintNumberException();
		printNumberException.sumOfDigits();
	}
} 