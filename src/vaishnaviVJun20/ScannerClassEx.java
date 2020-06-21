package vaishnaviVJun20;

import java.util.Scanner;

public class ScannerClassEx {
	
	int sbiBalance;
	int iciciBalance;
	int hdfcBalance;
	int bobBalance;
	int sbiCreditCount;
	int sbiDebitCount;
	int iciciCreditCount;
	int iciciDebitCount;
	int bobCreditCount;
	int bobDebitCount;
	int hdfcCreditCount;
	int hdfcDebitCount;
	static int totalCredtCount;
	static int totalDebitCount;
		
	void bankOperations(String bankName,double amount,String operation) {
		switch(bankName) {
		    case "ICICI":
		    	switch(operation) {
		    	   case "Debit":
		    		   if(iciciBalance>=amount) {
		    			   iciciBalance -=amount;
		    			   iciciDebitCount++;
		    			   totalDebitCount++;
		    		   }
		    		   break;
		    	   case "Credit":
		    		   iciciBalance +=amount;
		    		   iciciCreditCount++;
		    		   totalCredtCount++;
		    		   break;
		    		default: 
		    			System.out.println("Invalid Operation");
		    	}
		    break;
		    case "SBI":
		    	switch(operation) {
		    	   case "Debit":
		    		   if(sbiBalance>=amount) {
		    			   sbiBalance -=amount;
		    			   sbiDebitCount++;
		    			   totalDebitCount++;
		    		   }
		    		   break;
		    	   case "Credit":
		    		   sbiBalance +=amount;
		    		   sbiCreditCount++;
		    		   totalCredtCount++;
		    		   break;
		    		default: 
		    			System.out.println("Invalid Operation");
		    	}
		    break;	
		    case "HDFC":
		    	switch(operation) {
		    	   case "Debit":
		    		   if(hdfcBalance>=amount) {
		    			   hdfcBalance -=amount;
		    			   hdfcDebitCount++;
		    			   totalDebitCount++;
		    		   }
		    		   break;
		    	   case "Credit":
		    		   hdfcBalance +=amount;
		    		   hdfcCreditCount++;
		    		   totalCredtCount++;
		    		   break;
		    		default: 
		    			System.out.println("Invalid Operation");
		    	}
		    break;
		    case "BOB":
		    	switch(operation) {
		    	   case "Debit":
		    		   if(bobBalance>=amount) {
		    			   bobBalance -=amount;
		    			   bobDebitCount++;
		    			   totalDebitCount++;
		    		   }
		    		   break;
		    	   case "Credit":
		    		   bobBalance +=amount;
		    		   bobCreditCount++;
		    		   totalCredtCount++;
		    		   break;
		    		default: 
		    			System.out.println("Invalid Operation");
		    	}
		    break;
		    default:
		    	System.out.println("Invalid band name");
		}
	}	
	void showTotalBalance() {
		System.out.println("Your total balance of all four accounts is: " +(bobBalance+hdfcBalance+sbiBalance+iciciBalance));
	}
	void showTotalCreditDebitOperations() {
		System.out.println("Your count of total Credit operations is " +totalCredtCount);
		System.out.println("Your count of total Debit operations is " +totalDebitCount);
	}
	void showIndividualBankCreditOperations() {
		System.out.println("ICICI Credit operations count: " +iciciCreditCount);
		System.out.println("SBI Credit operations count: " +sbiCreditCount);
		System.out.println("BOB Credit operations count: " +bobCreditCount);
		System.out.println("HDFC Credit operations count: " +hdfcCreditCount);
	}
	void showIndividualBankDebitOperations() {
		System.out.println("ICICI Debit operations count: " +iciciDebitCount);
		System.out.println("SBI Debit operations count: " +sbiDebitCount);
		System.out.println("BOB Debit operations count: " +bobDebitCount);
		System.out.println("HDFC Debit operations count: " +hdfcDebitCount);
	}
	String responseFromBank() {
		if(totalCredtCount>totalDebitCount) 
			return "I appreciate your money management skill";
		else
			return "Please spend money wisely";
	}
	public static void main(String[] args) {
		Banks banks = new Banks();
		Scanner scanner = new Scanner(System.in);
		String status = "";
		do {
			System.out.println("From which bank do you want to perform the action: ICICI/HDFC/SBI/BOB? ");
			String bankName = scanner.next();
			System.out.println("Please enter which operation do you want to perform: Debit/Credit? ");
			String operation = scanner.next();
			System.out.println("Please enter the amount: ");
			int amount = scanner.nextInt();
			banks.bankOperations(bankName,amount,operation);
			System.out.println("Would you like to continue: Y/N? ");
			status = scanner.next();
		}while(status.equals("Y"));
		banks.showTotalBalance();
        banks.showTotalCreditDebitOperations();
        banks.showIndividualBankCreditOperations();
        banks.showIndividualBankDebitOperations();
        System.out.println(banks.responseFromBank());
        scanner.close();
	}
}
