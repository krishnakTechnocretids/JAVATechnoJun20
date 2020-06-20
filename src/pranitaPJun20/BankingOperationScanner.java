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
		for(int i=1;i<=2;i++) {
			System.out.println("Enter amount to be credited to ICICI bank account : ");
			double amount = scanner.nextDouble();
			bankingOperationScanner.bankOperation("ICICI",amount,"Credit");
		}
		
		for(int i=1;i<=2;i++) {
			System.out.println("Enter amount to be debited from ICICI bank account : ");
			double amount = scanner.nextDouble();
			bankingOperationScanner.bankOperation("ICICI",amount,"Debit");
		}
		
		for(int i=1;i<=2;i++) {
			System.out.println("Enter amount to be credited to HDFC bank account : ");
			double amount = scanner.nextDouble();
			bankingOperationScanner.bankOperation("HDFC",amount,"Credit");
		}
		
		for(int i=1;i<=2;i++) {
			System.out.println("Enter amount to be debited from HDFC bank account : ");
			double amount = scanner.nextDouble();
			bankingOperationScanner.bankOperation("HDFC",amount,"Debit");
		}
		
		for(int i=1;i<=4;i++) {
			System.out.println("Enter amount to be credited to BOB bank account : ");
			double amount = scanner.nextDouble();
			bankingOperationScanner.bankOperation("BOB",amount,"Credit");
		}
		
		for(int i=1;i<=4;i++) {
			System.out.println("Enter amount to be debited from BOB bank account : ");
			double amount = scanner.nextDouble();
			bankingOperationScanner.bankOperation("BOB",amount,"Debit");
		}
		
		System.out.println("Enter amount to be credited from SBi bank account : ");
		double amount1 = scanner.nextDouble();
		bankingOperationScanner.bankOperation("SBI",amount1,"Credit");
		
		System.out.println("Enter amount to be debited from SBI bank account : ");
		double amount = scanner.nextDouble();
		bankingOperationScanner.bankOperation("SBI",amount,"Debit");
		scanner.close();
	
		bankingOperationScanner.displayTotalBalance();
		
		bankingOperationScanner.displayTotalCreditDebitCount();
		
		bankingOperationScanner.displayIndividualCreditCount();
		
		bankingOperationScanner.displayIndividualDebitCount();
		
		System.out.println("\n"+bankingOperationScanner.displayBankresponse());		
	}
}
		
