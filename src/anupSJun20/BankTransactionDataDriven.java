package anupSJun20;

import java.util.Scanner;

public class BankTransactionDataDriven {
	static int iciciavailbal,hdfcavailbal,bobavailbal,sbiavailbal;
	static int icicicreditcnt,icicidebitcnt;
	static int hdfccreditcnt,hdfcdebitcnt;
	static int bobcreditcnt,bobdebitcnt;
	static int sbicreditcnt,sbidebitcnt;
	static int totalCreditcount, totalDebitcount;
	void setbalmethod(String bankname, int bal) {
		switch(bankname){
		case "ICICI":
			iciciavailbal = bal;
			break;
		case "HDFC":
			hdfcavailbal = bal;
			break;
		case "BOB":
			bobavailbal = bal;
			break;
		case "SBI":
			sbiavailbal = bal;
			break;
		default:
			System.out.println("You don't have a account in this bank");
		}
	}
	void bankOperations(String bankname, String operation, int amount) {
		switch(bankname){
			case "ICICI":
				switch(operation) {
				case "credit":
				case "Credit":
					if (amount > 0) {
						iciciavailbal = iciciavailbal+amount;
						icicicreditcnt++;
						totalCreditcount++;
					}
					else {
						System.out.println("Please enter a correct amount");
					}
					break;
				case "debit":
				case "Debit":
					if(amount>iciciavailbal) {
						System.out.println("You have insufficient fund");
					}
					else {
						iciciavailbal = iciciavailbal-amount;
						icicidebitcnt++;
						totalDebitcount++;
					}
					break;
				default:
					System.out.println("Invalid Operations");	
				}
				break;
			case "HDFC":
				switch(operation) {
				case "credit":
				case "Credit":
					if (amount > 0) {
						hdfcavailbal = hdfcavailbal+amount;
						hdfccreditcnt++;
						totalCreditcount++;
					}
					else {
						System.out.println("Please enter a correct amount");
					}
					break;
				case "debit":
				case "Debit":
					if(amount>hdfcavailbal) {
						System.out.println("You have insufficient fund");
					}
					else {
						hdfcavailbal = hdfcavailbal-amount;
						hdfcdebitcnt++;
						totalDebitcount++;
					}
					break;
				default:
					System.out.println("Invalid Operations");	
				}
				break;
			case "BOB":
				switch(operation) {
				case "credit":
				case "Credit":
					if (amount > 0) {
						bobavailbal = bobavailbal+amount;
						bobcreditcnt++;
						totalCreditcount++;
					}
					else {
						System.out.println("Please enter a correct amount");
					}
					break;
				case "debit":
				case "Debit":
					if(amount>bobavailbal) {
						System.out.println("You have insufficient fund");
					}
					else {
						bobavailbal = bobavailbal-amount;
						bobdebitcnt++;
						totalDebitcount++;
					}
					break;
				default:
					System.out.println("Invalid Operations");	
				}
				break;
			case "SBI":
				switch(operation) {
				case "credit":
				case "Credit":
					if (amount > 0) {
						sbiavailbal = sbiavailbal+amount;
						sbicreditcnt++;
						totalCreditcount++;
					}
					else {
						System.out.println("Please enter a correct amount");
					}
					break;
				case "debit":
				case "Debit":
					if(amount>sbiavailbal) {
						System.out.println("You have insufficient fund");
					}
					else {
						sbiavailbal = sbiavailbal-amount;
						sbidebitcnt++;
						totalDebitcount++;
					}
					break;
				default:
					System.out.println("Invalid Operations");	
				}
				break;
			default:
				System.out.println("Please enter correct bank name");
			
		}
	}
	
	int totalBalance(){
		return iciciavailbal+hdfcavailbal+bobavailbal+sbiavailbal;
	}
	void totaltransactionCount() {
		System.out.println("Total Credit Transaction : "+ totalCreditcount);
		System.out.println("Total Debit Transaction : "+totalDebitcount);	
	}
	void individualCreditOperation() {
		System.out.println("ICICI credit count : " + icicicreditcnt);
		System.out.println("HDFC credit count : " + hdfccreditcnt);
		System.out.println("BOB credit count : " + bobcreditcnt);
		System.out.println("SBI credit count : " + sbicreditcnt);
	}
	void individualDebitOperation() {
		System.out.println("ICICI debit count : " + icicidebitcnt);
		System.out.println("HDFC debit count : " + hdfcdebitcnt);
		System.out.println("BOB debit count : " + bobdebitcnt);
		System.out.println("SBI debit count : " + sbidebitcnt);
	}
	String moneyManagement() {
		if(totalCreditcount > totalDebitcount)
			return "I appreciate your money management skill";
		else if(totalDebitcount > totalCreditcount)
			return "Please spend money wisely";
		else
			return "You need to do well";
	}
	public static void main(String[] args) {
		BankTransactionDataDriven bankTransactionDataDriven = new BankTransactionDataDriven();
		Scanner sc = new Scanner(System.in);
		for (int i = 1;i<=4; i++) {
			System.out.println("Enter the Bank name : + ICICI,HDFC,BOB,SBI ");
			String bname = sc.next();
			System.out.println("Enter the available Balance ");
			int amount = sc.nextInt();
			bankTransactionDataDriven.setbalmethod(bname,amount);
		}
		String transContinue = "";
		do{
		System.out.println("Enter the Bank name : ICICI,HDFC,BOB,SBI ");
		String bankname = sc.next();
		System.out.println("Enter the Operation that you want to perform : Credit or Debit");
		String operation = sc.next();
		System.out.println("Enter the amount that you want to transact ");
		int amount = sc.nextInt();
		bankTransactionDataDriven.bankOperations(bankname,operation,amount);
		System.out.println("Please confirm if you want to conyinue : Yes or No ");
		transContinue =sc.next();
		} while(transContinue.equals("Yes"));
		System.out.println("The summary of your current date's financial transaction");
		System.out.println("The Total balance of the Customer is :" +bankTransactionDataDriven.totalBalance());
		bankTransactionDataDriven.totaltransactionCount();
		bankTransactionDataDriven.individualCreditOperation();
		bankTransactionDataDriven.individualDebitOperation();
		System.out.println(bankTransactionDataDriven.moneyManagement());
	}
		
}		
