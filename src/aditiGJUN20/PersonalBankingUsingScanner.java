/*
 * A person has total 4 accounts in ICICI, HDFC, BOB, SBI one in each.
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

         f) A Method which should return "*I appreciate your money management skill*" 
         message if credit operation count is more than debit operation count else return 
         "*Please spend money wisely*" and print this message in main method.
 * */

package aditiGJUN20;


import java.util.Scanner;



public class PersonalBankingUsingScanner {
	double iciciBalance, hdfcBalance, bobBalance, sbiBalance;
	String accountHolderName;
	int debitCntIcici, debitCntHdfc, debitCntBob, debitCntSbi;
	int creditCntIcici, creditCntHdfc, creditCntBob, creditCntSbi;
	static int totalDebitCnt, totalCreditCnt;
	
	// Method to set Customer Info and opening balance in individual bank account..
		void setOpeningBalance(String name,double iciciAmount,double hdfcAmount, double bobAmount, double sbiAmount){
			accountHolderName=name;
			iciciBalance=iciciAmount;
			hdfcBalance=hdfcAmount;
			bobBalance=bobAmount;
			sbiBalance=sbiAmount;
		}
		// Method to perform transactions(Credit/Debit Operation)..
		void bankTransaction(String bankName, String transactionType, double amount) {
			switch(bankName) {
				case "ICICI" :
					switch (transactionType) {
						case "CREDIT":
							if(amount<=0)
								System.out.println("Please enter valid amount value.. ");
							else {
								iciciBalance+=amount;
								creditCntIcici++;
								totalCreditCnt++;
							}
							break;
							
						case "DEBIT":
							if(amount<=iciciBalance) {
								iciciBalance-=amount;
								debitCntIcici++;
								totalDebitCnt++;
							}
							else
								System.out.println("Insufficient Balance, can not withdraw money");
							break;
						default:
							System.out.println("Invalid Transaction Type(ICICI): "+transactionType);
					}
					break;
				
				case "HDFC" :
					switch (transactionType) {
					case "CREDIT":
						if(amount<=0)
							System.out.println("Please enter valid amount value.. ");
						else {
							iciciBalance+=amount;
							creditCntHdfc++;
							totalCreditCnt++;
						}
						break;
						
					case "DEBIT":
						if(amount<=hdfcBalance) {
							hdfcBalance-=amount;
							debitCntHdfc++;
							totalDebitCnt++;
						}
						else
							System.out.println("Insufficient Balance, can not withdraw money");
						break;
					
					default:
						System.out.println("Invalid Transaction Type(HDFC): "+transactionType);
					}
					break;
				
				case "BOB" :
					switch (transactionType) {
					case "CREDIT":
						if(amount<=0)
							System.out.println("Please enter valid amount value.. ");
						else {
							iciciBalance+=amount;
							creditCntBob++;
							totalCreditCnt++;
						}
						break;
						
					case "DEBIT":
						if(amount<=bobBalance) {
							bobBalance-=amount;
							debitCntBob++;
							totalDebitCnt++;
						}
						else
							System.out.println("Insufficient Balance, can not withdraw money");
						break;
					
					default:
						System.out.println("Invalid Transaction Type(BOB): "+transactionType);
					}
					break;
				
				case "SBI" :
					switch (transactionType) {
					case "CREDIT":
						if(amount<=0)
							System.out.println("Please enter valid amount value.. ");
						else {
							sbiBalance+=amount;
							creditCntSbi++;
							totalCreditCnt++;
						}
						break;
						
					case "DEBIT":
						if(amount<=sbiBalance) {
							sbiBalance-=amount;
							debitCntSbi++;
							totalDebitCnt++;
						}
						else
							System.out.println("Insufficient Balance, can not withdraw money");
						break;
					
					default:
						System.out.println("Invalid Transaction Type(SBI): "+transactionType);
					}
					break;
				
				default :
					System.out.println("You don't have Account in "+bankName+" Bank." );
			}
		}
		// Method to calculate total balance and display individual account balance summary..
		void totalBalance() {
			System.out.println("\nDear "+accountHolderName+", your total balance across various bank accounts is: "+(iciciBalance+hdfcBalance+bobBalance+sbiBalance));
			System.out.println("----Individual account summary is as follow: ");
			System.out.println("ICICI Bank :"+iciciBalance+"\nHDFC Bank: "+hdfcBalance+"\nBOB Bank: "+bobBalance+"\nSBI Bank: "+sbiBalance);
		}
		
		// Method to display Total Debit and Credit transaction summary..
		void displayTotalTransaction() {
			System.out.println("\n----- Transaction Summary----");
			System.out.println("Total Credit Operations: "+totalCreditCnt+"\nTotal Debit Operations: "+totalDebitCnt);
		}
		
		// Method to display per Bank, Credit type transaction 
		void displayBankWiseCredits() {
			System.out.println("\n----Individual Credit Operation per Bank: ");
			System.out.println("ICICI Bank :"+creditCntIcici+"\nHDFC Bank: "+creditCntHdfc+"\nBOB Bank: "+creditCntBob+"\nSBI Bank: "+creditCntSbi);
		}
		//Method to display per Bank, Debit type transaction
		void displayBankWiseDebits() {
			System.out.println("\n----Individual Debit Operation per Bank: ");
			System.out.println("ICICI Bank :"+debitCntIcici+"\nHDFC Bank: "+debitCntHdfc+"\nBOB Bank: "+debitCntBob+"\nSBI Bank: "+debitCntSbi);
		}
		
		// Method to send message to Account holder as per his/her Money Management habits/credit score..
		void displayMoneyManagementMsg() {
			if(totalCreditCnt>totalDebitCnt)
				System.out.println("\n*We appreciate your money management skill*");
			else
				System.out.println("\n*Please spend money wisely*");
		}
		
	public static void main(String[] args) {
		
		PersonalBankingUsingScanner personalBankingUsingScanner = new PersonalBankingUsingScanner();
		Scanner scanner = new Scanner(System.in);
		
		String status="";
		
		System.out.println("Set the customer name and Bankwise Opening Balance: ");
		System.out.println("Enter Customer Name: ");
		String name=scanner.next();
		System.out.println("ICICI Opening Balance: ");
		double iciciAmount=scanner.nextDouble();
		System.out.println("HDFC Opening Balance: ");
		double hdfcAmount=scanner.nextDouble();
		System.out.println("BOB Opening Balance: ");
		double bobAmount=scanner.nextDouble();
		System.out.println("SBI Opening Balance: ");
		double sbiAmount=scanner.nextDouble();
		personalBankingUsingScanner.setOpeningBalance(name,iciciAmount,hdfcAmount,bobAmount,sbiAmount);
		
		do {
			System.out.println("\nWhat Service would you like to avail?");
			System.out.println("\n1. Perform Transaction?"
					+ "\n2. Account Summary"
					+ "\n3. Total Transaction Summary"
					+ "\n4. View Total Credit Operations for All Accounts"
					+ "\n5. View Total Debit Operations for All Accounts"
					+ "\n6. Money Management/Bank Assistance "
					+ "\n7. Exit"
					+ "\n(Enter selection from 1-7 to perform operation:");
			
			int menuChoice=scanner.nextInt();

			switch (menuChoice) {
				case 1://Transaction
					System.out.println("For which Bank Would you like to perform transaction?"
							+ "\n1. ICICI \n2. HDFC \n3. BOB \n4.SBI ");
					String bankName=scanner.next();
					bankName = bankName.toUpperCase();
					
					System.out.println("For "+bankName+ "Account which transaction you want to perform? \n1. Credit \n2.Debit");
					String transactionType=scanner.next();
					transactionType=transactionType.toUpperCase();
					
					System.out.println("How much amount would you like to " + transactionType + " from/in your " + bankName + " Account?");
					double amount = scanner.nextDouble();
					personalBankingUsingScanner.bankTransaction(bankName,transactionType,amount);
					break;
				
				case 2://Account Summary
					personalBankingUsingScanner.totalBalance();
					break;
					
				case 3://Total Transaction Summary
					personalBankingUsingScanner.displayTotalTransaction();
					break;
	
				case 4://View Total Credit Operations for All Accounts
					personalBankingUsingScanner.displayBankWiseCredits();
					break;
					
				case 5://View Total Debit Operations for All Accounts
					personalBankingUsingScanner.displayBankWiseDebits();
					break;
					
				case 6://MoneyManagement Skills
					personalBankingUsingScanner.displayMoneyManagementMsg();
					break;
					
				case 7://Exit
					break;
					
				default:
						System.out.println("Invalid Menu Choice");
			}
		
			System.out.println("Would you like to continue? YES/NO");
			status=scanner.next();
		} 
		while(status.equalsIgnoreCase("YES"));
		
		System.out.println("Thank you for using our Service.");
		scanner.close();
	}
}
