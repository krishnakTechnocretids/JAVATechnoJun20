package shrutiDJun20;

public class MaxValueAtDiff {

	void maxDiffValue(int[] arr1, int[] arr2){
		int temp = 0;
		boolean flag = true;
		if(arr1.length==arr2.length){
			for(int index=0;index<arr1.length;index++){
				if(arr1[index]!=arr2[index]){
					temp =index;
					flag = false;
				System.out.println("Values are not matching at index ->"+temp);
				
				if(arr1[index]>arr2[index])
					System.out.println("From "+arr1[index]+" , "+arr2[index]+" max value is "+ arr1[index]);
				else 
					System.out.println("From "+arr1[index]+" , "+arr2[index]+" max value is "+ arr2[index]);
				//return;
			  }
			}
		}
		else
			System.out.println("Array length is not equal so cannot be compared");
		
		if(flag==true)
			System.out.println("Arrays are equal, No diff found");
	}
	
	public static void main(String[] args) {
		MaxValueAtDiff maxValueAtDiff = new MaxValueAtDiff();
		//int[] arr1={10,2,9,14,3};
	//	int[] arr2={10,2,18,14,13};
		
		int[] arr1={10,2,9,14,3,2,3,4};
		int[] arr2={10,2,9,14,3,5,6,7};
		
		maxValueAtDiff.maxDiffValue(arr1, arr2);
	}
}
