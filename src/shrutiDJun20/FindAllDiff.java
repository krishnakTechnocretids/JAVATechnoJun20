package shrutiDJun20;

public class FindAllDiff {
	
	void findDiffInArr(int[] arr1, int[] arr2){
		int temp = 0;
		if(arr1.length==arr2.length){
			for(int index=0;index<arr1.length;index++){
				if(arr1[index]!=arr2[index]){
					temp =index;
				System.out.println("Values are not matching at index ->"+temp);
				}
			}
		}
	}
	public static void main(String[] args) {
		FindAllDiff findAllDiff = new FindAllDiff();
		int[] arr1={10,2,9,14,3};
		int[] arr2={10,2,18,14,13};
		findAllDiff.findDiffInArr(arr1, arr2);
	}
}
