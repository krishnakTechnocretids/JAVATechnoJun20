package vaishnaviVJun20_arrayExamples;

//Find duplicate number on Integer array in Java?

public class DuplicateNumbers {
	
	void findDuplicateNumber(int[] array) {
		for(int index=0;index<array.length;index++) {
			for(int i = index+1;i<array.length;i++) {
				if(array[index] == array[i])
					System.out.println("Duplicate number is: " +array[i]);
			}
		}
	}

	public static void main(String[] args) {
		DuplicateNumbers duplicateNumbers = new DuplicateNumbers();
        int[] array = {0,3,1,2,3};
        duplicateNumbers.findDuplicateNumber(array);
	}

}
