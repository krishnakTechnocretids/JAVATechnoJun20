package maheshKJun20.NumbersExample;

public class CheckArmStrongNumber {
	
	void checkArmsStrongNum(int num) {
		//Method to check and Display a number is Armstrong Number or not
		int checkArmStrong = 0, temp = num;
		while (temp>0) {
			checkArmStrong += ((temp%10) * (temp%10) * (temp%10)) ;
			temp = temp/10;
		}
		if (num == checkArmStrong) {
			System.out.println(num + " is Armstrong Number");
		}else {
			System.out.println(num + " is Not Armstrong Number");
		}
	}
	
	public static void main(String[] args) {
		CheckArmStrongNumber checkArmStrongNumber = new CheckArmStrongNumber();
		int num = 153;
		checkArmStrongNumber.checkArmsStrongNum(num);
	}

}
