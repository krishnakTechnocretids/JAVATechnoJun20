package archanaNJun20;

public class AllDifferIndex {
	static void differIndex(int[] arr1,int arr2[]){
		if(arr1.length==arr2.length) {
			for(int index =0; index <arr1.length; index++){
				if(arr1[index]!=arr2[index]){
					System.out.println("Values are not matching at index " +index);
				}
			}
		}
		else
			System.out.println("array are identical");
	}
	public static void main(String[] args) {

		int []arr1={10,2,9,14,3};
		int[] arr2={10,2,18,14,13};
		differIndex(arr1, arr2);
	}
}
