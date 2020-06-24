package palakSJun20;

import java.util.Scanner;

public class BankOperationUsingScanner {
	double iciciBalance,  hdfcBalance, bobBalance, sbiBalance;
	static int totalCreditCount , totalDebitCount;
	int iciciCreditCount, iciciDebitCount, hdfcCreditCount, hdfcDebitCount, bobCreditCount, bobDebitCount, sbiCreditCount, sbiDebitCount;
	
	void bankOperation(int bankNumber , double amount, int operation){
		switch (bankNumber) {
			case 1:
				switch (operation) {
					case 1:
						iciciBalance = iciciBalance + amount;
						iciciCreditCount++;
						totalCreditCount++;
						break;
					case 2:
						if (iciciBalance < amount ) {
							System.out.println("You don't have sufficient balance to withdraw the amount from ICICI Bank");
						}
						else{
							iciciBalance = iciciBalance - amount;
							iciciDebitCount++;
							totalDebitCount++;
						}
					break;
					default:
						System.out.println("Invalid Operation Please Select Debit/Credit Operation for ICICI Bank ");
						break;
				}
				break;
			case 2:
				switch (operation) {
				case 1:
					hdfcBalance = hdfcBalance + amount;
					hdfcCreditCount++;
					totalCreditCount++;
					break;
				case 2:
					if(hdfcBalance >= amount){
						hdfcBalance = hdfcBalance - amount;
						hdfcDebitCount++;
						totalDebitCount++;
					}
					else
						System.out.println("You don't have sufficient balance to withdraw the amount from HDFC Bank");
					break;
				default:
					System.out.println("\"Invalid Operation Please Select Debit/Credit Operation for HDFC Bank \n");
					break;
				}
				break;
			case 3:
				switch (operation) {
				case 1:
					bobBalance = bobBalance + amount;
					bobCreditCount++;
					totalCreditCount++;
					break;
				case 2:
					if(bobBalance >= amount){
						bobBalance = bobBalance - amount;
						bobDebitCount++;
						totalDebitCount++;
					}
					else
						System.out.println("You don't have sufficient balance to withdraw the amount from BOB Bank");
					break;
				default:
					System.out.println("\"Invalid Operation Please Select Debit/Credit Operation for BOB Bank \n");
					break;
				}
				break;
			case 4:
				switch (operation) {
				case 1:
					sbiBalance = sbiBalance + amount;
					sbiCreditCount++;
					totalCreditCount++;
					break;
				case 2:
					if(sbiBalance >= amount){
						sbiBalance = sbiBalance - amount;
						sbiDebitCount++;
						totalDebitCount++;
					}
					else
						System.out.println("You don't have sufficient balance to withdraw the amount from SBI Bank");
					break;
				default:
					System.out.println("\"Invalid Operation Please Select Debit/Credit Operation for SBI Bank \n");
					break;
				}
		}
	}
	
	void TotalBalance(){
		System.out.println("Total balance of ICICI Bank Account - " + iciciBalance);
		System.out.println("Total balance of HDFC Bank Account  - " + hdfcBalance);
		System.out.println("Total balance of BOB Bank Account   - " + bobBalance);
		System.out.println("Total balance of SBI Bank Account   - " + sbiBalance +"\n");
	}
	
	void TotalOperation(){
		System.out.println("Total Credit Operation - "+totalCreditCount+ " Times");
		System.out.println("Total Debit Operation  - "+totalDebitCount+ " Times\n");
	}
	
	void IndividualCreditOperation(){
		System.out.println("ICICI Bank Credit Operation - "+iciciCreditCount+ " Times");
		System.out.println("HDFC Bank Credit Operation  - "+hdfcCreditCount+ " Times");
		System.out.println("BOB Bank Credit Operation   - "+bobCreditCount+ " Times");
		System.out.println("SBI Bank Credit Operation   - "+sbiCreditCount+ " Times\n");
	}
	
	void IndividaulDebitOperation(){
		System.out.println("ICICI Bank Debit Operation - "+iciciDebitCount+ " Times");
		System.out.println("HDFC Bank Debit Operation  - "+hdfcDebitCount+ " Times");
		System.out.println("BOB Bank Debit Operation   - "+bobDebitCount+ " Times");
		System.out.println("SBI Bank Debit Operation   - "+sbiDebitCount+ " Times\n");
	}
	
	void Messaage(){
		if(totalCreditCount > totalDebitCount)
			System.out.println("I appreciate your money management skill");
		else
			System.out.println("Please spend money wisely");
	}
	
	public static void main(String[] args) {
		BankOperationUsingScanner usingScanner = new BankOperationUsingScanner();
		Scanner scanner = new Scanner(System.in);
		String status="Y";
		do {
		System.out.println("Select Bank to perform any operation");
		System.out.println("1. ICICI \n2. HDFC \n3. BOB \n4. SBI \n");
		int bankNumber = scanner.nextInt();
		
		System.out.println("Select the Operation you want to perform");
		System.out.println("1. Credit \n2. Debit");
		int operation = scanner.nextInt();
		
		System.out.println("Enter the amount " );
		double amount = scanner.nextDouble();
		usingScanner.bankOperation(bankNumber, amount, operation);
		
		
		System.out.println("Would you like to continue?Y/N");
		status = scanner.next();
		}while(status.equals("Y"));
		usingScanner.TotalBalance();
		usingScanner.TotalOperation();
		usingScanner.IndividualCreditOperation();
		usingScanner.IndividaulDebitOperation();
		usingScanner.Messaage();
		
		scanner.close();
	}
	
}
