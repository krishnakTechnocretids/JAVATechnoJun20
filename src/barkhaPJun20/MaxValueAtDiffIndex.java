package barkhaPJun20;

public class MaxValueAtDiffIndex {
	
	void maxValueAtDiffIndexofArray(int[] arr1, int [] arr2) {
		if (arr1.length==arr2.length) {
			
			for (int index=0; index<arr1.length; index++) {
				if (arr1[index]>arr2[index] ) {
					System.out.println("Biggest number at unmatching index "+index+" from ("+arr1[index]+","+arr2[index] +")" +" is: "+arr1[index]);
				}if (arr1[index]<arr2[index])	
					System.out.println("Biggest number at unmatching index "+index+" from ("+arr1[index]+","+arr2[index] +")" +" is: "+arr2[index]);
			}		
		}else
			System.out.println("Both Arrays are not matching.");		
	}
	public static void main(String[] args) {
		MaxValueAtDiffIndex maxValue=new MaxValueAtDiffIndex();
		int[] arr1= {10,12,9,14,3};
		int[] arr2= {10,2,18,14,3};
		
		maxValue.maxValueAtDiffIndexofArray(arr1, arr2);
		
	}
}	


			
				
			
			
		
		
	