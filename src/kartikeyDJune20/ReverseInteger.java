package kartikeyDJune20;

public class ReverseInteger {
	static void integerReverse(int num) {
		int revnum=0;
		while(num>0) {
			revnum=(revnum*10)+(num%10);
			num=num/10;		
		}
		System.out.println("Reverse of provided no. is "+revnum);		
	}
	public static void main(String[] args) {
		integerReverse(12345);
	}

}
