package archanaNJun20;

public class ArmstrongNumber {
	static void printArmstrongNumber(int number){
		int oNumber=number;
		int lastdigit=0;
		int cubeAddition=0;
		while(number>0){
			lastdigit=number%10;
			number=number/10;
			cubeAddition=cubeAddition+(lastdigit*lastdigit*lastdigit);
		}
		if(oNumber==cubeAddition)
			System.out.println(oNumber+" Number is Armstrong Number ");
		else
			System.out.println(oNumber+ " Number is not Armstrong Number ");
	}
	public static void main(String[] args){
		//int number=153;
		printArmstrongNumber(154);
	}
}