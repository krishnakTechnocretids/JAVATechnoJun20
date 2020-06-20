package palakSJun20;

public class BankSwitchCase {
	
	int iciciCreditCount, iciciDebitCount , hdfcCreditCount, hdfcDebitCount, bobCreditCount, bobDebitCount, sbiCreditCount, sbiDebitCount;
	static int totalCreditCount, totalDebitCount;
	double icicBalance, hdfcBalance, bobBalance, sbiBalance;
	
	void bankOperation(String bankName, double amount, String operation){
		switch (bankName) {
			case "ICICI":
				switch (operation) {
					case "Credit":
						icicBalance = icicBalance + amount;
						iciciCreditCount++;
						totalCreditCount++;
						break;
					case "Debit":
						if (icicBalance < amount ) {
							System.out.println("You don't have sufficient balance to withdraw the amount from ICICI Bank");
						}
						else{
							icicBalance = icicBalance - amount;
							iciciDebitCount++;
							totalDebitCount++;
						}
						break;
					default:
						System.out.println("Invalid Operation Please Select Debit/Credit Operation for ICICI Bank ");
						break;
					}
				break;
			case "HDFC":
				switch (operation) {
					case "Credit":
						hdfcBalance = hdfcBalance + amount;
						hdfcCreditCount++;
						totalCreditCount++;
						break;
					case "Debit":
						if (hdfcBalance < amount ) {
							System.out.println("You don't have sufficient balance to withdraw the amount from HDFC Bank");
						}
						else{
							hdfcBalance = hdfcBalance - amount;
							hdfcDebitCount++;
							totalDebitCount++;
						}
						break;
					default:
						System.out.println("Invalid Operation Please Select Debit/Credit Operation for HDFC Bank ");
						break;
					}
				break;
			case "BOB":
				switch (operation) {
					case "Credit":
						bobBalance = bobBalance + amount;
						bobCreditCount++;
						totalCreditCount++;
					break;
					case "Debit":
						if (bobBalance < amount ) {
							System.out.println("You don't have sufficient balance to withdraw the amount from BOB Account ");
						}
						else{
							bobBalance = bobBalance - amount;
							bobDebitCount++;
							totalDebitCount++;
					}
					break;
				default:
					System.out.println("Invalid Operation Please Select Debit/Credit Operation for BOB Bank ");
					break;
				}
				break;
			case "SBI":
				switch (operation) {
					case "Credit":
						sbiBalance = sbiBalance + amount;
						sbiCreditCount++;
						totalCreditCount++;
						break;
					case "Debit":
						if (sbiBalance < amount) 
							System.out.println("You Don't have sufficient balance to withdraw the amount from SBI Bank");
						else{
							sbiBalance = sbiBalance - amount;
							sbiDebitCount++;
							totalDebitCount++;
						}
						break;
					default:
						System.out.println("Invalid Operation Please Select Debit/Credit Operation for SBI Bank ");
						break;
				}
				break;
		}
		
	}
	
	void TotalBalance(){
		System.out.println("Total balance of ICICI Bank Account - " + icicBalance);
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
		BankSwitchCase bankSwitchCase = new BankSwitchCase();
		bankSwitchCase.bankOperation("ICICI", 200, "Credit");
		bankSwitchCase.bankOperation("HDFC", 300, "Credit");
		bankSwitchCase.bankOperation("BOB", 700, "Credit");
		bankSwitchCase.bankOperation("SBI", 500, "Credit");
		bankSwitchCase.bankOperation("SBI", 200, "Debit");
		bankSwitchCase.bankOperation("ICICI",100, "Debit");
		bankSwitchCase.bankOperation("BOB", 500, "Debit");
		bankSwitchCase.bankOperation("BOB", 500, "Debit");
		bankSwitchCase.bankOperation("HDFC", 300, "Credit");
		bankSwitchCase.bankOperation("HDFC", 100, "Debit");
		bankSwitchCase.TotalBalance();
		bankSwitchCase.TotalOperation();
		bankSwitchCase.IndividualCreditOperation();
		bankSwitchCase.IndividaulDebitOperation();
		bankSwitchCase.Messaage();
		
	}
}
