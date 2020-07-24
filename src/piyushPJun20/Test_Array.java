package piyushPJun20;
public class Test_Array {
	
	void add (int[] num) {
		int sum = 0;
		for(int index = 0; index < num.length; index++){
			sum = sum + num[index];
		}
		System.out.println("Total Sum is " + sum);
	}
	
	public static void main(String[] args) {
		Test_Array testArray = new Test_Array();
		int[] num = new int[3];
		num[0] = 10;
		num[1] = 11;
		num[2] = 12;
		
		testArray.add(num);
		
	}

}
