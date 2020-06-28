package vireshJJun20.Assignment19;

public class ArrayComparison { // returns the first mismatching index post comparing 2 arrays.
	int index= 0;
	boolean flag= true;
	boolean arrayIndex(int[] ar1, int[] ar2) {
		if (ar1.length==ar2.length) {
			for (int i= 0; i<ar2.length; i++) {
				if(ar1[i]!=ar2[i]) {
					flag= false;
					index= i;
					break;
				}
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		ArrayComparison arrayComparison= new ArrayComparison();
		int[] ar1 = {10,2,9,14,3};
		int[] ar2=  {10,2,18,14,3};
		boolean flag = arrayComparison.arrayIndex(ar1, ar2);
		if (flag==false)
			System.out.println("Values are not matching at index " + arrayComparison.index);
		else
			System.out.println("Both the arrays are identical");
	}
}
