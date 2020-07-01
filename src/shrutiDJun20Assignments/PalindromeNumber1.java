package shrutiDJun20Assignments;

public class PalindromeNumber1 {
	 void numberPalindromeCheck(int input){
		 int num = input;
		 int rev = 0;
		  while(num>0){
			  rev = (rev*10)+(num%10);
			  num = num/10;
		  }
		  if(input == rev)
				System.out.println("Given number '"+input +"' is Palindrome");	
			else
				System.out.println( "Given number '"+input +"' is not Palindrome");	
	 }

public static void main(String[] args) {
	PalindromeNumber1 palindromeNumber = new PalindromeNumber1();
	palindromeNumber.numberPalindromeCheck(45654);
	palindromeNumber.numberPalindromeCheck(56789);
}
}
