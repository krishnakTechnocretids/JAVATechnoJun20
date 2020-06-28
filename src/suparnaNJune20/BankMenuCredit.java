package suparnaNJune20;

public class BankMenuCredit {


	static void creditBal (String bankName , double amt)
	{
		if(amt >=1 )
		{
			switch(bankName)
			{
			case "SBI":

				BankMenu.SBIBal += amt;
				BankMenu.SBICreditCnt ++;
				System.out.println(amt +" Rs Credited in SBI Account");
				System.out.println("Available total balance :" +BankMenu.SBIBal);
				break;
			case "HDFC":


				BankMenu.HDFCBal += amt;
				BankMenu.HDFCCreditCnt ++;
				System.out.println(amt +" Rs Credited in HDFC Account");
				System.out.println("Available total balance :" +BankMenu.HDFCBal);
				break;

			case "BOB":

				BankMenu.BOBBal += amt;
				BankMenu.BOBCreditCnt ++;
				System.out.println(amt +" Rs Credited in BOB Account");
				System.out.println("Available total balance :" +BankMenu.BOBBal);
				break;

			case "ICICI":

				BankMenu.ICICBal += amt;
				BankMenu.ICICICreditCnt ++;
				System.out.println(amt +" Rs Credited in ICICI Account");
				System.out.println("Available total balance :" +BankMenu.ICICBal);
				break;

			default :
				System.out.println(bankName +" Invalid bank name :");
			}
		}
		else System.out.println("Please enter credit amout greater than 0 Rs ");

	}

	static void  debitBal(String bankName, double amt)
	{
		if (amt >=1 )
		{
			switch(bankName)
			{
			case "SBI":

				if(amt >BankMenu.SBIBal ) {
					System.out.println(" In sufficent balance in SBI account, not able tp debit Rs" + amt);
					System.out.println("Available total balance :" +BankMenu.SBIBal);
					return;
				}
				else {
					BankMenu.SBIBal -= amt;
					BankMenu.SBIDebitCnt ++;
					System.out.println(amt +" Rs Debited from  SBI Account");
					System.out.println("Available total balance :" +BankMenu.SBIBal);
				}
				break;

			case "ICICI":

				if(amt >BankMenu.ICICBal ) {
					System.out.println(" In sufficent balance in ICICI  account, not able tp debit Rs" + amt);
					System.out.println("Available total balance :" +BankMenu.ICICBal);
					return;
				}
				else {
					BankMenu.ICICBal -= amt;
					BankMenu.ICICIDebitCnt ++;
					System.out.println(amt +" Rs Debited from  SBI Account");
					System.out.println("Available total balance :" +BankMenu.ICICBal);
				}
				break;
			case "HDFC":

				if(amt >BankMenu.HDFCBal ) {
					System.out.println(" In sufficent balance in ICICI  account, not able tp debit Rs" + amt);
					System.out.println("Available total balance :" +BankMenu.HDFCBal);
					return;
				}
				else {
					BankMenu.HDFCBal -= amt;
					BankMenu.HDFCDebitCnt ++;
					System.out.println(amt +" Rs Debited from  SBI Account");
					System.out.println("Available total balance :" +BankMenu.HDFCBal);
				}
				break;
			case "BOB":

				if(amt >BankMenu.ICICBal ) {
					System.out.println(" In sufficent balance in BOB account, not able tp debit Rs" + amt);
					System.out.println("Available total balance :" +BankMenu.BOBBal);
					return;
				}
				else {
					BankMenu.BOBBal -= amt;
					BankMenu.BOBDebitCnt ++;
					System.out.println(amt +" Rs Debited from  SBI Account");
					System.out.println("Available total balance :" +BankMenu.BOBBal);
				}
				break;
			default :
				System.out.println(bankName +" Invalid bank name :");
			}
		}
		else System.out.println("Please enter debit amout greater than 0 Rs ");
	}
}


