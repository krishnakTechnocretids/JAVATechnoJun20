package anupSJun20;
/*Assignment 11 :  19th Jun 2020

A person has total 4 accounts in ICICI, HDFC, BOB, SBI one in each.
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

         f) A Method which should return "I appreciate your money management skill" message if credit operation count is more
          than debit operation count else return "Please spend money wisely" and print this message in main method.
*/
public class BankSwitchCase {
	static int iciciavailbal,hdfcavailbal,bobavailbal,sbiavailbal;
	static int icicicreditcnt,icicidebitcnt;
	static int hdfccreditcnt,hdfcdebitcnt;
	static int bobcreditcnt,bobdebitcnt;
	static int sbicreditcnt,sbidebitcnt;
	static int totalCreditcount, totalDebitcount;
	void setbalmethod(int icicibal1,int hdfcbal1,int bobval1,int sbival1) {
		iciciavailbal = icicibal1;
		hdfcavailbal = hdfcbal1;
		bobavailbal = bobval1;
		sbiavailbal = sbival1;
	}
	void bankOperations(String bankname, String operation, int amount) {
		switch(bankname){
			case "ICICI":
				switch(operation) {
				case "Credit":
					if (amount > 0) {
						iciciavailbal = iciciavailbal+amount;
						icicicreditcnt++;
						totalCreditcount++;
					}
					else {
						System.out.println("Please enter a correct amount");
					}
					break;
				case "Debit":
					if(amount>iciciavailbal) {
						System.out.println("You have insufficient fund");
					}
					else {
						iciciavailbal = iciciavailbal-amount;
						icicidebitcnt++;
						totalDebitcount++;
					}
					break;
				default:
					System.out.println("Invalid Operations");	
				}
				break;
			case "HDFC":
				switch(operation) {
				case "Credit":
					if (amount > 0) {
						hdfcavailbal = hdfcavailbal+amount;
						hdfccreditcnt++;
						totalCreditcount++;
					}
					else {
						System.out.println("Please enter a correct amount");
					}
					break;
				case "Debit":
					if(amount>hdfcavailbal) {
						System.out.println("You have insufficient fund");
					}
					else {
						hdfcavailbal = hdfcavailbal-amount;
						hdfcdebitcnt++;
						totalDebitcount++;
					}
					break;
				default:
					System.out.println("Invalid Operations");	
				}
				break;
			case "BOB":
				switch(operation) {
				case "Credit":
					if (amount > 0) {
						bobavailbal = bobavailbal+amount;
						bobcreditcnt++;
						totalCreditcount++;
					}
					else {
						System.out.println("Please enter a correct amount");
					}
					break;
				case "Debit":
					if(amount>bobavailbal) {
						System.out.println("You have insufficient fund");
					}
					else {
						bobavailbal = bobavailbal-amount;
						bobdebitcnt++;
						totalDebitcount++;
					}
					break;
				default:
					System.out.println("Invalid Operations");	
				}
				break;
			case "SBI":
				switch(operation) {
				case "Credit":
					if (amount > 0) {
						sbiavailbal = sbiavailbal+amount;
						sbicreditcnt++;
						totalCreditcount++;
					}
					else {
						System.out.println("Please enter a correct amount");
					}
					break;
				case "Debit":
					if(amount>sbiavailbal) {
						System.out.println("You have insufficient fund");
					}
					else {
						sbiavailbal = sbiavailbal-amount;
						sbidebitcnt++;
						totalDebitcount++;
					}
					break;
				default:
					System.out.println("Invalid Operations");	
				}
				break;
			default:
				System.out.println("Please enter correct bank name");
			
		}
	}
	
	int totalBalance(){
		return iciciavailbal+hdfcavailbal+bobavailbal+sbiavailbal;
	}
	void totaltransactionCount() {
		System.out.println("Total Credit Transaction : "+ totalCreditcount);
		System.out.println("Total Debit Transaction : "+totalDebitcount);	
	}
	void individualCreditOperation() {
		System.out.println("ICICI credit count : " + icicicreditcnt);
		System.out.println("HDFC credit count : " + hdfccreditcnt);
		System.out.println("BOB credit count : " + bobcreditcnt);
		System.out.println("SBI credit count : " + sbicreditcnt);
	}
	void individualDebitOperation() {
		System.out.println("ICICI debit count : " + icicidebitcnt);
		System.out.println("HDFC debit count : " + hdfcdebitcnt);
		System.out.println("BOB debit count : " + bobdebitcnt);
		System.out.println("SBI debit count : " + sbidebitcnt);
	}
	String moneyManagement() {
		if(totalCreditcount > totalDebitcount)
			return "I appreciate your money management skill";
		else if(totalDebitcount > totalCreditcount)
			return "Please spend money wisely";
		else
			return "You need to do well";
	}
	public static void main(String[] args) {
		BankSwitchCase bankSwitchCase = new BankSwitchCase();
		bankSwitchCase.setbalmethod(15000, 25000, 2000, 30000);
		bankSwitchCase.bankOperations("ICICI", "Credit", 2000);
		bankSwitchCase.bankOperations("HDFC", "Credit", 3000);
		bankSwitchCase.bankOperations("BOB", "Credit", 5000);
		bankSwitchCase.bankOperations("SBI", "Credit", 8000);
		bankSwitchCase.bankOperations("ICICI", "Debit", 1000);
		bankSwitchCase.bankOperations("HDFC", "Debit", 50000);
		bankSwitchCase.bankOperations("BOB", "Debit", 500);
		bankSwitchCase.bankOperations("SBI", "Debit", 800);
		bankSwitchCase.bankOperations("ICICI", "Credit", 3000);
		bankSwitchCase.bankOperations("SBI", "Credit", 5000);
		bankSwitchCase.bankOperations("ICICI", "Debit", 1000);
		bankSwitchCase.bankOperations("BOB", "Debit", 500);
		bankSwitchCase.bankOperations("SBI", "Debit", 800);
		bankSwitchCase.bankOperations("HDFC", "Debit", 5000);
		System.out.println("The Total balance of teh Customer is :" +bankSwitchCase.totalBalance());
		bankSwitchCase.totaltransactionCount();
		bankSwitchCase.individualCreditOperation();
		bankSwitchCase.individualDebitOperation();
		System.out.println(bankSwitchCase.moneyManagement());
	}

}
