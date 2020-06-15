/*On user define range print all even numbers.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
Output : Even numbers are:
		 10
		 12
		 14*/
package shrutiDJun20;

public class EvenNumbers {
	
	void printEven(int start,int end){
		for(int i=start;i<=end;i++){
			if(i%2==0)
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		EvenNumbers evenNumbers= new EvenNumbers();
		evenNumbers.printEven(10, 15);
				
	}

}
