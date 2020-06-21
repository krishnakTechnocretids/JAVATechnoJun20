package suparnaNJune20;
import java.util.Scanner;


public class BankMenu {

	static double SBIBal, HDFCBal,BOBBal,ICICBal; 
	static int  SBICreditCnt,HDFCCreditCnt,BOBCreditCnt,ICICICreditCnt,SBIDebitCnt,HDFCDebitCnt,BOBDebitCnt,ICICIDebitCnt;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		String bankName; 
		double bal;
		BankMenuTotalBal totalBal = new BankMenuTotalBal();
		BankMenuAccOpen accOpen= new BankMenuAccOpen();
		//BankMenuSpecificAccBal specAccBal = new BankMenuSpecificAccBal();
		//BankMenuSpecificAccBal bankBal = new BankMenuSpecificAccBal();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter account Opening balance amout to activate Account");
			accOpen.accountOpen();

		do {
			System.out.println("********************Select your choice********************");
			System.out.println("1: Print Current Total Balance  from All Account");
			System.out.println("2: Print Current Balance from specific bank  Account");
			System.out.println("3: Credit Money to specific bank  Account ");
			System.out.println("4: Debit  Money from specific bank  Account ");
			System.out.println("5: Total no of credit /debit trnaction from all bank  Account");
			System.out.println("6: Total no of  credit /debit  transaction from specific bank  Account");
			System.out.println("0: Exit");
			choice = scanner.nextInt();

			switch (choice) {
			case 1: System.out.println(" Total balnace from all account = " + totalBal.bal());
			break;
			case 2: System.out.println("Enter Bank name ");
			bankName= scanner.next();
			BankMenuSpecificAccBal.getBal(bankName);
			break;
			case 3:
				System.out.println("Please Enter Bank Name and total amout to be credit in account");
				bankName= scanner.next();
				bal = scanner.nextInt();
				BankMenuCredit.creditBal (bankName ,bal);
				break;
			case 4:
				System.out.println("Please Enter Bank Name and total amout to be Debit from account");
				bankName= scanner.next();
				bal = scanner.nextInt();
				BankMenuCredit.debitBal(bankName,bal);
				break;
			case 5:
				System.out.println("Enter Bank name ");
				bankName= scanner.next();
				BankMenuTransaction.totalCreditDebitOp();
				break;
			case 6:System.out.println("Enter Bank name ");
			bankName= scanner.next();
			BankMenuTransaction.individualDebitOP(bankName);
			BankMenuTransaction.individualDebitOP(bankName);
			
			break;
			case 0:
				return;
			default:
				System.out.println("Enter valid opetion from 0 to 7");
			}

		}while(choice !=0);


	}

}
