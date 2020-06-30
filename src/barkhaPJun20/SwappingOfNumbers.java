package barkhaPJun20;

public class SwappingOfNumbers {
	//Without using third Variable
	void SwapNumbers(int num1,int num2) {
		
		int sum=num1+num2;               //sum=30
		num1=sum-num1;                   //num1=30-10
		num2=sum-num2;                   //num2=30-20
	
		System.out.println("Value of variable num1 after Swapping is: "+num1);
		System.out.println("Value of variable num2 after Swapping is: "+num2);
	}	
	//With using third variable
	void SwapNumbers2(int num1,int num2) {
		
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("Value of variable num1 after Swapping is: "+num1);
		System.out.println("Value of variable num2 after Swapping is: "+num2);
	}
	public static void main(String[] args) {
		SwappingOfNumbers swappingOfNumbers=new SwappingOfNumbers();
		int num1=10;
		int num2=20;
		swappingOfNumbers.SwapNumbers(num1,num2);
	}
}
