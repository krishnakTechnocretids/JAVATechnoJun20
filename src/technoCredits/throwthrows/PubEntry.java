package technoCredits.throwthrows;

public class PubEntry {

	void canEnter(int age) throws InterruptedException {
		if(age<18)
		{
			throw new InterruptedException();
		}else {
			System.out.println("Welcome");
			throw new InterruptedException("I have generated this");
		}
	}
	
	
	public static void main(String[] args) {
		PubEntry pubEntry = new PubEntry();
		try {
			pubEntry.canEnter(17);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End");
	}
}
