package pranitaPJun20;

import java.util.Scanner;

public class BankingOperationScanner {
	static int staticDebitCount,staticCreditCount;
	double balanceIcici,balanceSbi,balanceHdfc,balanceBob;
	int iciciDebitCount,iciciCreditCount,hdfcDebitCount,hdfcCreditCount,bobDebitCount,bobCreditCount,sbiDebitCount,sbiCreditCount;
	
	void bankOperation(String bankName, double amount, String operation){
		switch(bankName) {
		//Case # 1
			case "ICICI" :{
				switch(operation) {
					case "Credit":
						iciciCreditCount++;
						staticCreditCount=staticCreditCount+1;
						balanceIcici= balanceIcici+amount;
						break;
						
					case "Debit":
						if(amount>balanceIcici) {
							System.out.println("Account has insufficient balance");	
						}
						else if(amount<=balanceIcici) {
							iciciDebitCount++;
							staticDebitCount++;
							balanceIcici-=amount;
						}
						else {
							System.out.println("Invalid Transaction");
						}
						break;
						
					default :
							System.out.println("Invalid Operation!");
				}
			}
			break;
				
	//Case # 2
			case "HDFC" :{
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
						
					default :
						System.out.println("Invalid Operation!");
			}
		}
			
		break;
			
	//Case # 3
			case "BOB" :{
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
						
					default :
						System.out.println("Invalid Operation!");
			}
		}
			
		break;
		
		//Case # 4
			case "SBI" :{
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
						
					default :
						System.out.println("Invalid Operation!");
			}
		}
			
		break;
		
		//default
	default :
		System.out.println("Invalid Bank Name Entered!");
		}
	}
		
	void displayTotalBalance() {
		double sum= balanceIcici+balanceSbi+balanceHdfc+balanceBob ;
		System.out.println("\nCombined bank balance for banks ICICI,HDFC,BOB,SBI is:"+sum);
	}
	
	void displayTotalCreditDebitCount() {
		System.out.println("\nOverall Debit Operations count is :" +staticDebitCount);
		System.out.println("\nOverall Credit Operations count is :" +staticCreditCount);
	}
	
	void displayIndividualCreditCount() {
		System.out.println("\nBank-wise Credit Operation Count:-\nICICI : "+iciciCreditCount+"\nHDFC Bank : "+hdfcCreditCount+"\nBOB : "+bobCreditCount+"\nSBI : "+sbiCreditCount);
	}
	
	void displayIndividualDebitCount() {
		System.out.println("\nBank-wise Debit Operation Count:-\nICICI Bank : "+iciciDebitCount+"\nHDFC Bank : "+hdfcDebitCount+"\nBOB : "+bobDebitCount+"\nSBI : "+sbiDebitCount);
	}
	
	
	String displayBankresponse() {
		if(staticCreditCount>staticDebitCount) {
			return "*I appreciate your money management skill*";
		}
		else {
			return "*Please spend money wisely*";
		}
	}
	
	public static void main(String[] args) {
		BankingOperationScanner bankingOperationScanner = new BankingOperationScanner();
		Scanner scanner = new Scanner(System.in);
		
		String status="";
		do {
				System.out.println("\nEnter the bank name which you want to access-  ICICI /HDFC /BOB /SBI");
				String bankname = scanner.next();
				
				System.out.println("What would you like to do? Credit/Debit");
				String operation = scanner.next();
				 if(operation.equals("Credit")) {
					 System.out.println("How many times you want to do credit operation");
					 int creditCount = scanner.nextInt();
					 int count=1;
					 	while(count<=creditCount) {
					 		System.out.println("Enter amount to be credited: ");
					 		double amount = scanner.nextDouble();
					 		bankingOperationScanner.bankOperation(bankname,amount,operation);
					 		count++;
					 }
				 }
				 else if(operation.equals("Debit")) {
					 System.out.println("Enter the number of times you want to do debit operation");
					 int debitCount = scanner.nextInt();
					 	for(int index=1;index<=debitCount;index++) {
					 			System.out.println("Enter amount to be debited: ");
					 			double amount = scanner.nextDouble();
					 			bankingOperationScanner.bankOperation(bankname,amount,operation); 
					 }
				 }
				 else {
					 System.out.println("Invalid Operation");
				 }
				 System.out.println("\nWould you like to continue? (Y/N)");
					status = scanner.next();
				
				}while(status.equals("Y"));
	
		
		bankingOperationScanner.displayTotalBalance();
		
		bankingOperationScanner.displayTotalCreditDebitCount();
		
		bankingOperationScanner.displayIndividualCreditCount();
		
		bankingOperationScanner.displayIndividualDebitCount();
		
		System.out.println("\n"+bankingOperationScanner.displayBankresponse());	
		scanner.close();
	}
}
		
