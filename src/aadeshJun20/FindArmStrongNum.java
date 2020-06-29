package aadeshJun20;

public class FindArmStrongNum{
	void ArmStrongNum(int num){

		int aNum = 0, temp = num;
		while (temp > 0) {
			aNum += ((temp % 10) * (temp % 10) * (temp % 10));
			temp = temp/10;
		}
		if (num == aNum){
			System.out.println(num + " is an Armstrong Number");
		} 	else {
			System.out.println(num + " is not an Armstrong Number");
		 }
	}
	public static void main(String[] args){
		FindArmStrongNum findArmStrongNum = new FindArmStrongNum();
		int num = 153;
		findArmStrongNum.ArmStrongNum(num);
	 }
}