package aasthaJJun20;
import java.util.Scanner;

public class MoneyManagmentScanner{
	static int countAllDebits, countAllCredits;
	int countIciciDebits, countIciciCredits, countHdfcDebits, countHdfcCredits, countBobDebits, countBobCredits, countSbiDebits, countSbiCredits;
	double iciciBalance, hdfcBalance, bobBalance, sbiBalance;
	
	void setBalance(double icici, double hdfc, double bob, double sbi){
		iciciBalance = icici;
		hdfcBalance = hdfc;
		bobBalance = bob;
		sbiBalance = sbi;
	}
	void bankOperation(String bankName, double amount, String operation){
		switch(bankName) {
			case "icici" :
			case "ICICI" :
				switch(operation) {
					case "debit":
					case "Debit":
						if(iciciBalance < amount)
							System.out.println("Insufficient Balance, you cannot withdraw from ICICI account");
						else{
							iciciBalance -= amount;
							countIciciDebits++;
							countAllDebits++;
						}
						break;
					case "credit":
					case "Credit":
						if(amount == 0)
							System.out.println("You cannot credit 0 amount");
						else{
							iciciBalance += amount;
							countIciciCredits++;
							countAllCredits++;
						}
						break;
				}
				break;
			case "hdfc" :
			case "HDFC" :
				switch(operation) {
					case "debit" :
					case "Debit":
						if(hdfcBalance < amount)
							System.out.println("Insufficient Balance, you cannot withdraw from HDFC account");
						else{
							hdfcBalance -= amount;
							countHdfcDebits++;
							countAllDebits++;
						}
						break;
					case "credit" :
					case "Credit":
						if(amount == 0)
							System.out.println("You cannot credit 0 amount");
						else{
							hdfcBalance += amount;
							countHdfcCredits++;
							countAllCredits++;
						}
						break;
				}
				break;
			case "bob" :
			case "BOB" :
				switch(operation) {
					case "debit" :
					case "Debit":
						if(bobBalance < amount)
							System.out.println("Insufficient Balance, you cannot withdraw from BOB account");
						else{
							bobBalance -= amount;
							countBobDebits++;
							countAllDebits++;
						}
						break;
					case "credit" :
					case "Credit":
						if(amount == 0)
							System.out.println("You cannot credit 0 amount");
						else{
							bobBalance += amount;
							countBobCredits++;
							countAllCredits++;
						}
						break;
				}
				break;
			case "sbi" :
			case "SBI" :
				switch(operation) {
					case "debit" :
					case "Debit":
						if(sbiBalance < amount)
							System.out.println("Insufficient Balance, you cannot withdraw from SBI account");
						else{
							sbiBalance -= amount;
							countSbiDebits++;
							countAllDebits++;
						}
						break;
					case "credit" :
					case "Credit":
						if(amount == 0)
							System.out.println("You cannot credit 0 amount");
						else{
							sbiBalance += amount;
							countSbiCredits++;
							countAllCredits++;
						}
						break;
				}
				break;
			default :
				System.out.println("You cannot credit/debit. You don't have account in "+bankName+" bank");
		}
	}
	void displayTotalBalance(){
		System.out.println("Total Balance in your accounts is: "+(iciciBalance+hdfcBalance+bobBalance+sbiBalance));
	}
	void displayTotalCreditsDebits(){
		System.out.println("Total Credit operation on your accounts :"+countAllCredits+" times");
		System.out.println("Total Debit operation on your accounts :"+countAllDebits+" times");
	}
	void displayIndividualBankCredits(String bankName){
		switch(bankName){
			case "icici" :
			case "ICICI" :
				System.out.println("ICICI bank Credit Operation : "+countIciciCredits);
				break;
			case "hdfc" :
			case "HDFC" :
				System.out.println("HDFC bank Credit Operation : "+countHdfcCredits);
				break;
			case "bob" :
			case "BOB" :
				System.out.println("BOB bank Credit Operation : "+countBobCredits);
				break;
			case "sbi" :
			case "SBI" :
				System.out.println("SBI bank Credit Operation : "+countSbiCredits);
				break;
			default :
				System.out.println("You don't have account in "+bankName+" bank");
		}
	}	
	void displayIndividualBankDebits(String bankName){
		switch(bankName){
			case "icici" :
			case "ICICI" :
				System.out.println("ICICI bank Debit Operation : "+countIciciDebits);
				break;
			case "hdfc" :
			case "HDFC" :
				System.out.println("HDFC bank Debit Operation : "+countHdfcDebits);
				break;
			case "bob" :
			case "BOB" :
				System.out.println("BOB bank Debit Operation : "+countBobDebits);
				break;
			case "sbi" :
			case "SBI" :
				System.out.println("SBI bank Debit Operation : "+countSbiDebits);
				break;
			default :
				System.out.println("You don't have account in "+bankName+" bank");
		}
	}
	String displayMessage(){
		if(countAllCredits >= countAllDebits)
			return "*****I appreciate your money management skill*****";
		else
			return "*****Please spend money wisely*****";
	}

	public static void main(String[] args){
		MoneyManagmentScanner moneyManagementScanner = new MoneyManagmentScanner();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the account opening balance of your Bank accounts:");
		System.out.println("Enter amount for ICICI:");
		double icici = scanner.nextDouble();
		System.out.println("Enter amount for HDFC:");
		double hdfc = scanner.nextDouble();
		System.out.println("Enter amount for BOB:");
		double bob = scanner.nextDouble();
		System.out.println("Enter amount for SBI:");
		double sbi = scanner.nextDouble();
		moneyManagementScanner.setBalance(icici,hdfc,bob,sbi);
		
		String status = "";
		String bankName, operation;
		double amount;
		do{
			System.out.println("Please enter bank name:");
			bankName = scanner.next();
			System.out.println("Please enter if you want to credit or debit from : "+bankName+" bank acoount");
			operation = scanner.next();
			System.out.println("Please enter the amount you want to "+operation);
			amount = scanner.nextDouble();
			moneyManagementScanner.bankOperation(bankName,amount,operation);
			
			System.out.println("Press y if you wish to continue with credits/debits, else press n");
			status = scanner.next();
		}while(status.equals("y"));
		
		
		do{
			System.out.println("Please enter bank name to know the no. of DEBIT operations:");
			bankName = scanner.next();
			moneyManagementScanner.displayIndividualBankDebits(bankName);
			
			System.out.println("Please enter bank name to know the no. of CREDIT operations:");
			bankName = scanner.next();
			moneyManagementScanner.displayIndividualBankCredits(bankName);
			
			System.out.println("Press y, if you wish to continue viewing no. of credits/debits, else press n");
			status = scanner.next();
			
		}while(status.equals("y"));
		
		moneyManagementScanner.displayTotalCreditsDebits();
		moneyManagementScanner.displayTotalBalance();
		System.out.println(moneyManagementScanner.displayMessage());
		scanner.close();
	}
}
