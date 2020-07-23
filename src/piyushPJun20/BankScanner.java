package piyushPJun20;
import java.util.Scanner;


public class BankScanner {
	 double iciciBal, hdfcBal, bobBal, sbiBal;
	static int totalCreditCnt, totalDebitCnt;
	 int iciciCrCount, iciciDbCount, hdfcCrCount, hdfcDbCount, bobCrCount, bobDbCount, sbiCrCount, sbiDbCount;
	
	
	void bankOperation(String bankName, double amount, String operation) {
		switch(bankName) {
		case "ICICI" :
		switch(operation) {
		case "Debit":
			if(iciciBal >= amount){
				iciciBal -=amount;
				iciciDbCount++;
				totalDebitCnt++;
			}else {
				System.out.println(" Insuffiecient Balance ");
		    }
		break;
		case "Credit":
			iciciBal +=amount;
			iciciCrCount++;
			totalCreditCnt++;
		break;
		}
	  break;
	  
		case "HDFC" :
			switch(operation) {
			case "Debit":
				if(hdfcBal >= amount){
					hdfcBal -=amount;
					hdfcDbCount++;
					totalDebitCnt++;
				}else {
					System.out.println(" Insuffiecient Balance ");
			    }
			break;
			case "Credit":
				hdfcBal +=amount;
				hdfcCrCount++;
				totalCreditCnt++;
			break;
			}
		  break;
		  
		case "BOB" :
			switch(operation) {
			case "Debit":
				if(bobBal >= amount){
					bobBal -=amount;
					bobDbCount++;
					totalDebitCnt++;
				}else {
					System.out.println(" Insuffiecient Balance ");
			    }
			break;
			case "Credit":
				bobBal +=amount;
				bobCrCount++;
				totalCreditCnt++;
			break;
			}
		  break;
		  
		case "SBI" :
			switch(operation) {
			case "Debit":
				if(sbiBal >= amount){
					sbiBal -=amount;
					sbiDbCount++;
					totalDebitCnt++;
				}else {
					System.out.println(" Insuffiecient Balance ");
			    }
			break;
			case "Credit":
				sbiBal +=amount;
				sbiCrCount++;
				totalCreditCnt++;
			break;
			}
		  break;
		}
	}

	double totalBalance() {
		double totalbalance = iciciBal + hdfcBal + bobBal + sbiBal;
		return totalbalance;
		
	}
	
	void totalCreditandDebit() {
		System.out.println(" Total Credit Operation is: " + totalCreditCnt + " times ");
		System.out.println(" Total Debit Operation is: " + totalDebitCnt + " times ");
	}
	
	void individualCredit() {
		System.out.println(" ICICI Bank Credit Operation is: " + iciciCrCount);
		System.out.println(" HDFC Bank Credit Operation is: " + hdfcCrCount);
		System.out.println(" BOB Credit Operation is: " + bobCrCount);
		System.out.println(" SBI Credit Operation is: " + sbiCrCount);
	}
	
	void individualDebit() {
		System.out.println(" ICICI Bank Debit Operation is " + iciciDbCount);
		System.out.println(" HDFC Bank Debit Operation is " + hdfcDbCount);
		System.out.println(" BOB Debit Operation is " + bobDbCount);
		System.out.println(" SBI Debit Operation is " + sbiDbCount);
	}
	
	String message() {
		if ( totalCreditCnt > totalDebitCnt)
			return " I appreciate your money management skills. ";
		else
			return " Please spend money wisely. ";
			
	}
	
	public static void main(String[] args) {
		BankScanner bankScanner = new BankScanner();
		Scanner scanner = new Scanner(System.in);
		
		String status = "";
		do {
			System.out.println("Enter the Bank name for trasaction (ICICI/HDFC/BOB/SBI): ");
			String bankName= scanner.next();
			
			System.out.println("Enter amount : ");
			int amount= scanner.nextInt();
			
			System.out.println("What would you like to do - Credit/Debit ? : ");
			String operation= scanner.next();
			
			bankScanner.bankOperation(bankName,amount,operation);
			
			System.out.println("Would you like to make another trasaction ? (y/n)");
			status = scanner.next();
			System.out.println();
		}while (status.equals("y"));
		System.out.println("Summary of yor trasactions : ");
		
		
		System.out.println("");
		bankScanner.totalCreditandDebit();
		System.out.println("");
		bankScanner.individualCredit();
		System.out.println("");
		bankScanner.individualDebit();
		System.out.println("");
		System.out.println(bankScanner.message());
		
		scanner.close();
		

	}

}
