package yashCJun20.Assignment20;

public class ReverseNumber {
	

	public static void main(String[] args) {
		
		int number=12345;
		int revNumber=0;
		System.out.println("Reverse Number is");
		while (number!=0) {
			
			revNumber=number % 10;
			number=number/10;
			System.out.print(revNumber);
			
		}
		
	}

}