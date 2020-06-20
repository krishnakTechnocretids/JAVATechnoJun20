package technoCredits;

public class SwitchEx1 {

	String getDayFromIndex(int dayIndex) {
		String dayName = "";
		if (dayIndex == 1) {
			dayName = "Monday";
		}
		else if (dayIndex == 2)
			dayName = "Tuesday";
		return dayName;
	}

	static void printDayWithSwitch(int dayIndex){
		switch(dayIndex) {
			case 1 : 
				System.out.println("Monday");
				break;
			case 2 :
				System.out.println("Tuesday");
				break;
			default :
				System.out.println("Invalid");
		}
	}
	
	static int debitCnt,creditCnt;
	static double balance;
	
	static void bankOp(String opName, double amount) {
		int mark = 92;
		switch(opName) {
			case "Debit" :
				if(balance >= amount) {
					balance -= amount;
					debitCnt++;
				}else
					System.out.println("Insufficient found");
				break;
			
			case "Credit" :
				for(int i=1;i<=7;i++) {
					switch(i) {
						case 1: System.out.println("MOnday");
							break;
						case 2 : 
					}	
				}
				balance += amount;
				creditCnt++;
				break;
		}
	}
	
	public String test(char ch) {
		switch(ch) {
			case 'A':
				return "Very Good";
			case 'B':
				return "Good";
			/*default:
				return "Failed";*/
		}
		 return "Think About it";
	}
	
	static void testDefaultCase(int index) {
			
		switch(index) {
			case 1:
				System.out.println("1");
				break;
			default :
				System.out.println("Default case");

			case 2:
				System.out.println("2");
				break;
		}
	}
	
	void bankOperation(String bankName, double amount, String operation){
		switch(bankName) {
			case "ICICI" :
				switch(operation) {
					case "Debit":
						//logic
						break;
					case "Credit":
						//logic
						break;
				}
			    break;
		}
	}
	
	public static void main(String[] args) {
		SwitchEx1.testDefaultCase(2);
	}
}






