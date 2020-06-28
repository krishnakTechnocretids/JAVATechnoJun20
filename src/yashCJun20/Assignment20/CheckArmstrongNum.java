package yashCJun20.Assignment20;

public class CheckArmstrongNum {

	public static void main(String[] args) {
		
		int number=153;
		int reminder=0;
		int sum=0;
		int num=0;
		num=number;
		while (number!=0) {
		
			reminder=number % 10;
			number=number/10;
			sum=sum+(reminder*reminder*reminder);
			
		}
		System.out.println(sum);
		if (sum==num)
			System.out.println("The number is Armstrong Number ");
		else
			System.out.println("The number is not Armstrong Number ");
		
	}
	}