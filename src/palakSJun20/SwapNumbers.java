/*Program 1: Swap two numbers without using third variable.
Input: num1= 10, num2 =20
output: num1=20, num2 =10 */
package palakSJun20;

public class SwapNumbers {

	void swappingNumbersWithoutThirdVariable(int number1 , int number2){
		System.out.println("Number before Swapping -"+ "\nNumber1 : "+number1+"\nNumber2 : "+number2 );
//			number1 = number1 + number2;
//			number2 = number1 - number2;
//			number1 = number1 - number2;
		
		//Another Logic 
			number1 = number1 * number2; // 10*20 = 200
			number2 = number1 / number2; // 200/20 = 10
			number1 = number1 / number2; // 200/10 = 20
		
		System.out.println("\nNumber After Swapping -"+ "\nNumber1 : "+number1+"\nNumber2 : "+number2 +"\n" );
						
	}
	public static void main(String[] args) {
		SwapNumbers swapNumbers = new SwapNumbers();
		swapNumbers.swappingNumbersWithoutThirdVariable(10, 20);
		swapNumbers.swappingNumbersWithoutThirdVariable(50, 60);

	}

}
