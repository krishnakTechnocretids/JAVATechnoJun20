package barkhaPJun20;

public class FindDuplicateNumInArray {
	
	void printDuplicateNumInArray(int[] num) {
		for (int i=0; i<num.length; i++) {
			for (int j=i+1;j<num.length; j++) {
				if (num[i]==num[j]) {
				System.out.println("Repeated Number in String is: "+num[j]);
				}
			}
		}	
	}
	public static void main(String[] args) {
		FindDuplicateNumInArray findDuplicateNumInArray=new FindDuplicateNumInArray();
		int[] array= {0,3,1,2,3};
		findDuplicateNumInArray.printDuplicateNumInArray(array);
	}	
}	
