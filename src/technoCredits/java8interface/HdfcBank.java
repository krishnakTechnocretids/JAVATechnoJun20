package technoCredits.java8interface;

public class HdfcBank implements Bank{

	@Override
	public void credit(int amount) {
		System.out.println("HDFC Bank credit");
	}

	@Override
	public void debit(int amount) {
		System.out.println("HDFC Bank debit");
	}

	@Override
	public void printStatement() {
		System.out.println("HDFC Bank Print Statement");
	}
}
