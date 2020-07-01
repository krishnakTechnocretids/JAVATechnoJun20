package prashantCJune20;

public class PalindromeNumber {	
	int temp=0,reverse;			
	void palin(int input) {
		for(int index=input;index>0;){			
			reverse = index%10;
			temp=(temp*10)+reverse;
			index=index/10;
			}		
	if (temp==input)System.out.println("Number is palindrome");
	else System.out.println("Number is not palindrom");	
}
		public static void main(String[] args) {
		PalindromeNumber palindrome = new PalindromeNumber();
		palindrome.palin(1221);
	}
}
