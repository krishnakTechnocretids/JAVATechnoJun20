package anshuKJun20;
/* String input = "1Hh9PR34QP";
Hint : 1+9+3+4 [all digits]
output : 17 */

public class Practice1 {
 void calPrimeNumber( String input) {
	 int add = 0;
		 for(int i =0;i<input.length();i++) {
			 char ch = input.charAt(i);
			 if(Character.isDigit(ch))
			 { 
				 String value = input.valueOf(ch);
				 int num = Integer.parseInt(value);
				 add +=  num;
			 }
			/* String value = input.valueOf(ch);
			// System.out.println(value);
			  for(int j =0;i<value.length();j++) {*/
				  
			    // if()
			 System.out.println(add);
			  }
		 }
	 
		 
 public static void main(String[] args) {
	
	 
	Practice1 practice1 = new Practice1();
	String input = "1Hh9PR34qp";
	practice1.calPrimeNumber(input);
	
 }	
	
}

