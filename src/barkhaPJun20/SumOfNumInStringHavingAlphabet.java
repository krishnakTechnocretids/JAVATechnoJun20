package barkhaPJun20;

public class SumOfNumInStringHavingAlphabet {
	int sum=0;
	int sumOfNumbers(String numberString) {
		for (int index=0; index<numberString.length(); index++) {
			if (Character.isDigit(numberString.charAt(index)))     //'7' =>digit in character form
				sum+=Integer.parseInt(String.valueOf(numberString.charAt(index)));  //this is to convert char 7 to String 7 because parseInt(convert String 7 to int 7) is applicable to String only.
			}
		return sum;
	}	
	public static void main(String[] args) {
		SumOfNumInStringHavingAlphabet sumOfNumInStringHavingAlphabet=new SumOfNumInStringHavingAlphabet();
		String str="J7yu9y8h1h8j4b7j3jjb6";
		System.out.println("Sum of numbers in string "+str+" is: "+sumOfNumInStringHavingAlphabet.sumOfNumbers(str));
	}
}					