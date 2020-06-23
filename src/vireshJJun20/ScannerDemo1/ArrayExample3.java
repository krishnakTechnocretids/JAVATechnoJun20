package vireshJJun20.ScannerDemo1;

public class ArrayExample3 {
	

	void add(int[] num){
		int sum=0;
		for (int index=0; index<num.length; index++){
			 sum= sum + num[index];
		}
		System.out.println("Sum is: " + sum);
	}	

	public static void main(String[] args) {
			ArrayExample3 ArrayExample3 = new ArrayExample3();
			int[] num = new int[7];
			num[0] = 10;
			num[1] = 11;
			num[2] = 12;
			num[3] = 13;
			num[4] = 14;
			
			ArrayExample3.add(num);
			
		}	
	
}
