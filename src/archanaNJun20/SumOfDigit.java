package archanaNJun20;

public class SumOfDigit {
	void printSumOfDigit(String input){
		int sum=0;
		for(int index=0;index<input.length();index++){
			if(Character.isDigit(input.charAt(index))){
				String charactertostring=String.valueOf(input.charAt(index));
				int stringtointeger=Integer.parseInt(charactertostring);
				sum+=stringtointeger;
			}
		}
		System.out.println("Sum of digit is "+sum);
	}
	public static void main(String[] args) {
		SumOfDigit sumOfDigit=new SumOfDigit();
		sumOfDigit.printSumOfDigit("J7yu9y8h1h8j4b7j3jjb6");
	}
}