package rajAJun20;

public class ArmstrongNumber {
	
	void findIsNumberArmstrong(int input){
		int actualNumber = input ;
		int sum = 0;
		while(input > 0) {
			int num = input % 10 ;
			input = input / 10;
			int result = num*num*num ;
			sum = sum + result; 
	}
		if(sum == actualNumber) {
			System.out.println(actualNumber + " is an Armstrong number");
		} else {
			System.out.println(actualNumber + " is not an Armstrong number");
		}
	}

		public static void main(String[] args) {
			ArmstrongNumber armstrongNumber = new ArmstrongNumber();
			
			int number = 153;
			armstrongNumber.findIsNumberArmstrong(number);
		}
}
