package technoCredits.java8interface;

public class Test {

	public static void main(String[] args) {
		Bank iciciBank = new IciciBank();
		iciciBank.processGST();
		
		Bank hdfcBank = new HdfcBank();
		hdfcBank.processGST();
		
		Bank.maxDebitLimit();
	}
}
