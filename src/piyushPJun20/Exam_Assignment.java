import java.util.Scanner;

public class Exam_Assignment {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		while(count<3) {
			System.out.println("Please Enter number: ");
		    int num = scanner.nextInt();
		    if(num>0) {
		    	sum +=num;
		    	count++;
		    	
		    }else {
		    	System.out.println("Negative Number not allowed");
		    }
		}
		System.out.println("Sum is " + sum);
		scanner.close();
	}	

}