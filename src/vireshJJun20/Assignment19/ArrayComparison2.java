package vireshJJun20.Assignment19;

public class ArrayComparison2 { //// returns the multiple mismatching indices post comparing 2 arrays.
	int index= 0;
	void arrayIndex(int[] ar1, int[] ar2) {
		if (ar1.length==ar2.length) {
			for (int i= 0; i<ar2.length; i++) {
				if(ar1[i]!=ar2[i]) {
					System.out.println("Values are not matching at index " + i);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayComparison2 arrayComparison= new ArrayComparison2();
		int[] ar1 = {10,2,9,14,3};
		int[] ar2=  {10,2,18,14,13};
		arrayComparison.arrayIndex(ar1, ar2);
	}
}
