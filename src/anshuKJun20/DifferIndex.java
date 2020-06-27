package anshuKJun20;

public class DifferIndex {
	void findDifferIndex() {
		int[] arr = {10,2,9,14,3};
		int[] arr1 = {10,2,18,14,3};
		if(arr.length == arr1.length)
		{
			for(int i = 0; i< arr.length;i++)
			{
				if(arr[i]!=(arr1[i]))
				{
					System.out.println(i+" index is not matching with another array");
					return;
				}  
				
			}
		}
		else
			System.out.println(" Arrays are not identical");
	}
	    public static void main(String[] args) {
		DifferIndex differindex = new DifferIndex();
		differindex.findDifferIndex();
	}
}
