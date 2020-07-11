package barkhaPJun20;

public class SumOfNumInStringInConsecutiveFormat {
	String temp="";
	int sum=0;
	
	void sumOfNumInString(String input) {
		for (int index=0; index<input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				temp+=input.charAt(index);            
			}else
				if (temp.length()!=0) {
				sum+=Integer.parseInt(temp); 
				temp="";
				}
		}
		if (temp.length()!=0) 
			sum+=Integer.parseInt(temp); 	
		System.out.println("Sum of numbers is: "+sum);		
	}
	public static void main(String[] args) {
		SumOfNumInStringInConsecutiveFormat sumOfNum =new SumOfNumInStringInConsecutiveFormat ();
		sumOfNum.sumOfNumInString("P71Rr29T2E2");    //71+29+2+2
		//sumOfNum.sumOfNumInString("P71Rr29T2E");     //71+29+2
		//sumOfNum.sumOfNumInString("71Rr29T2E2");     //71+29+2+2
		}
}