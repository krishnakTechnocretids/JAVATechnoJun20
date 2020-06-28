package aasthaJJun20;

public class IntegerPairSum {
	void findPairs(int[] input, int sum){
		System.out.println("Integer numbers, whose sum is equal to value: "+sum);
		for(int index=0; index<input.length; index++){
			for(int innerIndex = 0; innerIndex < input.length; innerIndex++){
				if(sum == input[index]+input[innerIndex])
					System.out.println("("+input[index]+","+input[innerIndex]+")");
			}
		}
	}
	
	public static void main(String[] args){
		IntegerPairSum integerPairSum = new IntegerPairSum();
		int[] arr = {2, 4, 3, 5, 7, 8, 9, -1};
		integerPairSum.findPairs(arr,7);
	}
}
