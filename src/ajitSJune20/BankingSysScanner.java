package ajitSJune20;

import java.util.Scanner;

public class BankingSysScanner {
	
	double iciciBalance, sbiBalance, bobBalance, hdfcBalance;
	int iciciCreditCount, sbiCreditCount, bobCreditCount, hdfcCreditCount;
	int iciciDebitCount, sbiDebitCount, bobDebitCount, hdfcDebitCount;
	static int totalDebitCount, totalCreditCount;

	void bankOperation(String bankName, double amount, String operation) {
		switch (bankName) {
		case "ICICI":
			switch (operation) {
			case "Debit":
				if (iciciBalance >= amount) {
					iciciBalance -= amount;
					System.out.println("Remining Balance in your ICICI Account: " +iciciBalance);
					iciciDebitCount++;
					totalDebitCount++;
				} else {
					System.out.println("!Insufficient balance in your ICICI Bank account."
							+ "You Opted for " + amount + " but available balance is " + iciciBalance);
				}
				break;
			case "Credit":
				iciciBalance += amount;
				System.out.println("Current Balance in your ICICI Account: " +iciciBalance);
				iciciCreditCount++;
				totalCreditCount++;
				break;
			default:
				System.out.println("Invalid Operation Performed in ICICI Bank!");
			}
			break;

		case "HDFC":
			switch (operation) {
			case "Debit":
				if (hdfcBalance >= amount) {
					hdfcBalance -= amount;
					System.out.println("Remining Balance in your HDFC Account: " +hdfcBalance);
					hdfcDebitCount++;
					totalDebitCount++;
				} else {
					System.out.println("!Insufficient balance in your HDFC Bank account."
							+ "You Opted for " + amount + " but available balance is " + hdfcBalance);
				}
				break;
			case "Credit":
				hdfcBalance += amount;
				System.out.println("Current Balance in your HDFC Account: " +hdfcBalance);
				hdfcCreditCount++;
				totalCreditCount++;
				break;
			default:
				System.out.println("Invalid Operation Performed in HDFC Bank !");
			}
			break;

		case "BOB":
			switch (operation) {
			case "Debit":
				if (bobBalance >= amount) {
					bobBalance -= amount;
					System.out.println("Remining Balance in your BOB Account: " +bobBalance);
					bobDebitCount++;
					totalDebitCount++;
				} else {
					System.out.println("!Insufficient balance in your BOB Bank account."
							+ "You Opted for " + amount + " but available balance is " + bobBalance);
				}
				break;
			case "Credit":
				bobBalance += amount;
				System.out.println("Current Balance in your BOB Account: " +bobBalance);
				bobCreditCount++;
				totalCreditCount++;
				break;
			default:
				System.out.println("Invalid Operation Performed in BOB Bank!");
			}
			break;
		case "SBI":
			switch (operation) {
			case "Debit":
				if (sbiBalance >= amount) {
					sbiBalance -= amount;
					System.out.println("Remining Balance in your SBI Account: " +sbiBalance);
					sbiDebitCount++;
					totalDebitCount++;
				} else {
					System.out.println("!Insufficient balance in your SBI Bank account."
							+ "You Opted for " + amount + " but available balance is " + sbiBalance);
				}
				break;
			case "Credit":
				sbiBalance += amount;
				System.out.println("CurrentCredit Balance in your SBI Account: " +sbiBalance);
				sbiCreditCount++;
				totalCreditCount++;
				break;
			default:
				System.out.println("Invalid Operation Performed in SBI Bank!");
			}
			break;
		}
	}

	void displayTotalBalance() {
		System.out.println("\nTotal Account Balance of all four Account: Rs. "
				+ (iciciBalance + bobBalance + hdfcBalance + sbiBalance));
	}

	void displaytotalDebitCreditOpsCount() {
		System.out.println("\nTotal Credit Operations count of all four banks : " + totalCreditCount + " times"
				+ "\nTotal  Debit Operations count of all four banks : " + totalDebitCount + " times");
	}

	void displayIndividualBanksCreditOpsCount() {
		System.out.println("\nICICI Credit operations Count : " + iciciCreditCount + " times"
				+ "\nHDFC  Credit operations Count : " + hdfcCreditCount + " times"
				+ "\nBOB   Credit operations Count : " + bobCreditCount + " times"
				+ "\nSBI   Credit operations Count : " + sbiCreditCount + " times");
	}

	void displayIndividualBanksDebitOpsCount() {
		System.out.println("\nICICI Dedit operations Count : " + iciciDebitCount + " times"
				+ "\nHDFC  Dedit operations Count : " + hdfcDebitCount + " times" + "\nBOB   Dedit operations Count : "
				+ bobDebitCount + " times" + "\nSBI   Dedit operations Count : " + sbiDebitCount + " times");
	}

	void bankMsgUponOpsSkill() {
		if (totalCreditCount >= totalDebitCount)
			System.out.println("\nAppreciation : *I appreciate your money management skill*");
		else
			System.out.println("\nSuggestions : *Please spend money wisely*");
	}

	public static void main(String[] args) {
		BankingSysScanner bankingSysScanner = new BankingSysScanner();
		Scanner scanner=new Scanner(System.in);
		String status="";
		do{
			System.out.println("Which Operation you want to perform ? (DEBIT/CREDIT)");
			String operation= scanner.next();
			
			System.out.println("Enter any of these four Bank Name (ICICI , HDFC,BOB,SBI) :");
			String nameOfBank = scanner.next();
			System.out.println("Enter Amount :");
			double amount = scanner.nextInt();
			
			switch(operation) {
				case "DEBIT":
					bankingSysScanner.bankOperation(nameOfBank, amount, "Debit");
					break;
				case "CREDIT":
					bankingSysScanner.bankOperation(nameOfBank, amount, "Credit");
					break;
				default:
					System.out.println("Invalid Selection");
						
			}
			
		
			System.out.println("\nWould you like to continue operation?Y/N");
			status = scanner.next(); // Y
			
		}while(status.equals("Y"));
		scanner.close();
		
		
		bankingSysScanner.displayTotalBalance();
		bankingSysScanner.displaytotalDebitCreditOpsCount();
		bankingSysScanner.displayIndividualBanksCreditOpsCount();
		bankingSysScanner.displayIndividualBanksDebitOpsCount();
		bankingSysScanner.bankMsgUponOpsSkill();

	}


}
