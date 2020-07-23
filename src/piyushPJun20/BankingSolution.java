
public class BankingSolution {
	static double iciciBal, hdfcBal, bobBal, sbiBal;
	static int totalCreditCnt, totalDebitCnt;
	static int iciciCrCount, iciciDbCount, hdfcCrCount, hdfcDbCount, bobCrCount, bobDbCount, sbiCrCount, sbiDbCount;
	
	
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
		BankingSolution bank = new BankingSolution();
		bank.bankOperation("ICICI", 10000, "Credit");
		bank.bankOperation("ICICI", 5000, "Credit");
		bank.bankOperation("HDFC", 8000, "Credit");
		bank.bankOperation("HDFC", 3000, "Credit");
		bank.bankOperation("BOB", 6000, "Credit");
		bank.bankOperation("SBI", 7000, "Credit");
		bank.bankOperation("SBI", 9000, "Credit");
		bank.bankOperation("ICICI", 8000, "Debit");
		bank.bankOperation("HDFC", 4000, "Debit");
		bank.bankOperation("HDFC", 3000, "Debit");
		bank.bankOperation("BOB", 2000, "Debit");
		bank.bankOperation("SBI", 4000, "Debit");
		System.out.println("");
		bank.totalCreditandDebit();
		System.out.println("");
		bank.individualCredit();
		System.out.println("");
		bank.individualDebit();
		System.out.println("");
		System.out.println(bank.message());
		

	}

}
