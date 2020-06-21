package swapnaWJun20;

import java.util.Scanner;

public class ScannerAccounts {

	static double actualBalance;
	int debitCountHDFC, creditCountHDFC, debitCountSBI, creditCountSBI, debitCountBOB, creditCountBOB, debitCountICICI, creditCountICICI;
	static int allDebit, allCredit;

	void bankOperation(String bankName, double amount, String operation){

		switch(bankName) {

		case "ICICI" :
			switch(operation) {
			case "Debit":
				if(actualBalance>amount){
					actualBalance = actualBalance - amount;
					debitCountICICI++;
					allDebit++;
				}
				else
					System.out.println("Insufficient funds in account");
				break;
			case "Credit":
				actualBalance = actualBalance + amount;
				creditCountICICI++;
				allCredit++;
				break;
			default :
				System.out.println("Invalid Operation");
			}
			break;

		case "HDFC" :
			switch(operation) {

			case "Debit":
				if(actualBalance>amount){
					actualBalance = actualBalance - amount;
					debitCountICICI++;
					allDebit++;
				}
				else
					System.out.println("Insufficient funds in account");
				break;
			case "Credit":
				actualBalance = actualBalance + amount;
				creditCountHDFC++;
				allCredit++;
				break;		
			default :
				System.out.println("Invalid Operation");
			}
			break;

		case "SBI" :
			switch(operation) {
			case "Debit":
				if(actualBalance>amount){
					actualBalance = actualBalance - amount;
					debitCountICICI++;
					allDebit++;
				}
				else
					System.out.println("Insufficient funds in account");
				break;
			case "Credit":
				actualBalance = actualBalance + amount;
				creditCountSBI++;
				allCredit++;
				break;		
			default :
				System.out.println("Invalid Operation");
			}
			break;

		case "BOB" :
			switch(operation) {
			case "Debit":
				actualBalance = actualBalance - amount; 
				debitCountBOB++;
				allDebit++;
				break;
			case "Credit":
				actualBalance = actualBalance + amount;
				creditCountBOB++;
				allCredit++;
				break;		
			default :
				System.out.println("Invalid Operation");
			}
			break;

		default :
			System.out.println("Invalid Bank Name entered");
			break;
		}
	}


	void showBalance(){
		System.out.println("Available balance in all banks (HDFC, BOB, SBI and ICICI) is : "+actualBalance);
	}

	void showAllCreditDebit(){
		System.out.println("\nTotal Credit operations in all banks are - " +allCredit+ " times");
		System.out.println("\nTotal Debit operations are - " +allDebit+ " times");
	}

	void showCredit(){
		System.out.println("\nICICI bank Credit Operation - " +creditCountICICI+ " times" + "\nSBI bank Credit Operation - " +creditCountSBI+ " times"+"\nHDFC bank Credit Operation - " +creditCountHDFC+ " times" + "\nBOB bank Credit Operation - " +creditCountBOB+ " times");
	}

	void showDebit(){
		System.out.println("\nICICI bank Debit Operation - "  +debitCountICICI+ " times"+"\nSBI bank Debit Operation - "  +debitCountSBI+ " times"+"\nHDFC bank Debit Operation - "  +debitCountHDFC+ " times"+"\nBOB bank Debit Operation -  "  +debitCountBOB+ " times");
	}

	static boolean displayMsg(){
		if(allCredit>allDebit)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		ScannerAccounts scannerAccount = new ScannerAccounts();
		String selectedValue="";

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Select the bank to perform the transaction: ICICI/HDFC/SBI/BOB? ");
			String bankName = sc.next();
			System.out.println("Please enter the  transaction : Debit/Credit? ");
			String operation = sc.next();
			System.out.println("Please enter the amount: ");
			int amount = sc.nextInt();
			scannerAccount.bankOperation(bankName,amount,operation);
			System.out.println("Would you like to continue: Y/N? ");
			selectedValue = sc.next();
		}
		while(selectedValue.equals("Y"));
		scannerAccount.showBalance();
		scannerAccount.showAllCreditDebit();
		scannerAccount.showCredit();
		scannerAccount.showDebit();

		displayMsg();
		if (displayMsg()==true)
			System.out.println("\nI appreciate your money management skill");
		else
			System.out.println("\nPlease spend money wisely");
		sc.close();
	}
}
