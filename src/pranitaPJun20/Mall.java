package pranitaPJun20;

public class Mall {
	String customerName;
	int totalItems;
	String paymentWay;
	String sectionName;
	String billStatus;
	String carryBagStatus;
	
	void itemAddedToCart(int allItems){
		totalItems=allItems;
	}	
	
	void customerName(String custName){
		customerName=custName;
	}
	
	void paymentDoneUsing(String paymentMode){
		paymentWay=paymentMode;
	}
	
	void needBill(String bill){
		billStatus=bill;
	}
	
	void haveCarryBag(String carryBag){
		carryBagStatus=carryBag;
	}
	
	void decideSection()
	{
		if (totalItems<10 && paymentWay.equals("Cash"))
			sectionName="section 1A";
		
		else if (totalItems>10 && paymentWay.equals("visa card"))
			sectionName="section 1B";
		
		else if (totalItems>10 && paymentWay.equals("Cash"))
			sectionName="section 1C";
		
		else if(totalItems<10 && paymentWay.equals("visa card"))
			sectionName="section 1D";
		/*else
			sectionName="section 1D";
		*/
	}
	
	void displayCutomerInfo(){
		System.out.println(customerName+" buys "+totalItems+" items and payment done using "+paymentWay+" in " +sectionName );
		System.out.println("Customer "+customerName+ " needs carrybag:"+carryBagStatus);
		System.out.println("Customer "+customerName+ " needs printed bill:"+billStatus);
	}
	
	public static void main(String[] args){
		Mall mall = new Mall();
		mall.itemAddedToCart(12);
		mall.customerName("Harsh");
		mall.paymentDoneUsing("visa card");
		mall.haveCarryBag("No");
		mall.needBill("Yes");
		mall.decideSection();
		mall.displayCutomerInfo();	
	}
}
