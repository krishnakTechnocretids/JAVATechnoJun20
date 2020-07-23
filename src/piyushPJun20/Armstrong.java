package piyushPJun20;

public class Armstrong {
	void ArmstrongNum(int num) {

		int aNum = 0, temp = num;
		while (temp > 0) {
			aNum += ((temp % 10) * (temp % 10) * (temp % 10));
			temp = temp / 10;
		}
		if (num == aNum) {
			System.out.println(num + " is Armstrong Number");
		} else {
			System.out.println(num + " is Not Armstrong Number");
		}
	}

	public static void main(String[] args) {
		Armstrong armstrong = new Armstrong();
		int num = 153;
		armstrong.ArmstrongNum(num);
	}
}
