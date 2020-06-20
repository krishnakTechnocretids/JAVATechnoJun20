package madhuraMJun20.scannerClass;

import java.util.Scanner;

public class SwitchCaseScanner {
	double balanceI , balanceH, balanceB, balanceS;
	int iciciC,iciciD, hdfcC, hdfcD, bobC,bobD,sbiC,sbiD;
	static int countCredit, countDebit;
		
	void bankOperation(String bankName , double amount, String operation) {
		switch(bankName) {
			case "ICICI":
				switch (operation) {
					case "Credit":
						balanceI += amount;
						countCredit++;
						iciciC++;
						break;
					case "Debit":
						if(balanceI>=amount) {
							balanceI -= amount;
							countDebit++;
							iciciD++;
						}
						else {
							System.out.println("*You have Insufficient balance in ICICI account*");
						}
						break;
					
					default:
						System.out.println("Invalid input");
						break;
				}
				break;	
			case "HDFC":
				switch (operation) {
					case "Credit":
						balanceH += amount;
						countCredit++;
						hdfcC++;
						break;
					case "Debit":
						if(balanceH >= amount ) {
							balanceH -= amount;
							countDebit++;
							hdfcD++;
						}
						else
							System.out.println("*You have Insufficient balance in HDFC account*");
						break;
					
					default:
						System.out.println("Invalid input");
						break;
				}
				break;
			case "BOB":
				switch (operation) {
					case "Credit":
						balanceB += amount;
						countCredit++;
						bobC++;
						break;
					case "Debit":
						if(balanceB >= amount) {
							balanceB -= amount;
							countDebit++;
							bobD++;
						}
						else
							System.out.println("*You have Insufficient balance in BOB account*");
						break;
					
					default:
						System.out.println("Invalid input");
						break;
				}
				break;
			case "SBI":
				switch (operation) {
					case "Credit":
						balanceS += amount;
						countCredit++;
						sbiC++;
						break;
					case "Debit":
						if(balanceS >= amount) {
							balanceS -= amount;
							countDebit++;
							sbiD++;
						}
						else
							System.out.println("*You have Insufficient balance in SBI account*");
						break;
					
					default:
						System.out.println("Invalid input");
						break;
				}
				break;
		}
	}
	
	void totalBalanceOfAllAccount() {
		System.out.println("Total balance of all the bank accounts : " +(balanceI+balanceH+balanceB+balanceS));

	}
	void totalCreditDebitOperation() {
		System.out.println("Total Credit operations : " +countCredit+ " times");
		System.out.println("Total Debit operations : " +countDebit+" times");
	}
	void individualBkCreditOperation() {
		System.out.println("ICICI Bank Credit operation :- " +iciciC);
		System.out.println("HDFC Bank Credit operation :- " +hdfcC);
		System.out.println("BOB Bank Credit operation :- " +bobC);
		System.out.println("SBI Bank Credit operation :- " +sbiC);
	}
	void individualBkDebitOperation() {
		System.out.println("ICICI Bank Debit operation :- " +iciciD);
		System.out.println("HDFC Bank Debit operation :- " +hdfcD);
		System.out.println("BOB Bank Debit operation :- " +bobD);
		System.out.println("SBI Bank Debit operation :- " +sbiD);
	}
	String message() {
		if(countCredit>=countDebit)
			return "*I appreciate your money management skill*";
		else
			return "*Please spend your money wisely*";
	}
	
	public static void main(String[] args) {
		SwitchCaseScanner switchCaseScanner = new SwitchCaseScanner();
		Scanner scanner = new Scanner(System.in);
		
		String status = "";
		do {
			System.out.println("Enter the Bank name for your trasaction (ICICI/HDFC/BOB/SBI): ");
			String bankName= scanner.next();
			
			System.out.println("Enter amount : ");
			int amount= scanner.nextInt();
			
			System.out.println("What would you like to do - Credit/Debit ? : ");
			String operation= scanner.next();
			
			switchCaseScanner.bankOperation(bankName,amount,operation);
			
			System.out.println("Would you like to make another trasaction ? (y/n)");
			status = scanner.next();
			System.out.println();
		}while (status.equals("y"));
		System.out.println("Summary of yor trasactions : ");
		
		switchCaseScanner.totalBalanceOfAllAccount();
		System.out.println();
		switchCaseScanner.totalCreditDebitOperation();
		System.out.println();
		switchCaseScanner.individualBkCreditOperation();
		System.out.println();
		switchCaseScanner.individualBkDebitOperation();
		System.out.println();
		
		System.out.println(switchCaseScanner.message());
		
		scanner.close();
		
	}
}

