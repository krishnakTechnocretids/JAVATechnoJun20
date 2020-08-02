package aavrutiDJun20;

public class RotateStringAndCompare {

	static void stringRotation(String input1,String input2) {
		if(!input1.equals(input2))
			for(int index=0;index<input1.length();index++) {
				input1 = input1.substring(input1.length()-1) + input1.substring(0,input1.length()-1);
				System.out.println(input1);
				if(input1.equals(input2)) {
					System.out.println("Iteration --> " + (index+1));
					break;
				}
			}
		else {
			System.out.println("Both input are same iteration required 0");
		}
	}

	public static void main(String[] args) {
		String input1 = "abcdef";
		String input2 = "defabc";
		stringRotation(input1,input2);
	}
}
