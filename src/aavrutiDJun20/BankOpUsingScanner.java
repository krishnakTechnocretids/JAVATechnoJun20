package aavrutiDJun20;

import java.util.Scanner;
public class BankOpUsingScanner {

	int debitICICICnt, creditICICICnt;
	int debitHDFCCnt, creditHDFCCnt;
	int debitBOBCnt, creditBOBCnt;
	int debitSBICnt,creditSBICnt;
	double iciciBankBal,hdfcBankBal,bobBankBal,sbiBankBal;
	static int allBankDebitCnt,allBankCreditCnt;
	
	//Perform Debit or Credit Operation on particular bank
	void bankTransactions(String bankName, double amount, String bankOperation) {
		switch(bankName) {
			case "ICICI":
				switch(bankOperation) {
					case "Credit":
					case "credit":
						iciciBankBal += amount;
						creditICICICnt++;
						allBankCreditCnt++;
						break;
					case "Debit":
					case "debit":
						if(amount <= iciciBankBal) {
							iciciBankBal -=amount;
							debitICICICnt++;
							allBankDebitCnt++;
						}
						else {
							System.out.println("Insufficient Bank Balance in ICICI. Your Bank Balance is " + iciciBankBal);
						}
						break;
					default:
						System.out.println("Invalid Bank Operation");
				}
				break;
				
			case "HDFC":
				switch(bankOperation) {
					case "Credit":
					case "credit":
						hdfcBankBal += amount;
						creditHDFCCnt++;
						allBankCreditCnt++;
						break;
					case "Debit":
					case "debit":
						if(amount <= hdfcBankBal) {
							hdfcBankBal -= amount;
							debitHDFCCnt++;
							allBankDebitCnt++;
						}
						else {
							System.out.println("Insufficient Bank Balance in HDFC. Your Bank Balance is " + hdfcBankBal);
						}
						break;
					default:
						System.out.println("Invalid Bank Operation");
				}
				break;
				
			case "BOB":
				switch(bankOperation) {
					case "Credit":
					case "credit":
						bobBankBal += amount;
						creditBOBCnt++;
						allBankCreditCnt++;
						break;
					case "Debit":
					case "debit":
						if(amount <= bobBankBal) {
							bobBankBal -= amount;
							debitBOBCnt++;
							allBankDebitCnt++;
						}
						else {
							System.out.println("Insufficient Bank Balance in BOB. Your Bank Balance is " + bobBankBal);
						}
						break;
					default:
						System.out.println("Invalid Bank Operation");
				}
				break;
				
			case "SBI":
				switch(bankOperation) {
					case "Credit":
					case "credit":
						sbiBankBal += amount;
						creditSBICnt++;
						allBankCreditCnt++;
						break;
					case "Debit":
					case "debit":
						if(amount <= sbiBankBal) {
							sbiBankBal -= amount;
							debitSBICnt++;
							allBankDebitCnt++;
						}
						else {
							System.out.println("Insufficient Bank Balance in SBI. Your Bank Balance is " + sbiBankBal);
						}
						break;
					default:
						System.out.println("Invalid Bank Operation");
				}
				break;
				
			default:
				System.out.println("Invalid Bank Name");
		
		}
	}
	
	//Print total bank balance individually
	void printBankBalance() {
		System.out.println("\nICICI Bank Balance : " + iciciBankBal );
		System.out.println("HDFC  Bank Balance : " + hdfcBankBal );
		System.out.println("BOB   Bank Balance : " + bobBankBal );
		System.out.println("SBI   Bank Balance : " + sbiBankBal );
		System.out.println("Total Bank Balance : " + (iciciBankBal + hdfcBankBal + bobBankBal + sbiBankBal) + "\n");
	}
	
	//Print debit and credit operation by combining of all the bank
	void printAllBankOperation() {
		System.out.println("\nTotal Credit Operation  : " + allBankCreditCnt);
		System.out.println("Total Debit Operation   : " + allBankDebitCnt);
	}
	
	//print Credit operations count of all the bank
	void bankCreditOperations() {
		System.out.println("\nICICI Bank Credit Operation : " + creditICICICnt);
		System.out.println("HDFC Bank Credit Operation  : " + creditHDFCCnt);
		System.out.println("BOB Bank Credit Operation   : " + creditBOBCnt);
		System.out.println("SBI Bank Credit Operation   : " + creditSBICnt);
	}
	
	//print debit operations count of all the bank
	void bankDebitOperations() {
		System.out.println("\nICICI Bank Debit Operation : " + debitICICICnt);
		System.out.println("HDFC Bank Debit Operation  : " + debitHDFCCnt);
		System.out.println("BOB Bank Debit Operation   : " + debitBOBCnt);
		System.out.println("SBI Bank Debit Operation   : " + debitSBICnt);
	}
	
	String suggestionMsg() {
		if(allBankCreditCnt > allBankDebitCnt) {
			return "*I appreciate your money management skill*";
		}
		else
		{
			return "*Please spend money wisely*";
		}
	}
		
	public static void main(String[] args) {
		BankOpUsingScanner bankOpUsingScanner = new BankOpUsingScanner();
		Scanner scanner = new Scanner(System.in);
		
		String bankName,bankOp,status,bankBal,bankDebitOp,bankCreditOp,bankDebitCreditOp;
		double bankAmt;
		do {
			System.out.println("On which Bank would you like to perform the operation? ICICI/HDFC/SBI/BOB");
			bankName = scanner.next();
			if(!bankName.equalsIgnoreCase("ICICI") && !bankName.equalsIgnoreCase("HDFC") && !bankName.equalsIgnoreCase("SBI") && !bankName.equalsIgnoreCase("BOB")) {
				System.out.println("Please re-enter valid Bank Name. ICICI/HDFC/SBI/BOB");
				bankName = scanner.next();
			}
			bankName = bankName.toUpperCase();
			
			System.out.println("Which operation would you like to perform on " + bankName +" Bank? Debit/Credit");
			bankOp = scanner.next();
			if(!bankOp.equalsIgnoreCase("Debit") && !bankOp.equalsIgnoreCase("Credit")) {
				System.out.println("Please re-enter valid Bank Operation. Debit/Credit");
				bankOp = scanner.next();
			}
			
			System.out.println("How much amount would you like to " + bankOp + " from/in your " + bankName + " Bank?");
			bankAmt = scanner.nextDouble();
	
			bankOpUsingScanner.bankTransactions(bankName,bankAmt,bankOp);
			
			System.out.println("Would you like to see your bank balance of all the Banks? Yes/No");
			bankBal = scanner.next();
			if(bankBal.equalsIgnoreCase("Yes"))
				bankOpUsingScanner.printBankBalance();
			
			System.out.println("Would you like to see number of Debit Operations you have performed? Yes/No");
			bankDebitOp = scanner.next();
			if(bankDebitOp.equalsIgnoreCase("Yes"))
				bankOpUsingScanner.bankDebitOperations();
			
			System.out.println("Would you like to see number of Credit Operations you have performed? Yes/No");
			bankCreditOp = scanner.next();
			if(bankCreditOp.equalsIgnoreCase("Yes"))
				bankOpUsingScanner.bankCreditOperations();
			
			System.out.println("Would you like to see total number of Debit & Credit Operations you have performed? Yes/No");
			bankDebitCreditOp = scanner.next();
			if(bankDebitCreditOp.equalsIgnoreCase("Yes"))
				bankOpUsingScanner.printAllBankOperation();
			
			System.out.println("Would you like to continue with your Bank Transactions? Yes/No");
			status = scanner.next();		
		}while(status.equalsIgnoreCase("Yes"));
		
		scanner.close();
	}
}