package abhijitMJun20;

public class Personaccounts {
	static int totalccreditcount,totaldebitcount;
	static int icicidebitcnt,icicicreditcnt,hdfcdebitcnt,hdfccreditcnt,bobdebitcnt,bobcreditcnt,sbidebitcnt,sbicreditcnt;
	static double  balanceICICI,balanceHDFC,balanceBOB,balanceSBI;
	
	void bankOperation(String bankName, double amount, String operation){
		switch(bankName) {
		case "ICICI" :
		switch(operation) {
		case "Debit":
			if(balanceICICI>=amount){
				balanceICICI -=amount;
				icicidebitcnt++;
				totaldebitcount++;
			}else {
				System.out.println("Balance is not available ");
		    }
		break;
		case "Credit":
			balanceICICI +=amount;
			icicicreditcnt++;
			totalccreditcount++;
		break;
		}
	  break;
	  
		case "HDFC" :
			switch(operation) {
			case "Debit":
				if(balanceHDFC>=amount){
					balanceHDFC -=amount;
					hdfcdebitcnt++;
					totaldebitcount++;
				}else {
					System.out.println("Balance is not available ");
			    }
			break;
			case "Credit":
				balanceHDFC +=amount;
				hdfccreditcnt++;
				totalccreditcount++;
			break;
			}
		break;
		
		case "BOB" :
			switch(operation) {
			case "Debit":
				if(balanceBOB>=amount){
					balanceBOB -=amount;
					bobdebitcnt++;
					totaldebitcount++;
				}else {
					System.out.println("Balance is not available ");
			    }
			break;
			case "Credit":
				balanceBOB +=amount;
				bobcreditcnt++;
				totalccreditcount++;
			break;
			}
		break;
		case "SBI" :
			switch(operation) {
			case "Debit":
				if(balanceSBI>=amount){
					balanceSBI -=amount;
					sbidebitcnt++;
					totaldebitcount++;
				}else {
					System.out.println("Balance is not available ");
			    }
			break;
			case "Credit":
				balanceSBI +=amount;
				sbicreditcnt++;
				totalccreditcount++;
			break;
			}
		break;
	}
  }
	double totalbalance()
	{    double totalbalanceaccounts=balanceICICI+balanceHDFC+balanceBOB+balanceSBI;
		return totalbalanceaccounts;
	}
	void individualbankcredit() {
		System.out.println("ICICI bank Credit Operation :" +icicicreditcnt +"\nHDFC bank Credit Operation : "+hdfccreditcnt +"\nSBI bank Credit Operation :"+sbicreditcnt+ "\nBOB bank Credit Operation :"+bobcreditcnt);
	}
    void individualbankdebit() {
    	System.out.println("\nICICI bank debit Operation :" +icicidebitcnt +"\nHDFC bank debit Operation : "+hdfcdebitcnt +"\nSBI bank debit Operation :"+sbidebitcnt+ "\nBOB bank debit Operation :"+bobdebitcnt);
	}

    void showtotalcreditdebit() {
    	System.out.println("Total credit operation : "+ totalccreditcount+ " times");
    	System.out.println("Total debit operation : "+ totaldebitcount+ " times\n");

    }
   static boolean returnStringMethod() 
    {        if(totalccreditcount>totaldebitcount) {
    	return true;
    	}else {
    		return false; }
    	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personaccounts personaallaccounts= new Personaccounts();
		personaallaccounts.bankOperation("ICICI", 1000, "Credit");
		personaallaccounts.bankOperation("ICICI", 800, "Debit");
		personaallaccounts.bankOperation("ICICI", 100, "Debit");
		personaallaccounts.bankOperation("HDFC", 1000, "Credit");
		personaallaccounts.bankOperation("HDFC", 800, "Debit");
		personaallaccounts.bankOperation("SBI", 2000, "Credit");
		personaallaccounts.bankOperation("SBI", 600, "Debit");
		personaallaccounts.bankOperation("SBI", 200, "Debit");
		personaallaccounts.bankOperation("BOB", 1000, "Credit");
		personaallaccounts.bankOperation("BOB", 500, "Debit");
		
		personaallaccounts.showtotalcreditdebit();
		personaallaccounts.individualbankcredit();
		personaallaccounts.individualbankdebit();
		System.out.println("\nTotal balance of all accounts is " +personaallaccounts.totalbalance());
        if(returnStringMethod())
        {
        	System.out.println("\nI appreciate your money management skill");
        }else {
        	System.out.println("\nPlease spend money wisely");
        }
	}

}
