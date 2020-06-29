package kartikeyDJune20;

public class ArmstrongNumber {
	
	static void armstrongNum(int num) {
	int originalNum=num;
		int digit=0;
		do {
		digit=digit+((num%10)*(num%10)*(num%10));
		num=num/10;			
		} while (num>0);
	//	System.out.println(digit);
		if(digit==originalNum)
			System.out.println(originalNum+" is Armstrong number");
		else
			System.out.println(originalNum+" is not Armstrong number");		
	}
	public static void main(String[] args) {
		armstrongNum(153);
	}

}
