package technoCredits.exceptionExample;

public class Example3 {
	void verifyException(int number) { //3
		try {
			System.out.println(1); //4
			int answer = 10/number; //5
			System.out.println(answer); 
			System.out.println(2);
		}catch(NullPointerException ae) { //6
			System.out.println(3); //7
		}
		System.out.println(4); //8
	}
	
	
	public static void main(String[] args) {
		System.out.println(0); // 1
		new Example3().verifyException(0); //2
		System.out.println(5); // 9
	}
}
