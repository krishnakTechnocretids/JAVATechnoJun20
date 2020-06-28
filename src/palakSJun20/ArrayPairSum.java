package palakSJun20;

public class ArrayPairSum {
	void findArrayPairSum(int[] array){
		System.out.println("Integer numbers, whose sum is equal to value:7");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(array[i] + array[j] == 7 )
					System.out.println("(" + array[i] +"," + array[j] + ")");
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayPairSum arrayPairSum = new ArrayPairSum();
		int[] array = {2, 4, 3, 5, 7, 8, 9 , -1};
		arrayPairSum.findArrayPairSum(array);
	}

}
