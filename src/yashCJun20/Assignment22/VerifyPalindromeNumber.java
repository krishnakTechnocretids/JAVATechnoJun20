package yashCJun20.Assignment22;
class VerifyPalindromeNumber{
	void toVerifyPalindromeNumberOrNot(int num){
		int remender;
		int reverseNumber=0;
		int originalNumber;
		originalNumber=num;
		while (num!=0)
			{
				remender=num%10;
				reverseNumber=reverseNumber*10+remender;
				num=num/10;
			}
			if (originalNumber==reverseNumber)
				System.out.println("Given number " + originalNumber+" is Palindrome");
			else
				System.out.println("Given number " + originalNumber+" is not Palindrome");
	        }
	public static void main (String[] args){
		
		VerifyPalindromeNumber verifyPalindromeNumber = new VerifyPalindromeNumber();
		verifyPalindromeNumber.toVerifyPalindromeNumberOrNot(45654);
		verifyPalindromeNumber.toVerifyPalindromeNumberOrNot(56789);
		}
	}