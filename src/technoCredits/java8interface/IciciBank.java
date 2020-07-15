package technoCredits.java8interface;

public class IciciBank implements Bank,RBI{

	@Override
	public void credit(int amount) {
		System.out.println("ICICI Bank credit");
	}

	@Override
	public void debit(int amount) {
		System.out.println("ICICI Bank debit");
	}

	@Override
	public void printStatement() {
		System.out.println("ICICI Bank Print Statement");
	}
	
	@Override
	public void processGST() {
		System.out.println("ICICI Process GST");
		
	}
	static public void maxDebitLimit() {
		
	}
}
