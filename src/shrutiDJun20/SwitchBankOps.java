/*
 *A person has total 4 accounts in ICICI, HDFC, BOB, SBI one in each.
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


 */
package shrutiDJun20;

public class SwitchBankOps {
	int ihdfc;
	int iicici;
	int ibob;
	int isbi;
	int icicidebitcnt;
	int icicicreditcnt;
	int hdfcdebitcnt;
	int hdfccreditcnt;
	int bobdebitcnt;
	int bobcreditcnt;
	int sbidebitcnt;
	int sbicreditcnt;
	static int totaldebitcnt;
	static int totalcreditcnt;
	

		void getbalance(int icici, int hdfc, int bob, int sbi){
			iicici=icici;
			ihdfc = hdfc;
			ibob=bob;
			isbi=sbi;
			
		}
		void totalBalance(){
			System.out.println("Total Balance is " +(iicici+ihdfc+ibob+isbi));
	
	}

	void bankOperation(String bankName, double amount, String operation){
		switch(bankName) {
			case "ICICI" :
				switch(operation) {
				case "debit":
						if(amount>0 && amount<=iicici ){
						System.out.println("Amount debited from ICICI is successful :" + amount);
						iicici-=amount;
						icicidebitcnt++;
						totaldebitcnt++;
						}else
							System.out.println("Insufficient balance in ICICI");
						break;
				case "credit":
						System.out.println("Amount credit to ICICI successful:" + amount);
						iicici+=amount;
						icicicreditcnt++;
						totalcreditcnt++;
						break;
			    	}
			       break;
			       
				case "HDFC":
				switch(operation){
				case "debit":
					if(amount>0 && amount<=ihdfc ){
					System.out.println("Amount debited from HDFC is successful :" + amount);
					ihdfc-=amount;
					hdfcdebitcnt++;
					totaldebitcnt++;
				}else
					System.out.println("Insufficient balance in HDFC");
					break;
				case "credit":
					System.out.println("Amount credited to HDFC is successful :" + amount);
					ihdfc+=amount;
					hdfccreditcnt++;
					totalcreditcnt++;
					break;
		    	}
		       break;
		       
			case "BOB":
				switch(operation){
				case "debit":
					if(amount>0 && amount<=ibob ){
					System.out.println("Amount debited from BOB is successful :" + amount);	
					ibob-=amount;
					bobdebitcnt++;
					totaldebitcnt++;
					}else
						System.out.println("Insufficient balance in BOB");
					break;
				case "credit":
					System.out.println("Amount credited to BOB is successful :" + amount);
					ibob+=amount;
					bobcreditcnt++;
					totalcreditcnt++;
					break;
		    	}
		      	
		
			case "SBI":
				switch(operation){
				case "debit":
				
					if(amount>0 && amount<=isbi ){
					System.out.println("Amount debited from SBI is successful :" + amount);	
					isbi-=amount;
					sbidebitcnt++;
					totaldebitcnt++;
					}else
					System.out.println("Insufficient balance in SBI");
					break;
				case "credit":
					System.out.println("Amount credited to SBI is successful :" + amount);
					isbi+=amount;
					sbicreditcnt++;
					totalcreditcnt++;
					break;
				}
				break;
				}
	}
	
	void debitOperation(){
		System.out.println("debit count of ICICI: " + icicidebitcnt);
		System.out.println("debit count of HDFC: " + hdfcdebitcnt);
		System.out.println("debit count of BOB: " + bobdebitcnt);
		System.out.println("debit count of SBI: " + sbidebitcnt);
	}
	
	void creditOperation(){
		System.out.println("credit count of ICICI: " + icicicreditcnt);
		System.out.println("credit count of HDFC: " + hdfccreditcnt);
		System.out.println("credit count of BOB: " + bobcreditcnt);
		System.out.println("credit count of SBI: " + sbicreditcnt);
	}
	
	void overallOperationofBank(){
		System.out.println("Total debit count: "+ totaldebitcnt);
		System.out.println("Total Credit count: "+ totalcreditcnt);
	}
	
	String messageForCustomer(){
		if(totalcreditcnt>totaldebitcnt)
			return "**I appreciate your money management skill**";
		else
			return "**Please spend money wisely**";
	}
	
	public static void main(String[] args) {
		SwitchBankOps switchBankOps = new SwitchBankOps();
		switchBankOps.getbalance(50000, 60000, 70000, 80000);
		switchBankOps.totalBalance();
		System.out.println();
		switchBankOps.bankOperation("ICICI", 10000, "debit");
		switchBankOps.bankOperation("ICICI", 5000, "debit");
		switchBankOps.bankOperation("ICICI", 15000, "credit");
		switchBankOps.bankOperation("HDFC", 5000, "debit");
		switchBankOps.bankOperation("HDFC", 5000, "credit");
		switchBankOps.bankOperation("SBI", 20000, "credit");
		switchBankOps.bankOperation("SBI", 10000, "credit");
		switchBankOps.bankOperation("BOB", 15000, "credit");
		
		System.out.println();
		switchBankOps.overallOperationofBank();
		System.out.println();
		switchBankOps.creditOperation();
		System.out.println();
		switchBankOps.debitOperation();
		System.out.println(switchBankOps.messageForCustomer());
		
	}
	
}
