package shrutiDJun20Assignments;

public class ReverseOfInteger {
	
	void findReverse(int input){
		int number2 = input;
		int revnum = 0;
		while(number2>0){  //235
			//number=number2%10;   //235%10=5
			//number2=number2/10;
			
			revnum = (revnum*10)+(number2%10);
			number2 = number2/10;
			
		}
		System.out.print("Reverse of integer " +12345 +" --> "+revnum);
	}
	public static void main(String[] args) {
		ReverseOfInteger reverseOfInteger = new ReverseOfInteger();
		//reverseOfInteger.findReverse(235);
		reverseOfInteger.findReverse(12345);
		
	}
}
