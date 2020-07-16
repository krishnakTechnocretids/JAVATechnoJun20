package archanaNJun20;
public class NumberSumUsingASCII {
	void printSumOfNumber(String input){
		int sum=0;
		for (int index=0;index<input.length();index++){
			int numberAscii = input.charAt(index);
			if(numberAscii>='0' && numberAscii<='9')
			{
				sum+=input.charAt(index)-'0';
			}
		}System.out.println("Sum of all numbers in String is : "+sum);	
	}
	public static void main(String[] args){
		NumberSumUsingASCII numberSumUsingASCII	=new NumberSumUsingASCII();
		numberSumUsingASCII.printSumOfNumber("J7u9y8h1h8j4b7j3j6");
	}
}
