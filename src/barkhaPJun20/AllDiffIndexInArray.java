package barkhaPJun20;

public class AllDiffIndexInArray {
	
	void allDiffIndex(int[] arr1,int[] arr2) {
		if (arr1.length==arr2.length) {
			for (int index=0; index<arr2.length; index++) {
				if (arr1[index]!=arr2[index]) {
					System.out.println("Both Arrays are not matching at Index:"+index);
				}
			}
		}else	
			System.out.println("Both Arrays are not matching.");
	}			
	public static void main(String[] args) {
		AllDiffIndexInArray firstDiffIndex=new AllDiffIndexInArray();
		int[] arr1= {10,2,9,14,3};
		int[] arr2= {10,2,18,14,13};
		
		firstDiffIndex.allDiffIndex(arr1, arr2);
		
		}

}
			
		
		
	
	
