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

         f) A Method which should return "*I appreciate your money management skill*" message if credit operation count is more than debit operation count else return "*Please spend money wisely*" and print this message in main method.*/



package anshuKJun20;

public class SwitchLoop {
	 static int countICICIcredit,countICICIdebit,counthdfccredit,counthdfcdebit,countsbicredit,countsbidebit,countbobcredit,countbobdebit ,totalcreditoperation,totaldebitoperation;
	  static int hdfcbankbalance,icicibankbalance,sbibankbalance,bobbankbalance;
	 
	static void bankInitialBalance(String bankname,int balance){
		 switch(bankname) {
		    case "HDFC":
		    	hdfcbankbalance += balance;
		    	break;
		    case "ICICI":
		    	icicibankbalance +=balance;
		    	break;
		    case "SBI":
		    	sbibankbalance += balance;
		    	break;
		    case "BOB":
		    	bobbankbalance += balance;
		    	break;
		    default:
		    	break;
		 }
	 }
	  
	
	static void bankOperation(String bankname, int amount, String Operation) {
		switch(bankname){
			case "HDFC":
				switch(Operation) {
				case "credit":
					hdfcbankbalance += amount;
					counthdfccredit++;
					totalcreditoperation++;
					
					break;
				case "Debit":
					if(hdfcbankbalance>amount) {
						hdfcbankbalance -= amount;
						counthdfcdebit++;
						totaldebitoperation++;
					}
					else {
						System.out.println("Insufficient Balance in your HDFC account");
						}break;
					}break;
					
			case"ICICI":
				switch(Operation) {
				case "credit":
					icicibankbalance += amount;
					countICICIcredit++;
					totalcreditoperation++;
					
					break;
				case "Debit":
					if(icicibankbalance>amount) {
						icicibankbalance-=amount;
						countICICIdebit++;
						totaldebitoperation++;
					}
					else {
						System.out.println("Insufficient Balance in your ICICI account");
						}break;
					}break;
			case"SBI":
				switch(Operation) {
				case "credit":
					sbibankbalance += amount;
					countsbicredit++;
					totalcreditoperation++;
					
					break;
				case "Debit":
					if(sbibankbalance>amount) {
						sbibankbalance-=amount;
						countsbidebit++;
						totaldebitoperation++;
					}
					else {
						System.out.println("Insufficient Balance in your SBI Account");
						}break;
					}break;
			case"BOB":
				switch(Operation) {
				case "credit":
					bobbankbalance += amount;
					countbobcredit++;
					totalcreditoperation++;
					
					break;
				case "Debit":
					if(bobbankbalance>amount) {
						bobbankbalance-=amount;
						countbobdebit++;
						totaldebitoperation++;
					}
					else {
						System.out.println("Insufficient Balance in Your BOB account");
						}break;
					}
				default:
					break;
				}//switch bracket
			}//bankOperation
	 static void totalBankBalance() {
		int totalBalane =  hdfcbankbalance+icicibankbalance+sbibankbalance+bobbankbalance;
		System.out.println("Total Balance "+totalBalane);
	}
	static void totalCreditDebitOperation() {
		 System.out.println("Total Credit Operation "+totalcreditoperation+ " and Total Debit Operation "+totaldebitoperation);
	 }
	 static void idividualCreditOperation() {
		 System.out.println("HDFC Credit"+counthdfccredit);
		 System.out.println("ICICI Credit"+countICICIcredit);
		 System.out.println("SBI Credit"+countsbicredit);
		 System.out.println("BOB Credit"+countbobcredit);
	 }
	static void idividualDebitOperation() {
		 System.out.println(" HDFC Debit "+counthdfcdebit);
		 System.out.println("ICICI Debit "+countICICIdebit);
		 System.out.println("SBI Debit "+counthdfcdebit);
		 System.out.println("BOB Debit "+counthdfcdebit);
	 }
	static boolean returnMethod() {
		 if(totalcreditoperation > totaldebitoperation) {
			 return true;
		 }else 
	     return false;
		}
	 public static void main(String[] args) {
		 SwitchLoop.bankInitialBalance("HDFC", 10000);
		 SwitchLoop.bankOperation("HDFC",800,"credit");
		 SwitchLoop.bankOperation("HDFC",1000,"credit");
		 SwitchLoop.bankOperation("HDFC",800,"Debit");
		 SwitchLoop.bankOperation("HDFC",1400,"credit");
		 SwitchLoop.bankOperation("HDFC",1400,"Debit");
		 SwitchLoop.bankOperation("HDFC",1400,"Debit");
		 
		 SwitchLoop.bankInitialBalance("SBI", 2000);
		 SwitchLoop.bankOperation("SBI",200,"Debit");
		 SwitchLoop.bankOperation("SBI",200,"credit");
		 SwitchLoop.bankOperation("SBI",700,"credit");
		 SwitchLoop.bankOperation("SBI",800,"Debit");
		 SwitchLoop.bankOperation("SBI",1800,"credit");
		 SwitchLoop.bankOperation("SBI",200,"credit");
		 
		 SwitchLoop.bankInitialBalance("BOB", 3000);
		 SwitchLoop.bankOperation("BOB",1800,"Debit");
		 SwitchLoop.bankOperation("BOB",1200,"credit");
		 SwitchLoop.bankOperation("BOB",700,"Debit");
		 SwitchLoop.bankOperation("BOB",700,"credit");
		 SwitchLoop.bankOperation("BOB",900,"credit");
		 SwitchLoop.bankOperation("BOB",10000,"Debit");
		 SwitchLoop.bankOperation("BOB",2800,"credit");
		 
		 SwitchLoop.bankInitialBalance("ICICI", 10000);
		 SwitchLoop.bankOperation("ICICI",1800,"Debit");
		 SwitchLoop.bankOperation("ICICI",1200,"credit");
		 SwitchLoop.bankOperation("ICICI",700,"Debit");
		 SwitchLoop.bankOperation("ICICI",800,"Debit");
		 SwitchLoop.bankOperation("ICICI",1800,"credit");
		 SwitchLoop.bankOperation("ICICI",1200,"credit");
		 
		 SwitchLoop.totalBankBalance();
		 SwitchLoop.idividualCreditOperation();
		 SwitchLoop.idividualDebitOperation();
		 SwitchLoop.totalCreditDebitOperation();
		 
		 if(SwitchLoop.returnMethod()==true) 
			 System.out.println("I appreciate your money management skill");
		 else 
			 System.out.println("Please spend money wisely");
		 
		 
	}
}

