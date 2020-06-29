package barkhaPJun20;

public class FindMissingNumInArray {
	int arraySum=0;
	int originalSum=0;
	
	void printMissingNumInArray(int[] arrayNum) {
		for (int index=0; index<arrayNum.length; index++) {
			arraySum=arraySum+arrayNum[index];
		}
		for (int num=1; num<=10; num++) {
			originalSum=originalSum+num;
		}
		System.out.println("Missing number in Array 1-10 (Not in Sequence) is:" +(originalSum-arraySum));
	}		
	public static void main(String[] args) {
		FindMissingNumInArray findMissingNumInArray=new FindMissingNumInArray();
		int[] array= {2,3,5,4,7,1,9,8,10};
		findMissingNumInArray.printMissingNumInArray(array);
	}
}		
