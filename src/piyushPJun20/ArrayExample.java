package piyushPJun20;

public class ArrayExample {
	
	void add (int[] num) {
		int sum = 0;
		for(int index = 0; index < num.length; index++){
			sum = sum + num[index];
		}
		System.out.println("Total Sum is " + sum);
	}
	
	public static void main(String[] args) {
		ArrayExample arrayExample = new ArrayExample();
		int[] num = new int[5];
		num[0] = 10;
		num[1] = 11;
		num[2] = 12;
		num[3] = 13;
		num[4] = 14;
		
		arrayExample.add(num);
		
	}

}
