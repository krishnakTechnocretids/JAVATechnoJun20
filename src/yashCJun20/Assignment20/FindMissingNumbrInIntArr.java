package yashCJun20.Assignment20;

public class FindMissingNumbrInIntArr {
	
	int toFindMissingNumbrInIntArr(int [] arr) {
		
		int totalCntNbrReq=10;
		int addition =totalCntNbrReq*(totalCntNbrReq+1)/2;
		int remsum=0;
		
		for(int i=0;i<arr.length;i++) {
			
			remsum=remsum+arr[i];
				
			}
		int missingNbrInArray=addition-remsum;
		return missingNbrInArray;
		
	}

	public static void main(String[] args) {
		
		FindMissingNumbrInIntArr findMissingNumbrInIntArr = new FindMissingNumbrInIntArr();
		int arr1 [] = {1,2,3,4,5,6,7,8,9};
		int missingNbrInArray=0;
		missingNbrInArray=findMissingNumbrInIntArr.toFindMissingNumbrInIntArr(arr1);
		System.out.println("The missing number in an array is "+missingNbrInArray);

	}

}