package technoCredits.java8interface;

public interface Bank {

	void credit(int amount);
	void debit(int amount);
	void printStatement();
	default void processGST() {
		System.out.println("GST PROCESSING");
	}
	default void processGST2() {
		System.out.println("GST PROCESSING");
	}
	default void processGST3() {
		System.out.println("GST PROCESSING");
	}
	static void maxDebitLimit() {
		System.out.println("Not more then 50k");
	}
	
}
