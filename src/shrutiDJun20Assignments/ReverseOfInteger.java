package shrutiDJun20Assignments;

public class ReverseOfInteger {
	
	void findReverse(int input){
		int number = 0;
		int number2 = input;
		
		while(number2>0){  //235
			number=number2%10;   //235%10=5
			number2=number2/10;
			System.out.print(number);
		}
	}
	public static void main(String[] args) {
		ReverseOfInteger reverseOfInteger = new ReverseOfInteger();
		reverseOfInteger.findReverse(235);
		//reverseOfInteger.findReverse(43567);
		
	}
}
