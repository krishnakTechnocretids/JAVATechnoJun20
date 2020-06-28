/*String input = "1Hh9PR34QP";
Hint : 1+9+3+4 [all digits]
output : 17
To convert char to Integer.
Points to be remember:
1) String can be converted to int but there is no direct method to convert char to int
2) char has to be coverted first to string and then to interger.*/

package amitaRJun20;

public class SumOfDigitsInString {
	
	void digitSumString(String name) {
		
        int sum=0;  
 
        for(int i=0;i<name.length();i++)  
        { 
        	 char ch=name.charAt(i); 
        	 if (Character.isDigit(ch)) {
        		 String temp=String.valueOf(ch);
        		 int number=Integer.parseInt(temp);
        		 sum=sum+number;
        	 }
        }  	
        System.out.println("Sum of all digits in String is :"+sum);
	}

	public static void main(String[] args) {
		SumOfDigitsInString sumOfDigits=new SumOfDigitsInString();
		String input="1Hh9PR34QP";
		System.out.println("The Input String is "+input);
		sumOfDigits.digitSumString(input);		

	}

}
