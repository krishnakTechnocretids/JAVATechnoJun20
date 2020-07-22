package technoCredits.exceptionExample;

public class Example4 {
	void verifyException(int number) { //3
		try {
			System.out.println(1); // 1 
			int answer = 10/number;  // answer = 1
			System.out.println(answer);  //1
			System.out.println(2); // 
			Example3 ex3 = null;//
			System.out.println(4);//
			ex3.verifyException(10);
			System.out.println(5);
			
		}
		catch(Exception e) {
			System.out.println("");
		}
		System.out.println(6); //8
	}
	
	
	public static void main(String[] args) {
		System.out.println(0); // 1
		new Example4().verifyException(10); //2
		System.out.println(7); // 9
	}
}
