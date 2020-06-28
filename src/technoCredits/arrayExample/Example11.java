package technoCredits.arrayExample;

public class Example11 {

	void compareTwoArrays(int[] input1, int[] input2) {
		if(input1.length == input2.length) {
			for(int index=0;index<input1.length;index++) {
				if(input1[index] != input2[index]) {
					System.out.println("Arrays are not equal");
					return;
				}
			}
		}else {
			System.out.println("Arrays are not equal");
			return;
		}
		System.out.println("Arrays are equal"); //B
	}
	
	void compareTwoArrays1(int[] input1, int[] input2) {
		boolean flag = true;
		if(input1.length == input2.length) {
			for(int index=0;index<input1.length;index++) {
				if(input1[index] != input2[index]) {
					System.out.println(index);
					flag = false;
				}
			}
		}else {
			flag = false;
		}
		System.out.println(flag); // true
		
		if(flag == true)
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are not equal");
	}
	
	void compareTwoArrays2(int[] input1, int[] input2) {
		int status = 0;
		char ch = 'y';
		if(input1.length == input2.length) {
			for(int index=0;index<input2.length;index++) {
				if(input1[index] != input2[index]) {
					status = 1;
				}
			}
		}else {
			status = 1;
		}
		
		if(status == 0)
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are not equal");
	}
	public static void main(String[] args) {
		int[] num1 = {10,20,130,40};
		int[] num2 = {10,20,30,90};
		new Example11().compareTwoArrays(num1, num2);
		
	}
}
