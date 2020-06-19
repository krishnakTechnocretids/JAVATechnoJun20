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

         f) A Method which should return "*I appreciate your money management skill*" message 
         if credit operation count is more than debit operation count 
         else return "*Please spend money wisely*" and print this message in main method.
 */
package pranitaPJun20;

public class BankOperationSwitchCase {
	static int staticDebitCount,staticCreditCount;
	int iciciDebitCount,iciciCreditCount;
	int hdfcDebitCount,hdfcCreditCount;
	int bobDebitCount,bobCreditCount;
	int sbiDebitCount,sbiCreditCount;
	double balanceIcici,balanceSbi,balanceHdfc,balanceBob;
	
	double bankOperation(String bankName, double amount, String operation){
		switch(bankName) {
			case "ICICI" :
				switch(operation) {
					case "Credit":
						iciciCreditCount++;
						staticCreditCount=staticCreditCount+1;
						balanceIcici= balanceIcici+amount;
						//return balanceIcici;
						break;
						
						case "Debit":
						if(amount>balanceIcici) 
							System.out.println("Account has insufficient balance");	
						else if(amount<=balanceIcici) {
							iciciDebitCount++;
							staticDebitCount++;
							balanceIcici-=amount;
							//return balanceIcici;
						}
						else 
							System.out.println("Invalid Transaction");
						break;	
						
					case "IndividualCreditCount" :
						System.out.println("Individual Debit Operation count is :" +iciciCreditCount);
						break;
						
					case "IndividualDebitCount" :
						System.out.println("Individual Credit Operation count is :" +iciciDebitCount);
						break;
						
					case "TotalCreditDebitCount" :
						System.out.println("Overall Debit Operations count is :" +staticDebitCount);
						System.out.println("Overall Credit Operations count is :" +staticCreditCount);
						break;	
						
						
					default :
						System.out.println("Invalid Operation");
						
				}
				break;
				
		case "HDFC" :
				switch(operation) {	
					case "Credit":
						hdfcCreditCount++;
						staticCreditCount=staticCreditCount+1;
						balanceHdfc= balanceHdfc+amount;
						break;
						
					case "Debit":
						if(amount>balanceHdfc) 
							System.out.println("Account has insufficient balance");	
						else if(amount<=balanceHdfc) {
							hdfcDebitCount++;
							staticDebitCount++;
							//balanceIcici=balanceIcici-amount;
							balanceHdfc-=amount;
						}
						else 
							System.out.println("Invalid Transaction");
						break;	
						
					case "IndividualCreditCount" :
						System.out.println("Individual Debit Operation count is :" +hdfcCreditCount);
						break;
						
					case "IndividualDebitCount" :
						System.out.println("Individual Credit Operation count is :" +hdfcDebitCount);
						break;
						
					case "TotalCreditDebitCount" :
						System.out.println("Overall Debit Operations count is :" +staticDebitCount);
						System.out.println("Overall Credit Operations count is :" +staticCreditCount);
						break;
						
					default :
						System.out.println("Invalid Operation");
					}
				break;
					
		case "BOB" :
			switch(operation) {  
				case "Credit":
					bobCreditCount++;
					staticCreditCount=staticCreditCount+1;
					balanceBob= balanceBob+amount;
					break;
					
				case "Debit":
					if(amount>balanceBob) 
						System.out.println("Account has insufficient balance");	
					else if(amount<=balanceBob) {
						bobDebitCount++;
						staticDebitCount++;
						balanceBob-=amount;
					}
					else 
						System.out.println("Invalid Transaction");
					break;	
					
				case "IndividualCreditCount" :
					System.out.println("Individual Debit Operation count is :" +bobCreditCount);
					break;
					
				case "IndividualDebitCount" :
					System.out.println("Individual Credit Operation count is :" +bobDebitCount);
					break;
					
				case "TotalCreditDebitCount" :
					System.out.println("Overall Debit Operations count is :" +staticDebitCount);
					System.out.println("Overall Credit Operations count is :" +staticCreditCount);
					break;
					
				default :
					System.out.println("Invalid Operation");
			
				}
			break;
		    	
	case "SBI" :
		switch(operation) {   
			case "Credit":
				sbiCreditCount++;
				staticCreditCount=staticCreditCount+1;
				balanceSbi= balanceSbi+amount;
				break;
				
			case "Debit":
				if(amount>balanceSbi) 
					System.out.println("Account has insufficient balance");	
				else if(amount<=balanceSbi) {
					sbiDebitCount++;
					staticDebitCount++;
					balanceSbi-=amount;
				}
				else 
					System.out.println("Invalid Transaction");
				break;	
				
			case "IndividualCreditCount" :
				System.out.println("Individual Debit Operation count is :" +sbiCreditCount);
				break;
				
			case "IndividualDebitCount" :
				System.out.println("Individual Credit Operation count is :" +sbiDebitCount);
				break;
				
			case "TotalCreditDebitCount" :
				System.out.println("Overall Debit Operations count is :" +staticDebitCount);
				System.out.println("Overall Credit Operations count is :" +staticCreditCount);
				break;
				
			default :
				System.out.println("Invalid Operation");
			}
		break;
		
		default:
			System.out.println("Invalid operation");
		}
		return (balanceIcici+balanceSbi+balanceHdfc+balanceBob);
	}
	
	String bankresponse() {
		if(staticCreditCount>staticDebitCount)
			return "*I appreciate your money management skill*";
		else
			return "*Please spend money wisely*";
	}
	/*void totalBalance() {
		double sum= balanceIcici+balanceSbi+balanceHdfc+balanceBob ;
		System.out.println("Combined bank balance is:"+sum);
	}*/
	
	public static void main(String[] args) {
		BankOperationSwitchCase bankOperationSwitchCase = new BankOperationSwitchCase();
		System.out.println("ICICI bank Transaction Summary:");
		bankOperationSwitchCase.bankOperation("ICICI",5000,"Credit");
		bankOperationSwitchCase.bankOperation("ICICI",6000,"Credit");
		bankOperationSwitchCase.bankOperation("ICICI",2000,"Debit");
		bankOperationSwitchCase.bankOperation("ICICI",1000,"Debit");
		bankOperationSwitchCase.bankOperation("ICICI",0,"IndividualCreditCount");
		bankOperationSwitchCase.bankOperation("ICICI",0,"IndividualDebitCount");
		System.out.print("\n");
		System.out.println("HDFC bank Transaction Summary:");
		bankOperationSwitchCase.bankOperation("HDFC",5000,"Credit");
		bankOperationSwitchCase.bankOperation("HDFC",5000,"Credit");
		bankOperationSwitchCase.bankOperation("HDFC",1000,"Debit");
		bankOperationSwitchCase.bankOperation("HDFC",1000,"Debit");
		bankOperationSwitchCase.bankOperation("HDFC",0,"IndividualCreditCount");
		bankOperationSwitchCase.bankOperation("HDFC",0,"IndividualDebitCount");
		System.out.print("\n");
		System.out.println("BOB bank Transaction Summary:");
		bankOperationSwitchCase.bankOperation("BOB",5000,"Credit");
		bankOperationSwitchCase.bankOperation("BOB",5000,"Credit");
		bankOperationSwitchCase.bankOperation("BOB",5000,"Credit");
		bankOperationSwitchCase.bankOperation("BOB",5000,"Credit");
		bankOperationSwitchCase.bankOperation("BOB",1000,"Debit");
		bankOperationSwitchCase.bankOperation("BOB",1000,"Debit");
		bankOperationSwitchCase.bankOperation("BOB",1000,"Debit");
		bankOperationSwitchCase.bankOperation("BOB",1000,"Debit");
		bankOperationSwitchCase.bankOperation("BOB",0,"IndividualCreditCount");
		bankOperationSwitchCase.bankOperation("BOB",0,"IndividualDebitCount");
		System.out.print("\n");
		System.out.println("SBI bank Transaction Summary:");
		bankOperationSwitchCase.bankOperation("SBI",5000,"Credit");
		bankOperationSwitchCase.bankOperation("SBI",1000,"Debit");
		bankOperationSwitchCase.bankOperation("SBI",0,"IndividualCreditCount");
		double sum= bankOperationSwitchCase.bankOperation("SBI",0,"IndividualDebitCount");
		System.out.print("\n");
		System.out.println("Total credit and debit operations are :");
		bankOperationSwitchCase.bankOperation("SBI",0,"TotalCreditDebitCount");
		System.out.print("\n");
		System.out.println("Total balance is :"+sum);
		//bankOperationSwitchCase.totalBalance();
		System.out.println(bankOperationSwitchCase.bankresponse());	
	}
}
