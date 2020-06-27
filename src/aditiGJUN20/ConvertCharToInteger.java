package aditiGJUN20;

public class ConvertCharToInteger {
int sum=0; 
 	
 	// Method
 	void getSumOfConvertedChar(String name) {
 		for(int index=0;index<name.length();index++) {
 			char ch=name.charAt(index);
 			if(Character.isDigit(ch)) {
 				int number=Integer.parseInt(String.valueOf(ch));
 				sum=sum+number;
 			}
 		}
 		System.out.println("Sum is: "+sum);
 	}
 	
 	public static void main(String[] args) {
 		
 		String name="1Hh9PR34QP";
 		System.out.println("Input String: "+name);
 		
 		ConvertCharToInteger convertCharToInteger= new ConvertCharToInteger();
 		convertCharToInteger.getSumOfConvertedChar(name);
 		
 	}
}
