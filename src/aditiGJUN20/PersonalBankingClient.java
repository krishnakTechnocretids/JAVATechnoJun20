package aditiGJUN20;

public class PersonalBankingClient {

	public static void main(String[] args) {
		
		PersinalBankingService personalBankingService= new PersinalBankingService();
		
		// Set Opening Balance of Customer.
		personalBankingService.setOpeningBalance("Aditi", 20000, 10000, 5000, 4000);
		
		// Perform Transactions(Creadit/Debit)
		personalBankingService.bankTransaction("ICICI", "CREDIT", 3000);
		personalBankingService.bankTransaction("HDFC", "CREDIT", 3000);
		personalBankingService.bankTransaction("BOB", "CREDIT", 3000);
		personalBankingService.bankTransaction("SBI", "CREDIT", 3000);
		personalBankingService.bankTransaction("ICICI", "CREDIT", 3000);
		personalBankingService.bankTransaction("ICICI", "CREDIT", 3000);
		personalBankingService.bankTransaction("HDFC", "CREDIT", 3000);
		
		
		personalBankingService.bankTransaction("HDFC", "DEBIT", 3000);
		personalBankingService.bankTransaction("HDFC", "DEBIT", 3000);
		personalBankingService.bankTransaction("BOB", "DEBIT", 3000);
		personalBankingService.bankTransaction("ICICI", "CREDIT", 3000);
		
		
		personalBankingService.totalBalance(); // Total Balance of Account Holder
		personalBankingService.displayTotalTransaction(); // Count of total credits and debits
		personalBankingService.displayBankWiseCredits(); // Individual credit count of each bank
		personalBankingService.displayBankWiseDebits(); // Individual debit count of each bank
		personalBankingService.displayMoneyManagementMsg(); // Response from bank Based on credit score 
		
	}

}
