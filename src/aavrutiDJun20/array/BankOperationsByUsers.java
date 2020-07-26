package aavrutiDJun20.array;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.transaction.InvalidTransactionException;

public class BankOperationsByUsers {

	int debitCnt,creditCnt,bankBalance;
	static int debitAllUserCnt, creditAllUserCnt, usersCnt;



	void debit(int debitAmount) {
		try {
			if(debitAmount > bankBalance || debitAmount < 0) {
				throw new InvalidTransactionException();
			}
			else {
				bankBalance -= debitAmount;
				debitCnt++;
				debitAllUserCnt++;
			}
		}catch(InvalidTransactionException ite) {
			System.out.println("Invalid Amount");
		}
	}

	void credit(int creditAmount) {
		try {
			if(creditAmount < 0) {
				throw new InvalidTransactionException();
			}
			else {
				bankBalance += creditAmount;
				creditCnt++;
				creditAllUserCnt++;
			}
		}catch(InvalidTransactionException ite) {
			System.out.println("Invalid Amount");
		}
	}

	void displayUserInfo() {
		System.out.println("Debit Count  --> " + debitCnt);	
		System.out.println("Credit Count --> " + creditCnt);	
	}

	void displayAllUserInfo() {
		System.out.println("Total Users Count  --> " + usersCnt);
		System.out.println("Total Debit Count  --> " + debitAllUserCnt);	
		System.out.println("Total Credit Count --> " + creditAllUserCnt);	
	}

	public static void main(String[] args) throws ClassNotFoundException,InstantiationException,IllegalAccessException {
		BankOperationsByUsers bankOperationsByUsers = null;
		Scanner scanner = new Scanner(System.in);
		boolean transactionflag = true;
		String userAdd, transactionStatus = "No";
		do {	
			bankOperationsByUsers = (BankOperationsByUsers) Class.forName("aavrutiDJun20.array.BankOperationsByUsers").newInstance();
			usersCnt++;
			do {
				System.out.println("Which type of transaction would you like to perform : Debit/Credit");
				String transaction = scanner.next();
				if(transaction.equalsIgnoreCase("debit")) {
					System.out.println("Enter Amount for debit: ");
					try {
						int debitAmount = scanner.nextInt();
						bankOperationsByUsers.debit(debitAmount);
						System.out.println("Would you like to perform more transaction : Yes/No");
						transactionStatus = scanner.next();
					}
					catch(InputMismatchException ne) {
						System.out.println("Invalid selection");
						transactionStatus = "No";
						scanner.next();
					}
				}else if(transaction.equalsIgnoreCase("credit")) {
					try {
						System.out.println("Enter Amount for credit: ");
						int creditAmount = scanner.nextInt();
						bankOperationsByUsers.credit(creditAmount);
						System.out.println("Would you like to perform more transaction : Yes/No");
						transactionStatus = scanner.next();
					}
					catch(InputMismatchException ne) {
						System.out.println("Invalid selection");
						transactionStatus = "No";
						scanner.next();
					}
				}	
				else {
					transactionflag = false;
					transactionStatus = "No";
				}
			}while(transactionflag == false || transactionStatus.equalsIgnoreCase("Yes"));
			bankOperationsByUsers.displayUserInfo();
			System.out.println("Want to add new user : Yes/No");
			userAdd = scanner.next();
		}while(userAdd.equalsIgnoreCase("Yes"));
		bankOperationsByUsers.displayAllUserInfo();
		scanner.close();
	}
}
