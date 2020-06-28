package maheshKJun20;

public class IndexPairWithSumOfNum {
	
	void displayIndexPairWithSumOfNum(int[] intArray, int num) {
		for (int index=0; index<intArray.length-1;index++){
			for (int innerIndex=index+1;innerIndex<intArray.length;innerIndex++){
				if ((intArray[index] + intArray[innerIndex]) == num){
					System.out.println("(" + intArray[index] + ", " + intArray[innerIndex] + ")");
				}			
			}
		}
	}
	
	public static void main(String[] args) {
		IndexPairWithSumOfNum indexPairWithSumOfNum = new IndexPairWithSumOfNum();
		int numToCheck = 7;
		int[] intArray = {2, 4, 3, 5, 7, 8, 9 ,-1};
		indexPairWithSumOfNum.displayIndexPairWithSumOfNum(intArray, numToCheck);
	}

}
