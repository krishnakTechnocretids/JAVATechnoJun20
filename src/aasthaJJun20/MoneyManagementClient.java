package aasthaJJun20;

public class MoneyManagementClient {
	public static void main(String[] args){
		MoneyManagement moneyManagement = new MoneyManagement();
		
		moneyManagement.setBalance(500,1000,2000,500000);
		
		for(int i=0;i<2;i++){ 
			moneyManagement.bankOperation("ICICI",1000,"Credit");
			moneyManagement.bankOperation("HDFC",2000,"Credit");
			moneyManagement.bankOperation("BOB",1000,"Credit");
			moneyManagement.bankOperation("SBI",1000,"Credit");
			moneyManagement.bankOperation("ICICI",10000,"Debit");
			moneyManagement.bankOperation("HDFC",200,"Debit");
			moneyManagement.bankOperation("BOB",500,"Debit");
			moneyManagement.bankOperation("SBI",500,"Debit");
		}
		
		moneyManagement.bankOperation("Swiss",50000,"Debit");
		
		moneyManagement.displayIndividualBankCredits("All Banks");
		moneyManagement.displayIndividualBankDebits("All Banks");
		
		moneyManagement.displayIndividualBankCredits("ICICI");
		moneyManagement.displayIndividualBankDebits("HDFC");
		
		moneyManagement.displayIndividualBankCredits("Allahbad");
		moneyManagement.displayIndividualBankDebits("PNB");
		
		moneyManagement.displayTotalCreditsDebits();
		moneyManagement.displayTotalBalance();
		System.out.println(moneyManagement.displayMessage());
	}
}
