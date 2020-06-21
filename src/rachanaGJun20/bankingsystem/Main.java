package rachanaGJun20.bankingsystem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Banking banking = new Banking();
		Scanner scanner = new Scanner(System.in);
		boolean exitflag=false;
		do {
			//System.out.println("Hi! Please Enter following details:");
			
			System.out.println("Enter your choice:\n 1. Debit\n 2. Credit\n 3.View Individual Bank Credit Transaction Count\n 4. View Individual Bank Debit Transaction Count\n 5. All Banks Debit & Credit Transaction Count\n 6. View Total Balance\n 7. Individual Bank Balance\n 8. Exit");
			int operation = scanner.nextInt();
			switch(operation) {
				case 1:{
					System.out.println("Bank Name:");
					String bankName = scanner.next();
					System.out.println("Enter Amount:");
					double amount = scanner.nextDouble();
					banking.bankingOperations(bankName, amount, "Debit");
					break;}
				case 2:{
					System.out.println("Bank Name:");
					String bankName = scanner.next();
					System.out.println("Enter Amount:");
					double amount = scanner.nextDouble();
					banking.bankingOperations(bankName, amount, "Credit");
					break;}
				case 3:{
					Banking.displayIndividualBankCreditTransaction();
					break;}
				case 4:{
					Banking.displayIndividualBankDebitTransaction();
					break;}
				case 5:{
					Banking.displayAllBankTransactions();
					break;}
				case 6:{
					banking.displayTotalBankBalance();
					break;}
				case 7:{
					System.out.println("select option for specific Bank:");
					System.out.println("1.ICICI\n2.SBI\n3.BOB\n4.HDFC");
					int option=scanner.nextInt();
					switch(option) {
						case 1:{
							System.out.println("Balance:"+banking.icici.getBalance());
							break;}
						case 2:{
							System.out.println("Balance:"+banking.sbi.getBalance());
							break;}
						case 3:{
							System.out.println("Balance:"+banking.bob.getBalance());
							break;}
						case 4:{
							System.out.println("Balance:"+banking.hdfc.getBalance());
							break;}
						default:
							System.out.println("please enter correct opetion!");
						}
					break;}
				case 8:{
						System.out.println("Have a nice time!");
						exitflag=true;
						break;}
				default:
						System.out.println("please enter correct opetion!");
					}
					
					
				
			}while(!exitflag);
		scanner.close();
	}
	
}

	
			
			
			
			
			
			
	