package barkhaPJun20;

public class FindMissingNumInArray {
	int arraySum=0;
	int originalSum=0;
	//Method 1:Find Missing number by find difference in addition.
	void printMissingNumInArray(int[] arrayNum) {
		for (int index=0; index<arrayNum.length; index++) {
			arraySum=arraySum+arrayNum[index];
		}
		for (int num=1; num<=10; num++) {
			originalSum=originalSum+num;
		}
		System.out.println("Missing number in Array 1-10 (Not in Sequence) is:" +(originalSum-arraySum));
	}
	//Method2:Find Missing number by comparing (1-10) original array number with given array number (original 1 will compare all numbers in given array and so on).
	void printMissingNumInArray2(int[] arrayNum) {
		for (int num=1; num<=10; num++) {
			boolean flag=true;
			for (int index=0; index<arrayNum.length; index++) {
				if (num==arrayNum[index]) {
					flag=false;                 // if false then num is present in Array
				}
			}
			if (flag==true)
				System.out.println("Number "+num +" is missing in array of 1-10.");
		}
	}
	public static void main(String[] args) {
		FindMissingNumInArray findMissingNumInArray=new FindMissingNumInArray();
		int[] array= {2,3,5,4,7,1,9,8,10};
		//findMissingNumInArray.printMissingNumInArray(array);
		findMissingNumInArray.printMissingNumInArray2(array);
	}
}		
