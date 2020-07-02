package archanaNJun20;

public class PalindromeNumber {

	void printPalindromeNumber(int number){
		int oNumber=number;
		int rev=0;
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
		palindromeNumber.printPalindromeNumber(45654);
		palindromeNumber.printPalindromeNumber(56789);
	}
}