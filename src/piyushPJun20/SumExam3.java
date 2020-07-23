
public class SumExam3 {

	void findSum(int[] array,int num) {
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length; j++) {
				if(array[i]+array[j] == num) {
					System.out.println("(" + array[i] +"," + array[j] + ")");
					
				}
			}
		}
	}

	public static void main(String[] args) {
		SumExam3 sumexam = new SumExam3();
		int[] arr = {2, 4, 3, 5, 7, 8, 9 ,-1};
		int num=7;
		System.out.println(" Integer Numbers, Whose sum is equal to "+num+" are:");
		sumexam.findSum(arr,num);

	}

}