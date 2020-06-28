package barkhaPJun20;

public class ReverseInteger {
	
	void printReverseInt(int originalNumber) {
		int num=originalNumber;
		System.out.println("Reverse of Number: "+originalNumber);
		
		while(num>0) {
		int lastDigit=num%10;   //5
		num=num/10;            //1234
		
		 System.out.print(lastDigit); //it will print 5 then 4 and so on... it is just printing no calculation
		}
	}	
	public static void main(String[] args) {
		ReverseInteger reverseInteger=new ReverseInteger();
		int number=12345;
		reverseInteger.printReverseInt(number);
	}
}
