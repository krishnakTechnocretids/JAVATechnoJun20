/*A person has total 4 accounts in ICICI, HDFC, BOB, SBI one in each.
a) Person can debit or credit amount from respective bank.
Hint : Switch case is expected here. [Please watch today's recording again, in case of confusion.]

b) A Method to show total balance [ICICI balance + HDFC balance + BOB balance + SBI Balance]

c) A Method to show total credit, debit operations
output : Total credit operation - 7 times
Total debit operation - 5 times

d) A Method to show individual bank credit operations.
output : ICICI bank Credit Operation - 2
HDFC bank Credit Operation - 2
SBI bank Credit Operation - 1
BOB bank Credit Operation - 4

e) A Method to show individual bank debit operations.
output : ICICI bank Debit Operation - 2
HDFC bank Debit Operation - 2
SBI bank Debit Operation - 1
BOB bank Debit Operation - 4

f) A Method which should return "*I appreciate your money management skill*" message if credit operation count is more than debit operation count else return "*Please spend money wisely*" and print this message in main method.
*/

package nikhilMJun20;

public class PersonalBanking {
	String custName;
	double iciciBalance, hdfcBalance, bobBalance, sbiBalance;
	int iciciCreditOpsCnt, hdfcCreditOpsCnt, bobCreditOpsCnt, sbiCreditOpsCnt, iciciDebitOpsCnt, hdfcDebitOpsCnt, bobDebitOpsCnt, sbiDebitOpsCnt, totalCreditOpsCnt, totalDebitOpsCnt;
			
	void bankingOp(String bank, String op, double amount) {
		switch(bank) {
			//Outer Case # 1
			case "ICICI" :{
				switch(op) {
					case "Credit" :
						if(amount > 0) {
							iciciBalance += amount;
							iciciCreditOpsCnt++;
							totalCreditOpsCnt++;
						}else {
							System.out.println("Invalid Amount Entered!");
						}
						break;
					
					case "Debit" :
						if(amount <= iciciBalance && amount > 0) {
							iciciBalance -= amount;
							iciciDebitOpsCnt++;
							totalDebitOpsCnt++;
						}else {
							System.out.println("Amount to be Withdrawn Excceds Balance Available OR Invalid Amount Entered!");
						}
						break;
						
					default :
						System.out.println("Invalid Operation!");
				}
			}
			break;
			
			//Outer Case # 2
			case "HDFC" :{
				switch(op) {
					case "Credit" :
						if(amount > 0) {
							hdfcBalance += amount;
							hdfcCreditOpsCnt++;
							totalCreditOpsCnt++;
						}else {
							System.out.println("Invalid Amount Entered!");
						}
						break;
					
					case "Debit" :
						if(amount <= hdfcBalance && amount > 0) {
							hdfcBalance -= amount;
							hdfcDebitOpsCnt++;
							totalDebitOpsCnt++;
						}else {
							System.out.println("Amount to be Withdrawn Excceds Balance Available OR Invalid Amount Entered!");
						}
						break;
						
					default :
						System.out.println("Invalid Operation!");
				}
			} 
			break;
			
			//Outer Case # 3
			case "BOB" :{
				switch(op) {
					case "Credit" :
						if(amount > 0) {
							bobBalance += amount;
							bobCreditOpsCnt++;
							totalCreditOpsCnt++;
						}else {
							System.out.println("Invalid Amount Entered!");
						}
						break;
					
					case "Debit" :
						if(amount <= bobBalance && amount > 0) {
							bobBalance -= amount;
							bobDebitOpsCnt++;
							totalDebitOpsCnt++;
						}else {
							System.out.println("Amount to be Withdrawn Excceds Balance Available OR Invalid Amount Entered!");
						}
						break;
						
					default :
						System.out.println("Invalid Operation!");
				}
			} 
			break;
			
			//Outer Case # 4
			case "SBI" :{
				switch(op) {
					case "Credit" :
						if(amount > 0) {
							sbiBalance += amount;
							sbiCreditOpsCnt++;
							totalCreditOpsCnt++;
						}else {
							System.out.println("Invalid Amount Entered!");
						}
						break;
					
					case "Debit" :
						if(amount <= sbiBalance && amount > 0) {
							sbiBalance -= amount;
							sbiDebitOpsCnt++;
							totalDebitOpsCnt++;
						}else {
							System.out.println("Amount to be Withdrawn Excceds Balance Available OR Invalid Amount Entered!");
						}
						break;
						
					default :
						System.out.println("Invalid Operation!");
				}
			}
			break;
			
			//Outer default
			default :
				System.out.println("Invalid Bank Name Entered!");
		}
	}
	
	void calculateTotalBalance() {
		System.out.println("\nHello "+custName+"! Your Combined Bank Balance (across ICICI, HDFC, BOB and SBI): "+(iciciBalance + hdfcBalance + bobBalance + sbiBalance));
	}
	
	void displayTotalBankingOps() {
		System.out.println("\nTotal No. of Banking Operations Performed (across ICICI, HDFC, BOB and SBI):- \nTotal Credit Operations: "+totalCreditOpsCnt+"\nTotal Debit Operations: "+totalDebitOpsCnt);
	}
	
	void displayBankWiseCreditOps() {
		System.out.println("\nBank-wise Credit Operations Performed:-\nICICI Bank : "+iciciCreditOpsCnt+"\nHDFC Bank : "+hdfcCreditOpsCnt+"\nBank of Baroda : "+bobCreditOpsCnt+"\nState Bank of India : "+sbiCreditOpsCnt);
	}
	
	void displayBankWiseDebitOps() {
		System.out.println("\nBank-wise Debit Operations Performed:-\nICICI Bank : "+iciciDebitOpsCnt+"\nHDFC Bank : "+hdfcDebitOpsCnt+"\nBank of Baroda : "+bobDebitOpsCnt+"\nState Bank of India : "+sbiDebitOpsCnt);
	}
	
	String calulateFinancialHealth() {
		if(totalCreditOpsCnt > totalDebitOpsCnt) {
			return "*We Appreciate Your Money Management Skills!*";
		}else {
			return "*Please Spend Money Wisely.*";
		}
	}
	
	public static void main(String[] args) {
		PersonalBanking personalBanking = new PersonalBanking();
		personalBanking.custName = "Ritchie Rich";
		
		//Credit ops
		personalBanking.bankingOp("ICICI", "Credit", 2500.00);
		personalBanking.bankingOp("ICICI", "Credit", 2500.00);
		personalBanking.bankingOp("HDFC", "Credit", 2500.00);
		personalBanking.bankingOp("HDFC", "Credit", 2500.00);
		personalBanking.bankingOp("BOB", "Credit", 2500.00);
		personalBanking.bankingOp("BOB", "Credit", 2500.00);
		personalBanking.bankingOp("BOB", "Credit", 2500.00);
		personalBanking.bankingOp("SBI", "Credit", 2500.00);
		personalBanking.bankingOp("SBI", "Credit", 2500.00);
		
		//Debit ops
		personalBanking.bankingOp("ICICI", "Debit", 2500.00);
		personalBanking.bankingOp("ICICI", "Debit", 2500.00);
		personalBanking.bankingOp("HDFC", "Debit", 2500.00);
		personalBanking.bankingOp("BOB", "Debit", 2500.00);
		personalBanking.bankingOp("SBI", "Debit", 2500.00);
		
		personalBanking.calculateTotalBalance();
		
		personalBanking.displayTotalBankingOps();
		
		personalBanking.displayBankWiseCreditOps();
		
		personalBanking.displayBankWiseDebitOps();
		
		System.out.println("\n"+personalBanking.custName+"! "+personalBanking.calulateFinancialHealth());		
	}
}
