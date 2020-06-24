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
		 else return "*Please spend money wisely*" and print this message in main method.*/

package harshadBJun20;

public class BankingOpsWithSwitchCase {
	
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
		BankingOpsWithSwitchCase bankingOpsWithSwitchCase = new BankingOpsWithSwitchCase();
		bankingOpsWithSwitchCase.bankOperations("ICICI", 10000, "Credit");
		bankingOpsWithSwitchCase.bankOperations("ICICI", 5000, "Debit");
		bankingOpsWithSwitchCase.bankOperations("ICICI", 10000, "Credit");
		bankingOpsWithSwitchCase.bankOperations("HDFC", 12000, "Credit");
		bankingOpsWithSwitchCase.bankOperations("HDFC", 5000, "Credit");
		bankingOpsWithSwitchCase.bankOperations("HDFC", 5000, "Debit");
		bankingOpsWithSwitchCase.bankOperations("HDFC", 2000, "Debit");
		bankingOpsWithSwitchCase.bankOperations("SBI", 8000, "Credit");
		bankingOpsWithSwitchCase.bankOperations("SBI", 50000, "Credit");
		bankingOpsWithSwitchCase.bankOperations("SBI", 1000, "Credit");
		bankingOpsWithSwitchCase.bankOperations("SBI", 11000, "Debit");
		bankingOpsWithSwitchCase.bankOperations("BOB", 65000, "Credit");
		bankingOpsWithSwitchCase.bankOperations("BOB", 5000, "Credit");
		bankingOpsWithSwitchCase.bankOperations("BOB", 5000, "Debit");
		bankingOpsWithSwitchCase.bankOperations("BOB", 10000, "Debit");
		bankingOpsWithSwitchCase.bankOperations("SBI", 10000, "ABC");
		bankingOpsWithSwitchCase.bankOperations("ICICI", 20000, "Debit");
		
		bankingOpsWithSwitchCase.totalBalanceOfAllAccounts();
		bankingOpsWithSwitchCase.totalCreditDebitOpt();
		bankingOpsWithSwitchCase.individualBankCreditOpt();
		bankingOpsWithSwitchCase.individualBankDebitOpt();
		
		System.out.println(showMessage());
		
	}
}
