package prashantCJune20;

public class Fibonacci {
	
	void series(int input) {
		int num1=0,num2=1,temp = 0;
		System.out.println("Fibonacci series for number "+input+"  is  ");
		for(int index=1;index<input;index++) {
			if(index<1)
				temp=index;
			else {
				temp = num1+num2;
				num1=num2;
				num2=temp;
		}
			System.out.println(temp);	
	}
}
		public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		fibonacci.series(10);
	}
}

