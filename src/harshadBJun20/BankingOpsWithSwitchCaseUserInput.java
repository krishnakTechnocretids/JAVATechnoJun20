package harshadBJun20;

import java.util.Scanner;

public class BankingOpsWithSwitchCaseUserInput {
	
	static int debitTotalCount=0, creditTotalCount=0;
	double totalBalanceAmt;
	int iciciDebitCnt,hdfcDebitCnt,sbiDebitCnt,bobDebitCnt;
	int iciciCreditCnt,hdfcCreditCnt,sbiCreditCnt,bobCreditCnt;
	double iciciBalance,hdfcBalance,sbiBalance,bobBalance;
	
	void totalBalanceOfAllAccounts() {
		totalBalanceAmt = iciciBalance + hdfcBalance + sbiBalance + bobBalance;
		System.out.println();
		System.out.println("The person is having Total balance from [ICICI balance + HDFC balance + BOB balance + SBI Balance]: " +totalBalanceAmt);
		System.out.println();
	}
	
	void totalCreditDebitOpt() {
		System.out.println("Total Credit & Debit operation counts of all Banks:");
		System.out.println("------------------------------------------------------");
		System.out.println("Total credit operation from all banks: "+creditTotalCount);
		System.out.println("Total debit operation from all banks: "+debitTotalCount);
		System.out.println();
	}
	
	void individualBankCreditOpt() {
		System.out.println("Individual Credit operation counts of all Banks:");
		System.out.println("------------------------------------------------------");
		System.out.println("ICICI bank Credit Operation:- "+iciciCreditCnt);
		System.out.println("HDFC bank Credit Operation:- "+hdfcCreditCnt);
		System.out.println("SBI bank Credit Operation:- "+sbiCreditCnt);
		System.out.println("BOB bank Credit Operation:- "+bobCreditCnt);
		System.out.println();
		
	}
	
	void individualBankDebitOpt() {
		System.out.println("Individual Debit operation counts of all Banks:");
		System.out.println("------------------------------------------------------");
		System.out.println("ICICI bank Debit Operation:- "+iciciDebitCnt);
		System.out.println("HDFC bank Debit Operation:- "+hdfcDebitCnt);
		System.out.println("SBI bank Debit Operation:- "+sbiDebitCnt);
		System.out.println("BOB bank Debit Operation:- "+bobDebitCnt);
		System.out.println();
		
	}
	
	void printIndividualBankBalance(){
		System.out.println();
		System.out.println("ICICI Bank account balance: "+iciciBalance);
		System.out.println("HDFC Bank account balance: "+hdfcBalance);
		System.out.println("SBI Bank account balance: "+sbiBalance);
		System.out.println("ICICI Bank account balance: "+bobBalance);
		System.out.println();
	}
	
	static String showMessage(){
		if(creditTotalCount>debitTotalCount) 
			return "*I appreciate your money management skill*";
		else 
			return "*Please spend money wisely*";
	}
	
	void bankOperations(String bankName, double amount, String operation){
		if(amount>0) {
			switch(bankName) {
			case "ICICI" :
				switch(operation) {
				case "Debit":
					if(iciciBalance>=amount) {
						iciciBalance -= amount;
						iciciDebitCnt++;
						debitTotalCount++;
					}else
						System.out.println("Insufficient Balance...Could not debit "+amount+" from ICICI bank account");
					break;
				case "Credit":
					iciciBalance += amount;
					iciciCreditCnt++;
					creditTotalCount++;
					break;
				default:
					System.out.println("Invalid operation provided. Please specify Debit/Credit operation for ICICI bank account");
				}
				break;
			case "HDFC" :
				switch(operation) {
				case "Debit":
					if(hdfcBalance>=amount) {
						hdfcBalance -= amount;
						hdfcDebitCnt++;
						debitTotalCount++;
					}else
						System.out.println("Insufficient Balance...Could not debit"+amount+"  from HDFC bank account");
					break;
				case "Credit":
					hdfcBalance += amount;
					hdfcCreditCnt++;
					creditTotalCount++;
					break;
				default:
					System.out.println("Invalid operation provided. Please specify Debit/Credit operation for HDFC bank account");
				}
				break;
			case "SBI" :
				switch(operation) {
				case "Debit":
					if(sbiBalance>=amount) {
						sbiBalance -= amount;
						sbiDebitCnt++;
						debitTotalCount++;
					}else
						System.out.println("Insufficient Balance...Could not debit "+amount+ " from SBI bank account");
					break;
				case "Credit":
					sbiBalance += amount;
					sbiCreditCnt++;
					creditTotalCount++;
					break;
				default:
					System.out.println("Invalid operation provided. Please specify Debit/Credit operation for SBI bank account");
				}
				break;
			case "BOB" :
				switch(operation) {
				case "Debit":
					if(bobBalance>=amount) {
						bobBalance -= amount;
						bobDebitCnt++;
						debitTotalCount++;
					}else
						System.out.println("Insufficient Balance...Could not debit "+amount+" from BOB bank account");
					break;
				case "Credit":
					bobBalance += amount;
					bobCreditCnt++;
					creditTotalCount++;
					break;
				default:
					System.out.println("Invalid operation provided. Please specify Debit/Credit operation for BOB bank account");
				}
				break;
			default:
				System.out.println("You dont have account in this bank..");
			}
		}else
			System.out.println("Invalid amount..Please enter amount greater than 0");

	}
	public static void main(String[] args) {
		BankingOpsWithSwitchCaseUserInput bankingOpsWithSwitchCaseUserInput = new BankingOpsWithSwitchCaseUserInput();
		
		Scanner sc = new Scanner(System.in);
		String yesOrNo, bankName, creditOrDebitOpt;
		double amount;
		int menuNumber;
		
		do{
			System.out.println("---------------------------Banking Menu--------------------------------");
			System.out.println("1.Perform Transaction (Credit/Debit).");
			System.out.println("2.Print Summary of individual balance of all bank");
			System.out.println("3.Print Total balance of all bank");
			System.out.println("4.Print count of Credit operations of all bank");
			System.out.println("5.Print count of Debit operations of all bank");
			System.out.println("6.Print total count of Credit & Debit operations of all bank");
			System.out.println("7.Print message for your Money management skills");
			System.out.println();
			System.out.println("Enter number from 1-7 for above Menu option you want to perform: ");
			menuNumber = sc.nextInt();
			
			switch(menuNumber){
				case 1:
					System.out.println("Enter Bank name to perform transaction with [i.e. ICICI/HDFC/SBI/BOB]: ");
					bankName = sc.next();
					System.out.println("Enter which type of transaction (Debit/Credit) you want to perform with your " +bankName+" bank account:");
					creditOrDebitOpt = sc.next();
					System.out.println("Enter Amount to perform "+creditOrDebitOpt+" transaction in your " +bankName+" bank account: ");
					amount = sc.nextInt();
					if(bankName.equals("ICICI") || bankName.equals("icici") || bankName.equals("HDFC") || bankName.equals("hdfc") || bankName.equals("SBI") || bankName.equals("sbi") || bankName.equals("BOB") || bankName.equals("bob")){
						if(creditOrDebitOpt.equals("Credit") || creditOrDebitOpt.equals("credit") || creditOrDebitOpt.equals("Debit") || creditOrDebitOpt.equals("debit")){
							if(amount>0){
								bankingOpsWithSwitchCaseUserInput.bankOperations(bankName,amount,creditOrDebitOpt);
								System.out.println(creditOrDebitOpt+" Transaction completed");
							}else
								System.out.println("Invalid amount...");
						}else
							System.out.println("Invalid transaction type...");
					}else
						System.out.println("Invalid bank name. You dont have any account in this bank");
					
					break;
					
				case 2:
					bankingOpsWithSwitchCaseUserInput.printIndividualBankBalance();
					break;
				case 3:
					bankingOpsWithSwitchCaseUserInput.totalBalanceOfAllAccounts();
					break;
				case 4:
					bankingOpsWithSwitchCaseUserInput.individualBankCreditOpt();
					break;
				case 5:
					bankingOpsWithSwitchCaseUserInput.individualBankDebitOpt();
					break;
				case 6:
					bankingOpsWithSwitchCaseUserInput.totalCreditDebitOpt();
					break;
				case 7:
					System.out.println(showMessage());
					break;
				default:
					System.out.println("Invalid menu option entered");
										
			}	
			
			System.out.println("Do you want to continue (Yes/No)?: ");
			yesOrNo=sc.next();
				
		}while(yesOrNo.equals("Yes") || yesOrNo.equals("yes"));
		
		sc.close();
	}
}
