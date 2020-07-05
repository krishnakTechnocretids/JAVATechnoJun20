package pranitaPJun20;

public class CodingExam4 {
	void findSecondMaxNumber(int[] array) {
		int firstMax= array[0];
		int secondMax=array[0];
		for(int index=1;index<array.length;index++) {
			if(firstMax<array[index]) {
				secondMax=firstMax;
				firstMax=array[index];
			}
			else if(array[index]>secondMax && array[index] != firstMax) {
				secondMax=array[index];
				
			}
		}
		System.out.println("Second Maximum value from given array is:"+secondMax);
	}
	
	public static void main(String[] args) {
		int[] array = {10,33,56,43,99,21};
		CodingExam4 codingExam4 = new CodingExam4();
		codingExam4.findSecondMaxNumber(array);
	}
}
