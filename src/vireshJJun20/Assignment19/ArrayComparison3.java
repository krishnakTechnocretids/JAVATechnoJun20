package vireshJJun20.Assignment19;

public class ArrayComparison3 { //// returns the maximum value from mismatching index post comparing 2 arrays.
	int index= 0;
	void arrayIndex(int[] ar1, int[] ar2) {
		if (ar1.length==ar2.length) {
			for (int i= 0; i<ar2.length; i++) {
				if(ar1[i]!=ar2[i]) {
					int max=0;
					if (ar1[i]> ar2[i]) {
						max= ar1[i];
					}	
					else {
						max= ar2[i];
					}
						System.out.println("Values are not matching at index " + i + ", from (" + ar1[i] + "," + ar2[i] + ") max value is " + max);
				}
			}
		}	
	}
	
	public static void main(String[] args) {
		ArrayComparison3 arrayComparison= new ArrayComparison3();
		int[] ar1 = {10,2,29,1,3};
		int[] ar2=  {10,2,18,14,3};
		arrayComparison.arrayIndex(ar1, ar2);
	}
}
