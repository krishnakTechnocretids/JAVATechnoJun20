package suparnaNJune20;

public class BankMenuSpecificAccBal {
	
	
	
	 static void  getBal(String bankName)
	{
		switch (bankName) {
		case "SBI":
			System.out.println("Total Available Balnace = " +BankMenu.SBIBal);
			break;
		case "ICICI":
			System.out.println("Total Available Balnace = " +BankMenu.ICICBal);
			break;
		case "HDFC":
			System.out.println("Total Available Balnace = " +BankMenu.HDFCBal);
			break;
		case "BOB":
			System.out.println("Total Available Balnace = " +BankMenu.BOBBal);
			break;
			default:
				System.out.println("You have enetred invalida bank name \n Please Enter Correct bank Name AS SBI,ICICI, HDFC, BOB");
				
		}
	}
}
