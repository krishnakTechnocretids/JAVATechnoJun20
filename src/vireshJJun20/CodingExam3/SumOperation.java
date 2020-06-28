package vireshJJun20.CodingExam3;

public class SumOperation {

	void sumCheck(int[] input, int gNum) {

		for (int i=0; i< input.length; i++){
			for (int j =0; j<input.length; j++) {
				if(input[i]+input[j]==gNum) {
					System.out.println("(" + input[i] +"," + input[j] + ")");
				}
			}
		}	
	}
	
	public static void main(String[] args) {
		SumOperation sumOperation= new SumOperation();
		int[] arr= {2, 4, 3, 5, 7, 8, 9 ,-1};
		int num=7;
		sumOperation.sumCheck(arr, num);
	}
}
