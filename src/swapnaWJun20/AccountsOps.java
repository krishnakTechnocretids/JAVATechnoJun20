package swapnaWJun20;

public class AccountsOps {

	static double actualBalance;
	int debitCountHDFC, creditCountHDFC, debitCountSBI, creditCountSBI, debitCountBOB, creditCountBOB, debitCountICICI, creditCountICICI;
	static int allDebit, allCredit;

	void bankOperation(String bankName, double amount, String operation){

		switch(bankName) {

		case "ICICI" :
			switch(operation) {
			case "Debit":
				actualBalance = actualBalance - amount;
				debitCountICICI++;
				allDebit++;
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
				actualBalance = actualBalance - amount; 
				debitCountHDFC++;
				allDebit++;
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
				actualBalance = actualBalance - amount; 
				debitCountSBI++;
				allDebit++;
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
		AccountsOps accounts1 = new AccountsOps();

		accounts1.bankOperation("ICICI", 5000 , "Credit");
		accounts1.bankOperation("ICICI", 4000 , "Credit");
		accounts1.bankOperation("HDFC", 3000 , "Credit");	
		accounts1.bankOperation("BOB", 9000 , "Credit");
		accounts1.bankOperation("BOB", 100 , "Credit");
		accounts1.bankOperation("SBI", 3000 , "Credit");
		accounts1.bankOperation("SBI", 8000 , "Credit");

		accounts1.bankOperation("BOB", 5000 , "Debit");
		accounts1.bankOperation("BOB", 2500 , "Debit");
		accounts1.bankOperation("ICICI", 400 , "Debit");
		accounts1.bankOperation("HDFC", 700 , "Debit");	
		accounts1.bankOperation("SBI", 1000 , "Debit");
		accounts1.bankOperation("SBI", 100 , "Debit");

		accounts1.showBalance();
		accounts1.showAllCreditDebit();
		accounts1.showCredit();
		accounts1.showDebit();

		displayMsg();

		if (displayMsg()==true)
			System.out.println("\nI appreciate your money management skill");
		else
			System.out.println("\nPlease spend money wisely");
	}
}
