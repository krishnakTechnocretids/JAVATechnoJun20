package barkhaPJun20;

public class FindMissingNumInArray {
	
	void printMissingNumInArray(int[] num) {
		for (int index=0; index<num.length-1; index++) {
			
			if (num[index+1]!=num[index]+1) {
				System.out.println("Missing number in Array is: "+(num[index]+1));
				break;
				}
			}	
	}		
	public static void main(String[] args) {
		FindMissingNumInArray findMissingNumInArray=new FindMissingNumInArray();
		int[] array= {1,2,3,4,5,6,707,8,9,10};
		findMissingNumInArray.printMissingNumInArray(array);
	}
}
