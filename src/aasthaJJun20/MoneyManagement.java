package aasthaJJun20;

public class MoneyManagement {
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
			case "ICICI" :
				switch(operation) {
					case "Debit":
						if(iciciBalance < amount)
							System.out.println("\nInsufficient Balance, you cannot withdraw from ICICI account");
						else{
							iciciBalance -= amount;
							countIciciDebits++;
							countAllDebits++;
						}
						break;
					case "Credit":
						if(amount == 0)
							System.out.println("\nYou cannot credit 0 amount");
						else{
							iciciBalance += amount;
							countIciciCredits++;
							countAllCredits++;
						}
						break;
				}
				break;
			case "HDFC" :
				switch(operation) {
					case "Debit":
						if(hdfcBalance < amount)
							System.out.println("\nInsufficient Balance, you cannot withdraw from HDFC account");
						else{
							hdfcBalance -= amount;
							countHdfcDebits++;
							countAllDebits++;
						}
						break;
					case "Credit":
						if(amount == 0)
							System.out.println("\nYou cannot credit 0 amount");
						else{
							hdfcBalance += amount;
							countHdfcCredits++;
							countAllCredits++;
						}
						break;
				}
				break;
			case "BOB" :
				switch(operation) {
					case "Debit":
						if(bobBalance < amount)
							System.out.println("\nInsufficient Balance, you cannot withdraw from BOB account");
						else{
							bobBalance -= amount;
							countBobDebits++;
							countAllDebits++;
						}
						break;
					case "Credit":
						if(amount == 0)
							System.out.println("\nYou cannot credit 0 amount");
						else{
							bobBalance += amount;
							countBobCredits++;
							countAllCredits++;
						}
						break;
				}
				break;
			case "SBI" :
				switch(operation) {
					case "Debit":
						if(sbiBalance < amount)
							System.out.println("\nInsufficient Balance, you cannot withdraw from SBI account");
						else{
							sbiBalance -= amount;
							countSbiDebits++;
							countAllDebits++;
						}
						break;
					case "Credit":
						if(amount == 0)
							System.out.println("\nYou cannot credit 0 amount");
						else{
							sbiBalance += amount;
							countSbiCredits++;
							countAllCredits++;
						}
						break;
				}
				break;
			default :
				System.out.println("\nYou cannot credit/debit. You don't have account in "+bankName+" bank");
		}
	}
	void displayTotalBalance(){
		System.out.println("\nTotal Balance in your accounts is: "+(iciciBalance+hdfcBalance+bobBalance+sbiBalance));
	}
	
	void displayTotalCreditsDebits(){
		System.out.println("\nTotal Credit operation on your accounts :"+countAllCredits+" times");
		System.out.println("Total Debit operation on your accounts :"+countAllDebits+" times");
	}
	
	void displayIndividualBankCredits(String bankName){
		switch(bankName){
			case "ICICI" :
				System.out.println("ICICI bank Credit Operation : "+countIciciCredits);
				break;
			case "HDFC" :
				System.out.println("HDFC bank Credit Operation : "+countHdfcCredits);
				break;
			case "BOB" :
				System.out.println("BOB bank Credit Operation : "+countBobCredits);
				break;
			case "SBI" :
				System.out.println("SBI bank Credit Operation : "+countSbiCredits);
				break;
			case "All Banks" : 
				System.out.println("\nICICI bank Credit Operation : "+countIciciCredits);
				System.out.println("HDFC bank Credit Operation : "+countHdfcCredits);
				System.out.println("BOB bank Credit Operation : "+countBobCredits);
				System.out.println("SBI bank Credit Operation : "+countSbiCredits);
				break;
			default :
				System.out.println("\nYou don't have account in "+bankName+" bank");
		}
	}	
	void displayIndividualBankDebits(String bankName){
		switch(bankName){
			case "ICICI" :
				System.out.println("ICICI bank Debit Operation : "+countIciciDebits);
				break;
			case "HDFC" :
				System.out.println("HDFC bank Debit Operation : "+countHdfcDebits);
				break;
			case "BOB" :
				System.out.println("BOB bank Debit Operation : "+countBobDebits);
				break;
			case "SBI" :
				System.out.println("SBI bank Debit Operation : "+countSbiDebits);
				break;
			case "All Banks" : 
				System.out.println("\nICICI bank Debit Operation : "+countIciciDebits);
				System.out.println("HDFC bank Debit Operation : "+countHdfcDebits);
				System.out.println("BOB bank Debit Operation : "+countBobDebits);
				System.out.println("SBI bank Debit Operation : "+countSbiDebits);
				break;
			default :
				System.out.println("\nYou don't have account in "+bankName+" bank");
		}
	}
	String displayMessage(){
		if(countAllCredits >= countAllDebits)
			return "*****I appreciate your money management skill*****";
		else
			return "*****Please spend money wisely*****";
	}

}
