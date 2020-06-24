package jagadeeshMJun20;

public class BankAccount {
		static double balICICI,balHDFC, balBOB, balSBI;
		static int debCount,crdCount;
		int debCountICICI,credCountICICI,debCountHDFC, credCountHDFC,debCountBOB,credCountBOB,debCountSBI,credCountSBI;
		void bankOperation(String bankName, double amt, String operation) {
			switch (bankName) {
				case "ICICI":
					switch (operation){
						case "Debit":
							debCountICICI++;
							debCount++;
							if(balICICI > amt){
								balICICI -=amt;
								System.out.println("balance is :"+balICICI);
							}
							else
								System.out.println("Insufficient Fund");	
						break;
						case "Credit" :
							crdCount++;
							credCountICICI++;
							if(amt > 0){
								balICICI +=amt;
								System.out.println("balance in ICICI is :"+balICICI);
							}
							else
								System.out.println("Invalid Amount");
						break;
						default :
								System.out.println("Select Debit or Credit Transaction");
					}
				break;
				case "HDFC":
					switch (operation){
						case "Debit":
							debCount++;
							debCountHDFC++;
							if(balHDFC > amt){
								balHDFC -=amt;
								System.out.println("balance is :"+balHDFC);
							}
							else
								System.out.println("Insufficient Fund");	
						break;
						case "Credit" :
							crdCount++;
							credCountHDFC++;
							if(amt > 0){
								balHDFC +=amt;
								System.out.println("balance in HDFC is :"+balHDFC);
							}
							else
								System.out.println("Invalid Amount");
						break;
						default :
							System.out.println("Select Debit or Credit Transaction");
					}
				break;
				case "BOB":
					switch (operation){
						case "Debit":
							debCount++;
							debCountBOB++;
							if(balBOB > amt){
								balBOB -=amt;
								System.out.println("balance in BOB is :"+balBOB);
							}
							else
								System.out.println("Insufficient Fund");	
						break;
						case "Credit":
							crdCount++;
							credCountBOB++;
							if(amt > 0){
								balBOB +=amt;
								System.out.println("balance in BOB is :"+balBOB);
								}
							else
								System.out.println("Invalid Amount");
						break;
						default:
								System.out.println("Select Debit or Credit Transaction");
					}
				break;
				case "SBI":
					switch (operation){
						case "Debit":
							debCount++;
							debCountSBI++;
							if(balSBI > amt){
								balSBI -=amt;
								System.out.println("balance is :"+balSBI);
							}
							else
								System.out.println("Insufficient Fund");	
						break;
						case "Credit" :
							crdCount++;
							credCountSBI++;
							if(amt > 0){
								balSBI +=amt;
								System.out.println("balance in SBI is :"+balSBI);
							}
							else
								System.out.println("Invalid Amount");
						break;
						default :
								System.out.println("Select Debit or Credit Transaction");
					}
				break;
			}
		}
	//A Method to show total balance	
		void totalBankBalance(){
			System.out.println("Total balance from all Banks is: "+(balICICI+balHDFC+balBOB+balSBI));
			}
	// A Method to show total credit, debit operations 
	                
		void totalOperations(){
			System.out.println("\n ::Below are Total Credit and Debit Operations ::");
			System.out.println("Total credit operations - "+crdCount);
			System.out.println("Total debit operation - "+debCount);
			
		}
	// A Method to show individual bank credit operations.
	 
		void invCreditOperations(){
			System.out.println("\n :: Below are Individual Credit Operations ::");
			System.out.println("ICICI bank Credit Operation - "+credCountICICI +"\nHDFC bank Credit Operation - "+ credCountHDFC +"\nSBI bank Credit Operation - "+credCountSBI+ "\nBOB bank Credit Operation - "+credCountBOB);
				}
	// A Method to show individual bank debit operations.
		void invDebitOperations(){
			System.out.println("\n ::Below are Individual Debit Operations ::");
			System.out.println("ICICI bank Credit Operation - "+debCountICICI +"\nHDFC bank Credit Operation - "+ debCountHDFC +"\nSBI bank Credit Operation - "+debCountSBI+ "\nBOB bank Credit Operation - "+debCountBOB);
				}			

	/*A Method which should return "*I appreciate your money management skill*" message if credit operation count is more than debit operation count else return "*Please spend money wisely*" and print this message in main method.*/			
		boolean message() {
			if (crdCount > debCount)
				return true;
			else return false;
		
		}
				public static void main (String[] agrs){
					BankAccount bankAccount = new BankAccount();
					bankAccount.bankOperation("BOB", 1000, "Credit");
					bankAccount.bankOperation("ICICI", 1500.5, "Credit");
					bankAccount.bankOperation("SBI", 1500.5, "Debit");
					bankAccount.bankOperation("BOB", 5000, "Debit");
					bankAccount.bankOperation("BOB", 10000, "Credit");
					bankAccount.totalBankBalance();
					bankAccount.totalOperations();
					bankAccount.invCreditOperations();
					bankAccount.invDebitOperations();
					if (bankAccount.message() == true)
						System.out.println("*I appreciate your money management skill*");
					else
						System.out.println("*Please spend money wisely*");
				}

}
