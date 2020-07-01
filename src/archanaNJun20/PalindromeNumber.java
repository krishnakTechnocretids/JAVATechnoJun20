package archanaNJun20;

public class PalindromeNumber {
	int rev=0;
	void palindromeNumber(int number){
		int oNumber=number;
		while(number>0){
			int mod=number%10;
			rev=(rev*10)+mod;
			number=number/10;
		}	
		if(oNumber==rev)
			System.out.println("Given number : "+ oNumber +" is palindrome");
		else
			System.out.println("Given number : "+ oNumber +" is not palindrome");
	}
	public static void main(String[] args) {
		PalindromeNumber palindromeNumber=new PalindromeNumber();
		palindromeNumber.palindromeNumber(45654);
		palindromeNumber.palindromeNumber(56789);
	}
}