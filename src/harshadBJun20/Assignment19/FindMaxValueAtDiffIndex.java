package harshadBJun20.Assignment19;

/*Program 4: Find max value at differed index.
              i/p:- arr1: {10,2,9,14,3}
                     arr2: {10,2,18,14,3}
              o/p :- Values are not matching at index -> 2, From (9,18) max value is 18*/
public class FindMaxValueAtDiffIndex {
	
	void findMaxValue(int[] a1, int[] a2) {
		if(a1.length == a2.length) {
			for(int index=0; index<a1.length;index++) {
				if(a1[index] != a2[index]) {
					System.out.println("Values are not matching at index -> "+index+" , From ("+a1[index]+","+a2[index]+") max value is " +Math.max(a1[index], a2[index]));
				}
			}
		}else
			System.out.println("Arrays are not matching");
	}
	public static void main(String[] args) {
		FindMaxValueAtDiffIndex findMaxValueAtDiffIndex = new FindMaxValueAtDiffIndex();
		int[] arr1 = {10,2,9,14,3};
		int[] arr2 = {10,2,18,14,3};
		findMaxValueAtDiffIndex.findMaxValue(arr1, arr2);
	}
}
