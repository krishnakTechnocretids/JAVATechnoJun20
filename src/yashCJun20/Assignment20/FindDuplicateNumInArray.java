package yashCJun20.Assignment20;

public class FindDuplicateNumInArray {
	
	void toFindDuplicateNumInArray(int [] arr) {
		
		for (int i=0;i<arr.length;i++) {
			
			for (int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j])
					System.out.println("The duplicate number present in array is "+arr[j]);
				
			}
		}
	}

	public static void main(String[] args) {
		FindDuplicateNumInArray findDuplicateNumInArray=new FindDuplicateNumInArray();
		int [] arr= {0, 3,1, 2, 3,4};
		findDuplicateNumInArray.toFindDuplicateNumInArray(arr);

	}

}