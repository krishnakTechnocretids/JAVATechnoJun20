package vaishnaviVJun20_arrayExamples;

//WAP to check if a number is Armstrong or not.

public class Armstrong {
	
	void findIfNumberIsArmstrong(int input) {
		int Originalnumber = input;
		int sum =0;
		while(input>0) {
			sum += Math.pow((input % 10), 3);
			input = input/10;
		}	
		if(sum == Originalnumber)
			System.out.println(Originalnumber +" is a armstrong number");
		else
			System.out.println(Originalnumber +" is not a armstrong number");
	}

	public static void main(String[] args) {
		Armstrong armstrong = new Armstrong();
		int input = 153;
		armstrong.findIfNumberIsArmstrong(input);
	}
}