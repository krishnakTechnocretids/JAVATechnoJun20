package aavrutiDJun20;


public class BankingOperations {
	
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
							System.out.println("Insufficient Bank Balance in ICICI");
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
							System.out.println("Insufficient Bank Balance in HDFC");
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
							System.out.println("Insufficient Bank Balance in BOB");
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
							System.out.println("Insufficient Bank Balance in SBI");
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
		System.out.println("ICICI Bank Balance : " + iciciBankBal );
		System.out.println("HDFC  Bank Balance : " + hdfcBankBal );
		System.out.println("BOB   Bank Balance : " + bobBankBal );
		System.out.println("SBI   Bank Balance : " + sbiBankBal );
	}
	
	//Print debit and credit operation by combining of all the bank
	void printAllBankOperation() {
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		System.out.println("Total Credit Operation  : " + allBankCreditCnt);
		System.out.println("Total Debit Operation   : " + allBankDebitCnt);
	}
	
	//print Credit operations count of all the bank
	void bankCreditOperations() {
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		System.out.println("ICICI Bank Credit Operation : " + creditICICICnt);
		System.out.println("HDFC Bank Credit Operation  : " + creditHDFCCnt);
		System.out.println("BOB Bank Credit Operation   : " + creditBOBCnt);
		System.out.println("SBI Bank Credit Operation   : " + creditSBICnt);
	}
	
	//print debit operations count of all the bank
	void bankDebitOperations() {
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		System.out.println("ICICI Bank Debit Operation : " + debitICICICnt);
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
		BankingOperations bankingOperations = new BankingOperations();
		
		//Add balance in all the bank
		bankingOperations.bankTransactions("ICICI",100000,"Credit");
		bankingOperations.bankTransactions("HDFC",306000,"Credit");
		bankingOperations.bankTransactions("BOB",400100,"Credit");
		bankingOperations.bankTransactions("SBI",105600,"Credit");
		
		//print Bank balance
		System.out.println("Bank Balance after adding Balance: \n");
		bankingOperations.printBankBalance();
		
		//Debit balance from all the bank
		bankingOperations.bankTransactions("ICICI",50000,"Debit");
		bankingOperations.bankTransactions("HDFC",6000,"Debit");
		bankingOperations.bankTransactions("BOB",1100,"Debit");
		bankingOperations.bankTransactions("SBI",5600,"Debit");
		
		//Perform bank transactions
		bankingOperations.bankTransactions("ICICI",1000,"credit");
		bankingOperations.bankTransactions("HDFC",500,"Credit");
		bankingOperations.bankTransactions("BOB",600,"credit");
		bankingOperations.bankTransactions("ICICI",300,"Debit");
		bankingOperations.bankTransactions("HDFC",8000,"Debit");
		bankingOperations.bankTransactions("BOB",1500,"Debit");
		bankingOperations.bankTransactions("ICICI",1000,"Debit");
		bankingOperations.bankTransactions("HDFC",600,"debit");
		bankingOperations.bankTransactions("HDFC",600,"Debit");
		bankingOperations.bankTransactions("SBI",5600,"debit");
		bankingOperations.bankTransactions("SBI",4000,"Debit");
		bankingOperations.bankTransactions("SBI",500,"Debit");
		bankingOperations.bankTransactions("SBI",600,"Debit");
				
		//print Bank balance
		System.out.println("\nBank Balance after performing transactions: \n");
		bankingOperations.printBankBalance();
		
		//Print comment on all over bank transactions
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		System.out.println(bankingOperations.suggestionMsg());
		
		//print Credit Operation count
		bankingOperations.bankCreditOperations();
		
		//print Debit Operations count
		bankingOperations.bankDebitOperations();
		
		//print all bank debit and credit Operations count
		bankingOperations.printAllBankOperation();		
	}	
}