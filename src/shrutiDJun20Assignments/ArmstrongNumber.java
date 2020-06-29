package shrutiDJun20Assignments;

public class ArmstrongNumber {
	
	void isNumberArmstrong(int input){
	//number that is equal to the sum of cubes of its digits
		//1^3 + 5^3 + 3^3 = 153
		int sum = 0;
		int num=0;
		int num2=input;
		while(num2>0){
			num= (num2%10);     //153%10=3(num)   //5=15%10    //1=1%10
			sum = (sum+(num*num*num));      // 9=0+9   //    152=27+125    //  153= 152 +1
			num2 = (num2/10);     // 15=153/10  //     1=15/10   //  0=1/10
		}
		
		if (input==sum)
			System.out.println(input +" is an armstrong number");
		else
			System.out.println(input +" is not an armstrong number");
	}

	public static void main(String[] args) {
		ArmstrongNumber armstrongNumber = new ArmstrongNumber();
		armstrongNumber.isNumberArmstrong(153);
		armstrongNumber.isNumberArmstrong(191);
		armstrongNumber.isNumberArmstrong(371);
	}
}
