package vaishnaviVJun20_Coding_Exams;

public class SecondMax {
	
	void findSecondMaximumNum(int[] array) {
		int maxValue=0, secondMaxValue=0;
		
		for(int index=0;index<array.length;index++) {
			
			if(array[index] > maxValue) {
				 secondMaxValue = maxValue;
				 maxValue=array[index];
			}
			if(array[index] != maxValue && array[index] > secondMaxValue) {
				secondMaxValue = array[index];
			}
		}
		System.out.println("Largest value is: " +maxValue);
		System.out.println("Second Max value is: " +secondMaxValue);
	}

	public static void main(String[] args) {
		SecondMax secondMax = new SecondMax();
		int[] number = {10,33,56,43,99,21};
		secondMax.findSecondMaximumNum(number);
	}
}
