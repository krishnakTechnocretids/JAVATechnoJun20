package suparnaNJune20;
import java.util.Scanner;

public class BankMenuAccOpen {
	Scanner scanner = new Scanner(System.in);
	double bal;
	void accountOpen() {
		
	System.out.println("For SBI account Minimum opening bal should be greater than Rs.3000:");
	bal = scanner.nextInt();
	BankMenu.SBIBal = bal;
	
	System.out.println("For ICICI account Minimum opening bal should be greater than Rs.5000:");
	bal = scanner.nextInt();
		BankMenu.ICICBal = bal;
	
	System.out.println("For BOB account Minimum opening bal should be greater than Rs.8000:");
	bal = scanner.nextInt();
	 	BankMenu.BOBBal = bal;
	
	
	System.out.println("For HDFC account Minimum opening bal should be greater than Rs.10000:");
	bal= scanner.nextInt();
	 	BankMenu.HDFCBal = bal;
		}
		
}
