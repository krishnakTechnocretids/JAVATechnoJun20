package archanaNJun20;

public class ReversNumber{
	void printReversNumber(int number){
		int lastdigit=0;
		int rev=0;
		while(number>0){
			lastdigit=number%10;
			rev=(rev*10)+lastdigit;
			number=number/10;
		} 
		System.out.print("Revers numebr is :"+ rev);
	}
	public static void main(String[] args) {
		ReversNumber reversNumber=new ReversNumber();
		int number=12345;
		reversNumber.printReversNumber(number);
	}
}