package jagadeeshMJun20;
import java.util.Scanner;
public class BankAccountScanner {
		static double balICICI,balHDFC, balBOB, balSBI;
		static int debCount,crdCount;
		int debCountICICI,credCountICICI,debCountHDFC, credCountHDFC,debCountBOB,credCountBOB,debCountSBI,credCountSBI;
		String bankNameInput;
		double amtInput;
		String operationInput;
		
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
					BankAccountScanner bankAccountScanner = new BankAccountScanner();
					Scanner scanner = new Scanner(System.in);
					String status = "Yes";
					while(status.equals("Yes")){
						System.out.println("Enter BANK name to be BOB/ICICI/SBI/HDFC : ");
						String bankNameInput=scanner.next();
						System.out.println("Enter amount :");
						double amtInput = scanner.nextDouble();
						System.out.println("Enter Debit or Credit:");
						String operationInput= scanner.next();
						bankAccountScanner.bankOperation(bankNameInput, amtInput, operationInput);
						System.out.println("Do you want to continue ? Yes/No");
						status = scanner.next();
					}
					System.out.println("Program end");
					scanner.close();
					bankAccountScanner.totalBankBalance();
					bankAccountScanner.totalOperations();
					bankAccountScanner.invCreditOperations();
					bankAccountScanner.invDebitOperations();
					if (bankAccountScanner.message() == true)
						System.out.println("*I appreciate your money management skill*");
					else
						System.out.println("*Please spend money wisely*");
				}
}