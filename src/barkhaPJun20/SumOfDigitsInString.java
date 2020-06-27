package barkhaPJun20;

public class SumOfDigitsInString {
	
	
	void addition(String name) {
	
		int num;
		int sum=0;
		for (int i=0; i<name.length(); i++) {
			char ch=name.charAt(i);  
			
			if (Character.isDigit(ch)) {
				String str=String.valueOf(ch);
				num=Integer.parseInt(str);
				sum=sum+num;
				
			}
			
		} System.out.println("Sum of Digits in Given String "+name +" is:"+sum);
		
	}
	
	public static void main(String[] args) {
		SumOfDigitsInString sumofdigits=new SumOfDigitsInString();
		String name="1HhQ9PR34";
		
		sumofdigits.addition(name);
	}

}
