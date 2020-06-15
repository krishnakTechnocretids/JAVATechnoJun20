package palakSJun20;

/*1. Create a class named as Mall, which contains below methods 
a. itemAddedToCart()
b. customerName()
c. paymentDoneUsing()
	i. Visa Card ii. Cash
d. displayCutomerInfo()
e. needBill()
f. haveCarryBag()
g. decideSection()

i.e. console should print: Harsh buys 12 items and payment done using visa card in section 1B

Expectations:
• If items are less than 10 and payment done using cash, then send customer to section 1A
• If items are more than 10 and payment done using visa card, then send customer to section 1B
• If items are more than 10 and payment done using cash, then send customer to section 1C
• If items are less than 10 and payment done using visa card, then send customer to section 1D */

class Mall
{
	String customerName , payMethod , dSection , b , cb;
	int totalItem;
	boolean bill , carryBag;

	void itemAddedToCart(int totalItem)
	{
		this.totalItem = totalItem;
	}
	void customerName(String customerName )
	{
		this.customerName = customerName;
	}
	void paymentDoneUsing(String payMethod)
	{
		this.payMethod = payMethod;
	}
	void displayCutomerInfo(){
		System.out.println(customerName + " buys " + totalItem + " item " + "and Payment done using " + payMethod + " in " + dSection);
		System.out.print("Customer Need bill : " + b + "\nCustomer Have Carry Bag : " +cb);
	}
	void needBill(boolean bill){
		this.bill = bill;
		if(bill == true)
			b = "Yes";
		else
			b = "No";
	}
	void haveCarryBag(boolean carryBag){
		this.carryBag = carryBag;
		if(carryBag == true)
			cb = "Yes";
		else
			cb = "No";
	}
	void decideSection(){
		if(totalItem < 10 && payMethod.equals("Cash"))
			dSection = "section 1A";
		else if(totalItem > 10 && payMethod.equals("Visa"))
			dSection = "section 1B";
		else if(totalItem > 10 && payMethod.equals("Cash"))
			dSection = "section 1C";
		else
			dSection = "section 1D";
	}

	public static void main(String[] args){
		Mall mall = new Mall();
		mall.customerName("Harsh");
		mall.itemAddedToCart(8);
		mall.paymentDoneUsing("Visa");
		mall.decideSection();
		mall.needBill(true);
		mall.haveCarryBag(false);
		mall.displayCutomerInfo();
	}	
}
	