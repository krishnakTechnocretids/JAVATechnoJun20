package barkhaPJun20;

public class ReverseInteger {
	
	void printReverseInt(int originalNumber) {
		//just for printing in reverse order
		int num=originalNumber;
		System.out.println("Reverse of Number: "+originalNumber);
		while(num>0) {
			int lastDigit=num%10;   //5
			num=num/10;            //1234
			System.out.print(lastDigit); //it will print 5 then 4 and so on... it is just printing no calculation
		}	
	}	
	void printReverseInt2(int originalNumber) {
		//Printing reverse order by exact Calculation
		int num=originalNumber;
		int reverse=0;
		while(num>0) {
			int lastDigit=num%10;
			reverse=(reverse*10)+lastDigit;  //it will reverse number by calculation like 5 then 54 then 543 and so on
			num=num/10;
		}
		System.out.println("Reverse of number "+originalNumber + " is: "+reverse);
	}
	public static void main(String[] args) {
		ReverseInteger reverseInteger=new ReverseInteger();
		int number=12345;
		reverseInteger.printReverseInt2(number);
	}
}
