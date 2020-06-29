package kartikeyDJune20;

public class DuplicateInIntArray {
	void duplicateNo(int[] input) {
		
		for(int index=0;index<input.length;index++) {
			for(int indexInner=index+1;indexInner<input.length;indexInner++) {
				if(input[index]==input[indexInner]) {
					System.out.println(input[index]+" is duplicate");
					break;					
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		DuplicateInIntArray duplicateInIntArray=new DuplicateInIntArray();
		int[] input= {0,3,1,2,3,2};
		duplicateInIntArray.duplicateNo(input);
	}

}
