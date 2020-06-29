package rajAJun20;

public class DuplicateNumbers {

	void findDuplicateNumberOfArray(int [] number) {
		for(int index = 0 ; index < number.length ; index++) {
			for(int i = index+1 ; i < number.length ; i++ ) {
				if(number[index] == number[i]) {
					System.out.println(number[i]+ " : is duplicate number in given array ");
				}
			}
		}
	}

	public static void main(String[] args) {
		DuplicateNumbers duplicateNumber = new DuplicateNumbers();
		
		int[] array = {0,3,1,2,3};
		 
		duplicateNumber.findDuplicateNumberOfArray(array);
	}
}
