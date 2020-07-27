package technoCredits.customException;

public class Test {

	void m1(int age) throws AgeNotValidException {
		if(age < 18)
			throw new AgeNotValidException("Age is not valid, user age is "+ age);
		System.out.println("Welcome");
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		try {
			test.m1(15);
		} catch (AgeNotValidException e) {
			System.out.println(e);
		}
	}
	// getClass() +.+getName() + getMessage()
}
