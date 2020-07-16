package barkhaPJun20;

public class AsciiConcept_SumOfNumInString {
	
	void sumOfNum(String str) {
		int sum=0;
		for (int index=0; index<str.length(); index++) {
			if (str.charAt(index)>=48 && str.charAt(index)<=57) {          //'0'=>ASCII 48==>Comparison with ASCII, 0 in char form
				//sum+=Character.getNumericValue(str.charAt(index));       //convert char to number
				sum+=str.charAt(index)-'0';                                // for 5 ASCII is 53, for 0 it is 48,(53-48)=5
			}
		}
		System.out.println("Sum of Numbers in Given String "+str+" is "+sum);
	}
	public static void main(String[] args) {
		new AsciiConcept_SumOfNumInString().sumOfNum("J7u9yj8hhhh1l8p4b7L3j61");  //7+9+8+1+8+4+7+3+6+1=54
	}		
}		